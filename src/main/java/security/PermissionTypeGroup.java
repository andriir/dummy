package security;

import java.util.HashSet;
import java.util.Set;

/**
 * User: Roman Taluyev
 * Date: 29.01.15
 * Time: 16:56
 */
public enum PermissionTypeGroup {

    SALES_QUOTE,//Sales
    SALES_ORDER,//Sales
    SALES_DELIVERY,//Sales
    SALES_INVOICE,//Sales
    SALES_BY_CUSTOMER_REPORT,//Sales
    SALES_RETURN,//Sales
    SALES_RETURN_AUTHORISATION,//Sales
    CUSTOMER,//Sales
    CUSTOMER_TEMPLATE,//Sales

    PURCHASE_ORDER,//Purchase
    PURCHASE_RECEIVAL,//Purchase
    PURCHASE_INVOICE,//Purchase
    PURCHASE_RETURN,//Purchase
    PURCHASE_RETURN_AUTHORISATION,//Purchase
    SUPPLIER,//Purchase
    SUPPLIER_TEMPLATE,//Purchase
    PURCHASE_BY_SUPPLIER_REPORT,//Purchase

    INVENTORY,//Inventory
    STOCKTAKE,//Inventory
    BILL_OF_MATERIAL,//Inventory
    REVALUATION,//Inventory
    INVENTORY_MOVEMENT,//Inventory
    INVENTORY_TEMPLATE,//Inventory
    PRODUCT_LIST_REPORT,//Inventory
    REORDER_REPORT,//Inventory
    PRODUCT_QUANTITY_BY_PRODUCT_REPORT,//Inventory
    SALES_BY_PRODUCT_REPORT,//Inventory
    PURCHASE_BY_PRODUCT_REPORT,//Inventory

    PICKING_SLIP,//Warehousing
    PUT_AWAY,//Warehousing
    LOCATION,//Warehousing
    PRODUCT_QUANTITY_BY_LOCATION_REPORT,//Warehousing
    PRODUCT_QUANTITY_BY_BIN_REPORT,//Warehousing
    PRODUCT_MOVEMENT_REPORT,//Warehousing

    PRODUCTION_ORDER,//Assembly

    CUSTOMER_RECEIPT,//Receivables
    SALES_CREDIT,//Receivables
    CUSTOMER_ADJUSTMENT,//Receivables
    CUSTOMER_AGED_BALANCE_REPORT,//Receivables
    CUSTOMER_STATEMENTS,//Receivables

    SUPPLIER_PAYMENT,//Payables
    SUPPLIER_ADJUSTMENT,//Payables
    SUPPLIER_AGED_BALANCE_REPORT,//Payables
    PURCHASE_CREDIT,//Payables

    CONTACT,//Contacts
    SALES_BY_REPRESENTATIVE_REPORT,//Contacts

    BALANCE_SHEET_REPORT,//Finance
    PROFIT_AND_LOSS_REPORT,//Finance
    TRIAL_BALANCE_REPORT,//Finance
    UNREALISED_BALANCE_SHEET_REPORT,//Finance
    UNREALISED_GAIN_REPORT,//Finance
    CHART_OF_ACCOUNTS_REPORT,//Finance
    TAX_STATEMENT,//Finance
    BANK_DEPOSIT,//Finance
    BANK_STATEMENT,//Finance
    BANK_TRANSFER,//Finance
    FINANCIAL_ACCOUNT_TRANSACTION,//Finance
    FINANCIAL_ACCOUNT,//Finance
    GENERAL_PAYMENT,//Finance
    GENERAL_RECEIPT,//Finance
    GL_JOURNAL,//Finance
    STANDING_GENERAL_JOURNAL,//Finance

    COMPANY,//Settings_General
    DEPARTMENT,//Settings_General
    TRANSACTION_NUMBER,//Settings_General
    CUSTOM_REPORT_TYPE,//Settings_General
    REPORT_MANAGEMENT,//Settings_General
    COUNTRY,//Settings_General

    CONTACT_DETAIL_TYPE,//Settings_Trading
    TRADING_TERM,//Settings_Trading
    TRADING_POLICY,//Settings_Trading
    ADDRESS_TYPE,//Settings_Trading
    CONTACT_TYPE,//Settings_trading

    UNIT_OF_MEASURE,//Settings_Product_AND_Services
    WAREHOUSE_BIN_TYPE,//Settings_Product_AND_Services
    INVENTORY_ITEM_TYPE,//Settings_Product_AND_Services
    BIN_TYPE,//Settings_Product_AND_Services
    PRICE_SCALE,//Settings_Product_AND_Services
    DISCOUNT_SCALE,//Settings_Product_AND_Services

    GL_ACCOUNT,//Settings_General_Ledger
    GL_ACCOUNT_TYPE,//Settings_General_Ledger
    GL_ACCOUNT_CLASS,//Settings_General_Ledger

    CURRENCY,//Settings_Financial
    EXCHANGE_RATE,//Settings_Financial
    TENDER_TYPE,//Settings_Financial
    TAX_TYPE,//Settings_Financial
    TAX_CATEGORY,//Settings_Financial
    REPORTING_PERIOD_TYPE,//Settings_Financial

    USER_ACCOUNT,//Settings_Security

    DATA_IMPORT,//Settings_data
    DATA_EXPORT,

    EMAIL;//General

    private String messageCode = GlobalPermission.class.getSimpleName() + "." + this.name();

    public String getMessageCode() {
        return messageCode;
    }

    private Set<String> permissionTypes = new HashSet<String>();

    private Set<GlobalPermission> permissions = new HashSet<GlobalPermission>();

    public Set<String> getPermissionTypes() {
        return permissionTypes;
    }

    public Set<GlobalPermission> getPermissions() {
        return permissions;
    }

    PermissionTypeGroup() {
        PermissionType.scanPermissionTypesByGroupName(this.name(), new Executable<String>() {
            @Override
            public void execute(String item) {
                permissionTypes.add(item);
            }
        });

        PermissionType.scanPermissionsByGroupName(this.name(), new Executable<GlobalPermission>() {
            @Override
            public void execute(GlobalPermission item) {
                permissions.add(item);
            }
        });
    }

}
