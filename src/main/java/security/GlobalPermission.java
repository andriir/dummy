package security;

/**
 * User: Roman Taluyev
 * Date: 03.02.15
 * Time: 15:51
 */
public enum GlobalPermission {
    READ,
    CREATE,
    UPDATE,
    VOID,
    PRINT,
    ALLOCATE,
    SEND,
    RESETDEFAULTREPORTS;

    private String messageCode = GlobalPermission.class.getSimpleName() + "." + this.name();

    public String getMessageCode() {
        return messageCode;
    }

}
