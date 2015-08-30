package Permissions;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Andrew Redko on 8/30/15.
 */
public class DPermission {
    private String name;
    public List<String> dependencies;
    public List<String> pages;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getDependencies() {
        return dependencies;
    }

    public void setDependencies(List<String> dependencies) {
        this.dependencies = dependencies;
    }

    public List<String> getPages() {
        return pages;
    }

    public void setPages(List<String> pages) {
        this.pages = pages;
    }
}
