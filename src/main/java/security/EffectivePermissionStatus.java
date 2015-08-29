package security;

/**
 * User: Roman Taluyev
 * Date: 02.02.15
 * Time: 12:53
 */
public class EffectivePermissionStatus {

    private String permissionName;
    private Boolean rolesPermissionEnabled;
    private UserPermissionState userPermissionState;

//    public EffectivePermissionStatus(String permissionName, boolean enabledForRole, boolean enabledForUser, boolean disabledForUser) {
//        this.permissionName = permissionName;
//        rolesPermissionState =  enabledForRole ? RolePermissionState.ENABLED : RolePermissionState.DISABLED;
//
//        if (!enabledForUser && !disabledForUser) {
//            userPermissionState = UserPermissionState.EMPTY;
//        } else if (enabledForUser && disabledForUser) {
//            //Yes, it must not be possible but let's keep product working for user and not raise error
//            userPermissionState = UserPermissionState.DISABLED;
//        } else if (enabledForUser && !disabledForUser) {
//            userPermissionState = UserPermissionState.ENABLED;
//        } else if (!enabledForUser && disabledForUser) {
//            userPermissionState = UserPermissionState.DISABLED;
//        }
//    }


    public EffectivePermissionStatus() {

    }

    public EffectivePermissionStatus(String permissionName, int enabledForRole, int enabledForUser, int disabledForUser) {
        this.permissionName = permissionName;
        rolesPermissionEnabled =  enabledForRole == 1 ? Boolean.TRUE : Boolean.FALSE;

        if (enabledForUser != 1 && disabledForUser != 1) {
            userPermissionState = UserPermissionState.EMPTY;
        } else if (enabledForUser == 1 && disabledForUser == 1) {
            //Yes, it must not be possible but let's keep product working for user and not raise error
            userPermissionState = UserPermissionState.DISABLED;
        } else if (enabledForUser == 1 && disabledForUser != 1) {
            userPermissionState = UserPermissionState.ENABLED;
        } else if (enabledForUser != 1 && disabledForUser == 1) {
            userPermissionState = UserPermissionState.DISABLED;
        }
    }

    public String getPermissionName() {
        return permissionName;
    }

    public void setPermissionName(String permissionName) {
        this.permissionName = permissionName;
    }

    public Boolean getRolesPermissionEnabled() {
        return rolesPermissionEnabled;
    }

    public void setRolesPermissionEnabled(Boolean rolesPermissionEnabled) {
        this.rolesPermissionEnabled = rolesPermissionEnabled;
    }

    public UserPermissionState getUserPermissionState() {
        return userPermissionState;
    }

    public void setUserPermissionState(UserPermissionState userPermissionState) {
        this.userPermissionState = userPermissionState;
    }

    public boolean getEnabled() {
        if (userPermissionState == UserPermissionState.DISABLED) {
            return false;
        } else if (userPermissionState == UserPermissionState.ENABLED) {
            return true;
        } else if (rolesPermissionEnabled) {
            return true;
        } else {
            return false;
        }
    }
}
