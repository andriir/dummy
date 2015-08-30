package com.ap.dummyapp;

import Permissions.DPermission;
import Permissions.PermissionsToPagesStrings;
import security.GlobalPermission;
import security.PermissionType;
import security.PermissionTypeBlock;
import security.PermissionTypeGroup;

import java.io.*;
import java.util.*;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        Map<String, DPermission> map = groupPagesByPermissions(PermissionsToPagesStrings.all);

        FileWriter w = null;
        File fnew = new File("testcases_to_import.xml");
        try {
            w = new FileWriter(fnew, false);

            Set<String> dbSet = PermissionType.getPermissionTypes();

            w.append(String.format("<testsuite name=\"ALLOWED\" >\n"));

            for (PermissionTypeBlock rootElement : PermissionTypeBlock.values()) {
                if (rootElement == PermissionTypeBlock.SETTINGS) {
                    continue; //skip just settings
                }

                w.append(String.format("<testsuite name=\"%s\" >\n", rootElement.toString()));

                for (PermissionTypeGroup group : rootElement.getGroups()) {
                    for (GlobalPermission permission : rootElement.getHeaders()) {
                        String permName = group + "_" + permission;
                        //check if it is in the list of permissions
                        if (dbSet.contains(permName)) {
                            DPermission p = map.get(permName);
                            if (p != null) {
                                w.append(generateTestCase(p));
                            } else {
                                w.append(generateTestCase(permName));
                            }
                        }
                    }
                }

                w.append(String.format("</testsuite>\n"));

            }

            w.append(String.format("</testsuite>"));

            w.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static String generateTestCase(String permName) {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("<testcase name=\"%s - Allowed\">\n", permName));
        sb.append(String.format("</testcase>\n"));
        return sb.toString();
    }

    private static String generateTestCase(DPermission permission) {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("<testcase name=\"%s - Allowed\">\n", permission.getName()));
        //pages
        sb.append(String.format("\t<summary><![CDATA[<p>Pages:</p><ul>\n"));
        for (String s : permission.getPages()) {
            sb.append(String.format("\t<li>\t\t%s;</li>\n", s));
        }
        sb.append(String.format("</ul>]]></summary>\n"));

        //dependencies
        sb.append(String.format("\t<preconditions><![CDATA[<p>\n"));
        sb.append(String.format("\tsee description of parent &quot;Role Permissions&quot; suite</p>\n"));
        if (permission.getDependencies() != null) {
            sb.append(String.format("<p>\tDependent permissions:</p><ul>\n"));
            for (String s : permission.getDependencies()) {
                sb.append(String.format("\t<li>\t\t%s;</li>\n", s));
            }
        }
        sb.append(String.format("</ul>]]></preconditions>\n"));

        sb.append(String.format("</testcase>\n"));
        return sb.toString();
    }

    private static Map<String, DPermission> groupPagesByPermissions(String source) {
        //convert input to array
        List<DPermission> list = new ArrayList<DPermission>();
        String[] array = source.split("\n");
        for (String s : array) {
            String[] perArray = s.split(",");
            DPermission permission = new DPermission();
            permission.setName(perArray[0]);

            if (!perArray[1].isEmpty()) {
                permission.dependencies = Arrays.asList(perArray[1].split("; "));
            } else {
                permission.setDependencies(null);
            }

            if (!perArray[2].isEmpty()) {
                permission.pages = new ArrayList<String>(Arrays.asList(perArray[2].split("; ")));
            } else {
                permission.setPages(null);
            }
            list.add(permission);
        }

        //group pages by permission
        Map<String, DPermission> map = new HashMap<String, DPermission>();
        for (DPermission p : list) {
            DPermission mapP = map.get(p.getName());
            if (mapP == null) {
                map.put(p.getName(), p);
            } else {
                if (mapP != p) { //skip if the same permission
                    //replace with non-empty dependency
                    if (mapP.getDependencies() == null && p.getDependencies() != null) {
                        mapP.setDependencies(p.getDependencies());
                    }
                    //group pages
                    mapP.pages.add(p.getPages().get(0));
                }
            }
        }

        return map;
    }
}
