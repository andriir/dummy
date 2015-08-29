package security;

import security.Executable;
import security.GlobalPermission;
import security.PermissionTypeGroup;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

/**
 * User: Roman Taluyev
 * Date: 29.01.15
 * Time: 16:56
 */
public enum PermissionTypeBlock {

    SALES((byte)0, PermissionTypeGroup.SALES_QUOTE,
          PermissionTypeGroup.SALES_ORDER,
          PermissionTypeGroup.SALES_DELIVERY,
          PermissionTypeGroup.SALES_INVOICE,
          PermissionTypeGroup.SALES_BY_CUSTOMER_REPORT,
          PermissionTypeGroup.SALES_RETURN,
          PermissionTypeGroup.SALES_RETURN_AUTHORISATION,
          PermissionTypeGroup.CUSTOMER,
          PermissionTypeGroup.CUSTOMER_TEMPLATE),

    PURCHASE((byte)0, PermissionTypeGroup.PURCHASE_ORDER,
             PermissionTypeGroup.PURCHASE_RECEIVAL,
             PermissionTypeGroup.PURCHASE_INVOICE,
             PermissionTypeGroup.PURCHASE_RETURN,
             PermissionTypeGroup.PURCHASE_RETURN_AUTHORISATION,
             PermissionTypeGroup.SUPPLIER,
             PermissionTypeGroup.SUPPLIER_TEMPLATE,
             PermissionTypeGroup.PURCHASE_BY_SUPPLIER_REPORT),

    INVENTORY((byte)0, PermissionTypeGroup.INVENTORY,
              PermissionTypeGroup.STOCKTAKE,
              PermissionTypeGroup.BILL_OF_MATERIAL,
              PermissionTypeGroup.REVALUATION,
              PermissionTypeGroup.INVENTORY_MOVEMENT,
              PermissionTypeGroup.INVENTORY_TEMPLATE,
              PermissionTypeGroup.PRODUCT_LIST_REPORT,
              PermissionTypeGroup.REORDER_REPORT,
              PermissionTypeGroup.PRODUCT_QUANTITY_BY_PRODUCT_REPORT,
              PermissionTypeGroup.SALES_BY_PRODUCT_REPORT,
              PermissionTypeGroup.PURCHASE_BY_PRODUCT_REPORT),

    WAREHOUSING((byte)0, PermissionTypeGroup.PICKING_SLIP,
                PermissionTypeGroup.PUT_AWAY,
                PermissionTypeGroup.LOCATION,
                PermissionTypeGroup.PRODUCT_QUANTITY_BY_LOCATION_REPORT,
                PermissionTypeGroup.PRODUCT_QUANTITY_BY_BIN_REPORT,
                PermissionTypeGroup.PRODUCT_MOVEMENT_REPORT),

    ASSEMBLY((byte)0, PermissionTypeGroup.PRODUCTION_ORDER),

    RECEIVABLES((byte)0, PermissionTypeGroup.CUSTOMER_RECEIPT,
                PermissionTypeGroup.SALES_CREDIT,
                PermissionTypeGroup.CUSTOMER_ADJUSTMENT,
                PermissionTypeGroup.CUSTOMER_AGED_BALANCE_REPORT,
                PermissionTypeGroup.CUSTOMER_STATEMENTS),

    PAYABLES((byte)0, PermissionTypeGroup.SUPPLIER_PAYMENT,
             PermissionTypeGroup.SUPPLIER_ADJUSTMENT,
             PermissionTypeGroup.SUPPLIER_AGED_BALANCE_REPORT,
             PermissionTypeGroup.PURCHASE_CREDIT),

    CONTACTS((byte)0, PermissionTypeGroup.CONTACT, PermissionTypeGroup.SALES_BY_REPRESENTATIVE_REPORT),

    FINANCE((byte)0, PermissionTypeGroup.BALANCE_SHEET_REPORT,
            PermissionTypeGroup.PROFIT_AND_LOSS_REPORT,
            PermissionTypeGroup.TRIAL_BALANCE_REPORT,
            PermissionTypeGroup.UNREALISED_BALANCE_SHEET_REPORT,
            PermissionTypeGroup.UNREALISED_GAIN_REPORT,
            PermissionTypeGroup.CHART_OF_ACCOUNTS_REPORT,
            PermissionTypeGroup.TAX_STATEMENT,
            PermissionTypeGroup.BANK_DEPOSIT,
            PermissionTypeGroup.BANK_STATEMENT,
            PermissionTypeGroup.BANK_TRANSFER,
            PermissionTypeGroup.FINANCIAL_ACCOUNT_TRANSACTION,
            PermissionTypeGroup.FINANCIAL_ACCOUNT,
            PermissionTypeGroup.GENERAL_PAYMENT,
            PermissionTypeGroup.GENERAL_RECEIPT,
            PermissionTypeGroup.GL_JOURNAL,
            PermissionTypeGroup.STANDING_GENERAL_JOURNAL),

    SETTINGS_GENERAL((byte)1, PermissionTypeGroup.COMPANY,
                     PermissionTypeGroup.DEPARTMENT,
                     PermissionTypeGroup.TRANSACTION_NUMBER,
                     PermissionTypeGroup.CUSTOM_REPORT_TYPE,
                     PermissionTypeGroup.REPORT_MANAGEMENT,
                     PermissionTypeGroup.COUNTRY),

