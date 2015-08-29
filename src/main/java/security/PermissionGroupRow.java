package security;

import security.EffectivePermissionStatus;
import security.GlobalPermission;

import java.util.HashMap;
import java.util.Map;

/**
 * User: Roman Taluyev
 * Date: 02.02.15
 * Time: 17:48
 */
public class PermissionGroupRow extends PermissionRow {

    Map<GlobalPermission, EffectivePermissionStatus> cells = new HashMap<GlobalPermission, EffectivePermissionStatus>();

    public Map<GlobalPermission, EffectivePermissionStatus> getCells() {
        return cells;
    }

}