    SETTINGS_TRADING((byte)1, PermissionTypeGroup.CONTACT_DETAIL_TYPE,
                     PermissionTypeGroup.TRADING_TERM,
                     PermissionTypeGroup.TRADING_POLICY,
                     PermissionTypeGroup.ADDRESS_TYPE,
                     PermissionTypeGroup.CONTACT_TYPE),

    SETTINGS_PRODUCT_AND_SERVICES((byte)1, PermissionTypeGroup.UNIT_OF_MEASURE,
                                  PermissionTypeGroup.WAREHOUSE_BIN_TYPE,
                                  PermissionTypeGroup.INVENTORY_ITEM_TYPE,
                                  PermissionTypeGroup.BIN_TYPE,
                                  PermissionTypeGroup.PRICE_SCALE,
                                  PermissionTypeGroup.DISCOUNT_SCALE),

    SETTINGS_GENERAL_LEDGER((byte)1, PermissionTypeGroup.GL_ACCOUNT,
                            PermissionTypeGroup.GL_ACCOUNT_TYPE,
                            PermissionTypeGroup.GL_ACCOUNT_CLASS),

    SETTINGS_FINANCIAL((byte)1, PermissionTypeGroup.CURRENCY,
                       PermissionTypeGroup.EXCHANGE_RATE,
                       PermissionTypeGroup.TENDER_TYPE,
                       PermissionTypeGroup.TAX_TYPE,
                       PermissionTypeGroup.TAX_CATEGORY,
                       PermissionTypeGroup.REPORTING_PERIOD_TYPE),

    SETTINGS_SECURITY((byte)1, PermissionTypeGroup.USER_ACCOUNT),

    SETTINGS_DATA((byte)1, PermissionTypeGroup.DATA_IMPORT, PermissionTypeGroup.DATA_EXPORT),

    SETTINGS((byte)0, SETTINGS_GENERAL, SETTINGS_TRADING, SETTINGS_PRODUCT_AND_SERVICES, SETTINGS_GENERAL_LEDGER, SETTINGS_FINANCIAL, SETTINGS_SECURITY, SETTINGS_DATA),

    GENERAL((byte)0, PermissionTypeGroup.EMAIL);

    private String messageCode = PermissionTypeBlock.class.getSimpleName() + "." + this.name();

    private byte level;

    private PermissionTypeBlock[] children = {};

    private PermissionTypeGroup[] groups = {};

    private GlobalPermission[] headers = {};

    private static PermissionTypeBlock[] rootElements = {SALES, PURCHASE, INVENTORY, WAREHOUSING, ASSEMBLY, RECEIVABLES, PAYABLES, CONTACTS, FINANCE, SETTINGS, GENERAL};

    PermissionTypeBlock(byte level, PermissionTypeBlock... children) {
        this.level = level;
        this.children = children;
    }

    PermissionTypeBlock(byte level, PermissionTypeGroup... groups) {
        this.level = level;
        this.groups = groups;

        final Set<GlobalPermission> headerSet = new TreeSet<GlobalPermission>(new Comparator<GlobalPermission>() {

            @Override
            public int compare(GlobalPermission o1, GlobalPermission o2) {
                return o1.compareTo(o2);
            }
        });

        for (PermissionTypeGroup group : groups) {
            for (GlobalPermission item : group.getPermissions()) {
                headerSet.add(item);
            }
        }

        headers = headerSet.toArray(new GlobalPermission[headerSet.size()]);
    }

    public String getMessageCode() {
        return messageCode;
    }

    public String getCode() {
        return this.name();
    }

    public byte getLevel() {
        return level;
    }

    public PermissionTypeBlock[] getChildren() {
        return children;
    }

    public PermissionTypeGroup[] getGroups() {
        return groups;
    }

    public static PermissionTypeBlock[] getRootElements() {
        return rootElements;
    }

    public boolean isRootElement(PermissionTypeBlock element) {
        return element.getLevel() == 0;
    }

    public BlockType getBlockType() {
        return children.length > 0 ? BlockType.CONTAINER : BlockType.HEADED_CONTAINER;
    }

    public GlobalPermission[] getHeaders() {
        if (getBlockType() == BlockType.CONTAINER) {
            //TODO throw new AccloudException("Container block does not have headers.");
        }

        return headers;
    }

    public static void scanElements(Executable<PermissionTypeBlock> executable) {
        scanElementsInner(executable, PermissionTypeBlock.getRootElements());
    }

    private static void scanElementsInner(Executable<PermissionTypeBlock> executable, PermissionTypeBlock[] parent) {
        for (PermissionTypeBlock item : parent) {
            executable.execute(item);
            scanElementsInner(executable, item.children);
        }
    }

    public static void printHeaders() {
        scanElements(new Executable<PermissionTypeBlock>() {
            @Override
            public void execute(PermissionTypeBlock item) {
                if (item.getBlockType() == BlockType.HEADED_CONTAINER) {

                    System.out.println(String.format("Block name: %s", item.name()));

                    for (GlobalPermission permission : item.getHeaders()) {
                        System.out.println(permission);
                    }

                    System.out.println();
                }
            }
        });
    }

    public static void main(String[] args) {
        printHeaders();
    }

}
