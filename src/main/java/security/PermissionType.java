package security;

import java.lang.reflect.Field;
import java.util.HashSet;
import java.util.Set;

/**
 * The enum is holder for user permissions, which describes each type of access.
 *
 * User: Sergii Iasinoviy
 * Date: 23.12.14
 * Time: 16:54
 */
public class PermissionType {

    // Sales Order permission types.
    public static final String SALES_ORDER_READ = "SALES_ORDER_READ";
    public static final String SALES_ORDER_CREATE = "SALES_ORDER_CREATE";
    public static final String SALES_ORDER_UPDATE = "SALES_ORDER_UPDATE";
    public static final String SALES_ORDER_VOID = "SALES_ORDER_VOID";

    // Sales Invoice permission types.
    public static final String SALES_INVOICE_READ = "SALES_INVOICE_READ";
    public static final String SALES_INVOICE_CREATE = "SALES_INVOICE_CREATE";
    public static final String SALES_INVOICE_VOID = "SALES_INVOICE_VOID";
    public static final String SALES_INVOICE_ALLOCATE = "SALES_INVOICE_ALLOCATE";

    // Sales Quote permission types.
    public static final String SALES_QUOTE_READ = "SALES_QUOTE_READ";
    public static final String SALES_QUOTE_CREATE = "SALES_QUOTE_CREATE";
    public static final String SALES_QUOTE_UPDATE = "SALES_QUOTE_UPDATE";
    public static final String SALES_QUOTE_VOID = "SALES_QUOTE_VOID";

    // Sales Delivery permission types.
    public static final String SALES_DELIVERY_READ = "SALES_DELIVERY_READ";
    public static final String SALES_DELIVERY_CREATE = "SALES_DELIVERY_CREATE";
    public static final String SALES_DELIVERY_UPDATE = "SALES_DELIVERY_UPDATE";
    public static final String SALES_DELIVERY_VOID = "SALES_DELIVERY_VOID";

    // Sales Return Authorisations permission types.
    public static final String SALES_RETURN_AUTHORISATION_READ = "SALES_RETURN_AUTHORISATION_READ";
    public static final String SALES_RETURN_AUTHORISATION_CREATE = "SALES_RETURN_AUTHORISATION_CREATE";
    public static final String SALES_RETURN_AUTHORISATION_UPDATE = "SALES_RETURN_AUTHORISATION_UPDATE";
    public static final String SALES_RETURN_AUTHORISATION_VOID = "SALES_RETURN_AUTHORISATION_VOID";

    // Sales Returns permission types.
    public static final String SALES_RETURN_READ = "SALES_RETURN_READ";
    public static final String SALES_RETURN_CREATE = "SALES_RETURN_CREATE";
    public static final String SALES_RETURN_UPDATE = "SALES_RETURN_UPDATE";
    public static final String SALES_RETURN_VOID = "SALES_RETURN_VOID";

    // Sales Credit permission types.
    public static final String SALES_CREDIT_READ = "SALES_CREDIT_READ";
    public static final String SALES_CREDIT_CREATE = "SALES_CREDIT_CREATE";
    public static final String SALES_CREDIT_VOID = "SALES_CREDIT_VOID";
    public static final String SALES_CREDIT_ALLOCATE = "SALES_CREDIT_ALLOCATE";

    // Customers permission types.
    public static final String CUSTOMER_READ = "CUSTOMER_READ";
    public static final String CUSTOMER_BALANCE_READ = "CUSTOMER_BALANCE_READ";
    public static final String CUSTOMER_CREATE = "CUSTOMER_CREATE";
    public static final String CUSTOMER_UPDATE = "CUSTOMER_UPDATE";

    // Customer templates permission types.
    public static final String CUSTOMER_TEMPLATE_READ = "CUSTOMER_TEMPLATE_READ";
    public static final String CUSTOMER_TEMPLATE_CREATE = "CUSTOMER_TEMPLATE_CREATE";
    public static final String CUSTOMER_TEMPLATE_UPDATE = "CUSTOMER_TEMPLATE_UPDATE";

    // Purchase Order permission types.
    public static final String PURCHASE_ORDER_READ = "PURCHASE_ORDER_READ";
    public static final String PURCHASE_ORDER_CREATE = "PURCHASE_ORDER_CREATE";
    public static final String PURCHASE_ORDER_UPDATE = "PURCHASE_ORDER_UPDATE";
    public static final String PURCHASE_ORDER_VOID = "PURCHASE_ORDER_VOID";

    // Purchase Invoice permission types.
    public static final String PURCHASE_INVOICE_READ = "PURCHASE_INVOICE_READ";
    public static final String PURCHASE_INVOICE_CREATE = "PURCHASE_INVOICE_CREATE";
    public static final String PURCHASE_INVOICE_ALLOCATE = "PURCHASE_INVOICE_ALLOCATE";
    public static final String PURCHASE_INVOICE_VOID = "PURCHASE_INVOICE_VOID";

    // Purchase Credit permission types.
    public static final String PURCHASE_CREDIT_READ = "PURCHASE_CREDIT_READ";
    public static final String PURCHASE_CREDIT_CREATE = "PURCHASE_CREDIT_CREATE";
    public static final String PURCHASE_CREDIT_ALLOCATE = "PURCHASE_CREDIT_ALLOCATE";
    public static final String PURCHASE_CREDIT_VOID = "PURCHASE_CREDIT_VOID";

    // Purchase Receival permission types.
    public static final String PURCHASE_RECEIVAL_READ = "PURCHASE_RECEIVAL_READ";
    public static final String PURCHASE_RECEIVAL_CREATE = "PURCHASE_RECEIVAL_CREATE";
    public static final String PURCHASE_RECEIVAL_UPDATE = "PURCHASE_RECEIVAL_UPDATE";
    public static final String PURCHASE_RECEIVAL_VOID = "PURCHASE_RECEIVAL_VOID";

    // Purchase Return Authorisation permission types.
    public static final String PURCHASE_RETURN_AUTHORISATION_READ = "PURCHASE_RETURN_AUTHORISATION_READ";
    public static final String PURCHASE_RETURN_AUTHORISATION_CREATE = "PURCHASE_RETURN_AUTHORISATION_CREATE";
    public static final String PURCHASE_RETURN_AUTHORISATION_UPDATE = "PURCHASE_RETURN_AUTHORISATION_UPDATE";
    public static final String PURCHASE_RETURN_AUTHORISATION_VOID = "PURCHASE_RETURN_AUTHORISATION_VOID";

    // Purchase Return permission types.
    public static final String PURCHASE_RETURN_READ = "PURCHASE_RETURN_READ";
    public static final String PURCHASE_RETURN_CREATE = "PURCHASE_RETURN_CREATE";
    public static final String PURCHASE_RETURN_UPDATE = "PURCHASE_RETURN_UPDATE";
    public static final String PURCHASE_RETURN_VOID = "PURCHASE_RETURN_VOID";

    // Supplier permission types.
    public static final String SUPPLIER_READ = "SUPPLIER_READ";
    public static final String SUPPLIER_CREATE = "SUPPLIER_CREATE";
    public static final String SUPPLIER_UPDATE = "SUPPLIER_UPDATE";
    public static final String SUPPLIER_BALANCE_READ = "SUPPLIER_BALANCE_READ";

    // Supplier template permission types.
    public static final String SUPPLIER_TEMPLATE_READ = "SUPPLIER_TEMPLATE_READ";
    public static final String SUPPLIER_TEMPLATE_CREATE = "SUPPLIER_TEMPLATE_CREATE";
    public static final String SUPPLIER_TEMPLATE_UPDATE = "SUPPLIER_TEMPLATE_UPDATE";

    // Inventory Item permission types.
    public static final String INVENTORY_READ = "INVENTORY_READ";
    public static final String INVENTORY_CREATE = "INVENTORY_CREATE";
    public static final String INVENTORY_UPDATE = "INVENTORY_UPDATE";
    public static final String INVENTORY_BALANCE_READ = "INVENTORY_BALANCE_READ";

    // Bill of materials permission types.
    public static final String BILL_OF_MATERIAL_READ = "BILL_OF_MATERIAL_READ";
    public static final String BILL_OF_MATERIAL_CREATE = "BILL_OF_MATERIAL_CREATE";
    public static final String BILL_OF_MATERIAL_UPDATE = "BILL_OF_MATERIAL_UPDATE";

    // Revaluation permission types.
    public static final String REVALUATION_CREATE = "REVALUATION_CREATE";

    // Inventory Movements permission types.
    public static final String INVENTORY_MOVEMENT_READ = "INVENTORY_MOVEMENT_READ";
    public static final String INVENTORY_MOVEMENT_CREATE = "INVENTORY_MOVEMENT_CREATE";
    public static final String INVENTORY_MOVEMENT_VOID = "INVENTORY_MOVEMENT_VOID";

    // Inventory Item Template permission types.
    public static final String INVENTORY_TEMPLATE_READ = "INVENTORY_TEMPLATE_READ";
    public static final String INVENTORY_TEMPLATE_CREATE = "INVENTORY_TEMPLATE_CREATE";
    public static final String INVENTORY_TEMPLATE_UPDATE = "INVENTORY_TEMPLATE_UPDATE";

    //Location permission types.
    public static final String LOCATION_BALANCE_READ = "LOCATION_BALANCE_READ";
    public static final String LOCATION_READ = "LOCATION_READ";
    public static final String LOCATION_CREATE = "LOCATION_CREATE";
    public static final String LOCATION_UPDATE = "LOCATION_UPDATE";

    //Picking Slip permission types.
    public static final String PICKING_SLIP_READ = "PICKING_SLIP_READ";
    public static final String PICKING_SLIP_CREATE = "PICKING_SLIP_CREATE";
    public static final String PICKING_SLIP_UPDATE = "PICKING_SLIP_UPDATE";

    //Put Away Slip permission types.
    public static final String PUT_AWAY_READ = "PUT_AWAY_READ";
    public static final String PUT_AWAY_CREATE = "PUT_AWAY_CREATE";
    public static final String PUT_AWAY_UPDATE = "PUT_AWAY_UPDATE";

    //Stocktake permission types.
    public static final String STOCKTAKE_READ = "STOCKTAKE_READ";
    public static final String STOCKTAKE_CREATE = "STOCKTAKE_CREATE";
    public static final String STOCKTAKE_UPDATE = "STOCKTAKE_UPDATE";

    // Customer Receipts permission types.
    public static final String CUSTOMER_RECEIPT_READ = "CUSTOMER_RECEIPT_READ";
    public static final String CUSTOMER_RECEIPT_CREATE = "CUSTOMER_RECEIPT_CREATE";
    public static final String CUSTOMER_RECEIPT_ALLOCATE = "CUSTOMER_RECEIPT_ALLOCATE";
    public static final String CUSTOMER_RECEIPT_VOID = "CUSTOMER_RECEIPT_VOID";

    // Customer Adjustments permission types.
    public static final String CUSTOMER_ADJUSTMENT_READ = "CUSTOMER_ADJUSTMENT_READ";
    public static final String CUSTOMER_ADJUSTMENT_CREATE = "CUSTOMER_ADJUSTMENT_CREATE";
    public static final String CUSTOMER_ADJUSTMENT_ALLOCATE = "CUSTOMER_ADJUSTMENT_ALLOCATE";
    public static final String CUSTOMER_ADJUSTMENT_VOID = "CUSTOMER_ADJUSTMENT_VOID";

    //Supplier Payment permission types.
    public static final String SUPPLIER_PAYMENT_READ = "SUPPLIER_PAYMENT_READ";
    public static final String SUPPLIER_PAYMENT_CREATE = "SUPPLIER_PAYMENT_CREATE";
    public static final String SUPPLIER_PAYMENT_ALLOCATE = "SUPPLIER_PAYMENT_ALLOCATE";
    public static final String SUPPLIER_PAYMENT_VOID = "SUPPLIER_PAYMENT_VOID";

    //Supplier Adjustment permission types.
    public static final String SUPPLIER_ADJUSTMENT_READ = "SUPPLIER_ADJUSTMENT_READ";
    public static final String SUPPLIER_ADJUSTMENT_CREATE = "SUPPLIER_ADJUSTMENT_CREATE";
    public static final String SUPPLIER_ADJUSTMENT_ALLOCATE = "SUPPLIER_ADJUSTMENT_ALLOCATE";
    public static final String SUPPLIER_ADJUSTMENT_VOID = "SUPPLIER_ADJUSTMENT_VOID";

    // Production Order permission types
    public static final String PRODUCTION_ORDER_READ = "PRODUCTION_ORDER_READ";
    public static final String PRODUCTION_ORDER_CREATE = "PRODUCTION_ORDER_CREATE";
    public static final String PRODUCTION_ORDER_UPDATE = "PRODUCTION_ORDER_UPDATE";

    // Contact permission types.
    public static final String CONTACT_READ = "CONTACT_READ";
    public static final String CONTACT_CREATE = "CONTACT_CREATE";
    public static final String CONTACT_UPDATE = "CONTACT_UPDATE";

    //Bin type
    public static final String BIN_TYPE_READ = "BIN_TYPE_READ";
    public static final String BIN_TYPE_CREATE = "BIN_TYPE_CREATE";
    public static final String BIN_TYPE_UPDATE = "BIN_TYPE_UPDATE";

    /** --------------------------------- REPORTS --------------------------------------------*/

    //Customer Statement permission types.
    public static final String CUSTOMER_STATEMENTS_PRINT = "CUSTOMER_STATEMENTS_PRINT";

    //Product Quantity by Bin permission types.
    public static final String PRODUCT_QUANTITY_BY_BIN_REPORT_PRINT = "PRODUCT_QUANTITY_BY_BIN_REPORT_PRINT";

    //Product Quantity by Location permission types.
    public static final String PRODUCT_QUANTITY_BY_LOCATION_REPORT_PRINT = "PRODUCT_QUANTITY_BY_LOCATION_REPORT_PRINT";

    //Sales By Customer Report permission types.
    public static final String SALES_BY_CUSTOMER_REPORT_PRINT = "SALES_BY_CUSTOMER_REPORT_PRINT";

    //Purchase By Supplier Report permission types.
    public static final String PURCHASE_BY_SUPPLIER_REPORT_PRINT = "PURCHASE_BY_SUPPLIER_REPORT_PRINT";

    //Purchase By Product Report permission types.
    public static final String PURCHASE_BY_PRODUCT_REPORT_PRINT = "PURCHASE_BY_PRODUCT_REPORT_PRINT";

    //Supplier Aged Balance Report permission types.
    public static final String SUPPLIER_AGED_BALANCE_REPORT_PRINT = "SUPPLIER_AGED_BALANCE_REPORT_PRINT";

    //Customer Aged Balance Report permission types.
    public static final String CUSTOMER_AGED_BALANCE_REPORT_PRINT = "CUSTOMER_AGED_BALANCE_REPORT_PRINT";

    //Product List Report permission types.
    public static final String PRODUCT_LIST_REPORT_PRINT = "PRODUCT_LIST_REPORT_PRINT";

    // Reorder Report permission types.
    public static final String REORDER_REPORT_PRINT = "REORDER_REPORT_PRINT";

    // Product Movement permission types.
    public static final String PRODUCT_MOVEMENT_REPORT_PRINT = "PRODUCT_MOVEMENT_REPORT_PRINT";

    // Product Quantity By Product permission types.
    public static final String PRODUCT_QUANTITY_BY_PRODUCT_REPORT_PRINT = "PRODUCT_QUANTITY_BY_PRODUCT_REPORT_PRINT";

    // Sales By Representative permission types.
    public static final String SALES_BY_REPRESENTATIVE_REPORT_PRINT = "SALES_BY_REPRESENTATIVE_REPORT_PRINT";

    //Sales Report Options permission types.
    public static final String SALES_BY_PRODUCT_REPORT_PRINT = "SALES_BY_PRODUCT_REPORT_PRINT";

    //Balance Sheet Report
    public static final String BALANCE_SHEET_REPORT_PRINT = "BALANCE_SHEET_REPORT_PRINT";

    //Profit And Loss Report
    public static final String PROFIT_AND_LOSS_REPORT_PRINT = "PROFIT_AND_LOSS_REPORT_PRINT";

    //Trial Balance Report
    public static final String TRIAL_BALANCE_REPORT_PRINT = "TRIAL_BALANCE_REPORT_PRINT";

    //Unrealised Balance Sheet Report
    public static final String UNREALISED_BALANCE_SHEET_REPORT_PRINT = "UNREALISED_BALANCE_SHEET_REPORT_PRINT";

    //Unrealised Gain Report
    public static final String UNREALISED_GAIN_REPORT_PRINT = "UNREALISED_GAIN_REPORT_PRINT";

    //Chart Of Accounts Report
    public static final String CHART_OF_ACCOUNTS_REPORT_PRINT = "CHART_OF_ACCOUNTS_REPORT_PRINT";

    /** --------------------------------- OTHER PERMISSIONS --------------------------------------------*/

    //Sales Report Options permission types.
    public static final String EMAIL_SEND = "EMAIL_SEND";

    //Company
    public static final String COMPANY_READ = "COMPANY_READ";
    public static final String COMPANY_CREATE = "COMPANY_CREATE";
    public static final String COMPANY_UPDATE = "COMPANY_UPDATE";

    //GL Account
    public static final String GL_ACCOUNT_READ = "GL_ACCOUNT_READ";
    public static final String GL_ACCOUNT_CREATE = "GL_ACCOUNT_CREATE";
    public static final String GL_ACCOUNT_UPDATE = "GL_ACCOUNT_UPDATE";

    //Currency
    public static final String CURRENCY_READ = "CURRENCY_READ";
    public static final String CURRENCY_CREATE = "CURRENCY_CREATE";
    public static final String CURRENCY_UPDATE = "CURRENCY_UPDATE";

    //Country
    public static final String COUNTRY_READ = "COUNTRY_READ";
    public static final String COUNTRY_CREATE = "COUNTRY_CREATE";
    public static final String COUNTRY_UPDATE = "COUNTRY_UPDATE";

    //AddressType
    public static final String ADDRESS_TYPE_READ = "ADDRESS_TYPE_READ";
    public static final String ADDRESS_TYPE_CREATE = "ADDRESS_TYPE_CREATE";
    public static final String ADDRESS_TYPE_UPDATE = "ADDRESS_TYPE_UPDATE";

    //ContactDetailType
    public static final String CONTACT_DETAIL_TYPE_READ = "CONTACT_DETAIL_TYPE_READ";
    public static final String CONTACT_DETAIL_TYPE_CREATE = "CONTACT_DETAIL_TYPE_CREATE";
    public static final String CONTACT_DETAIL_TYPE_UPDATE = "CONTACT_DETAIL_TYPE_UPDATE";

    //WarehouseBinType
    public static final String WAREHOUSE_BIN_TYPE_READ = "WAREHOUSE_BIN_TYPE_READ";
    public static final String WAREHOUSE_BIN_TYPE_CREATE = "WAREHOUSE_BIN_TYPE_CREATE";
    public static final String WAREHOUSE_BIN_TYPE_UPDATE = "WAREHOUSE_BIN_TYPE_UPDATE";

    //Department
    public static final String DEPARTMENT_READ = "DEPARTMENT_READ";
    public static final String DEPARTMENT_CREATE = "DEPARTMENT_CREATE";
    public static final String DEPARTMENT_UPDATE = "DEPARTMENT_UPDATE";

    //Transaction number
    public static final String TRANSACTION_NUMBER_READ = "TRANSACTION_NUMBER_READ";
    public static final String TRANSACTION_NUMBER_CREATE = "TRANSACTION_NUMBER_CREATE";
    public static final String TRANSACTION_NUMBER_UPDATE = "TRANSACTION_NUMBER_UPDATE";

    //CustomReportType
    public static final String CUSTOM_REPORT_TYPE_READ = "CUSTOM_REPORT_TYPE_READ";
    public static final String CUSTOM_REPORT_TYPE_CREATE = "CUSTOM_REPORT_TYPE_CREATE";
    public static final String CUSTOM_REPORT_TYPE_UPDATE = "CUSTOM_REPORT_TYPE_UPDATE";

    //ReportManagement
    public static final String REPORT_MANAGEMENT_RESETDEFAULTREPORTS = "REPORT_MANAGEMENT_RESETDEFAULTREPORTS";

    //GL Account Type
    public static final String GL_ACCOUNT_TYPE_READ = "GL_ACCOUNT_TYPE_READ";
    public static final String GL_ACCOUNT_TYPE_CREATE = "GL_ACCOUNT_TYPE_CREATE";
    public static final String GL_ACCOUNT_TYPE_UPDATE = "GL_ACCOUNT_TYPE_UPDATE";

    //GL Account Class
    public static final String GL_ACCOUNT_CLASS_READ = "GL_ACCOUNT_CLASS_READ";
    public static final String GL_ACCOUNT_CLASS_CREATE = "GL_ACCOUNT_CLASS_CREATE";
    public static final String GL_ACCOUNT_CLASS_UPDATE = "GL_ACCOUNT_CLASS_UPDATE";

    //Trading Term
    public static final String TRADING_TERM_READ = "TRADING_TERM_READ";
    public static final String TRADING_TERM_CREATE = "TRADING_TERM_CREATE";
    public static final String TRADING_TERM_UPDATE = "TRADING_TERM_UPDATE";

    //Trading Policy
    public static final String TRADING_POLICY_READ = "TRADING_POLICY_READ";
    public static final String TRADING_POLICY_CREATE = "TRADING_POLICY_CREATE";
    public static final String TRADING_POLICY_UPDATE = "TRADING_POLICY_UPDATE";

    //Exchange Rate
    public static final String EXCHANGE_RATE_READ = "EXCHANGE_RATE_READ";
    public static final String EXCHANGE_RATE_CREATE = "EXCHANGE_RATE_CREATE";
    public static final String EXCHANGE_RATE_UPDATE = "EXCHANGE_RATE_UPDATE";

    //Tender Type
    public static final String TENDER_TYPE_READ = "TENDER_TYPE_READ";
    public static final String TENDER_TYPE_CREATE = "TENDER_TYPE_CREATE";
    public static final String TENDER_TYPE_UPDATE = "TENDER_TYPE_UPDATE";

    //Tax Type
    public static final String TAX_TYPE_READ = "TAX_TYPE_READ";
    public static final String TAX_TYPE_CREATE = "TAX_TYPE_CREATE";
    public static final String TAX_TYPE_UPDATE = "TAX_TYPE_UPDATE";

    //Tax Statement
    public static final String TAX_STATEMENT_READ = "TAX_STATEMENT_READ";
    public static final String TAX_STATEMENT_CREATE = "TAX_STATEMENT_CREATE";
    public static final String TAX_STATEMENT_UPDATE = "TAX_STATEMENT_UPDATE";

    //Tax Category
    public static final String TAX_CATEGORY_READ = "TAX_CATEGORY_READ";
    public static final String TAX_CATEGORY_CREATE = "TAX_CATEGORY_CREATE";
    public static final String TAX_CATEGORY_UPDATE = "TAX_CATEGORY_UPDATE";

    //Reporting Period Type
    public static final String REPORTING_PERIOD_TYPE_READ = "REPORTING_PERIOD_TYPE_READ";
    public static final String REPORTING_PERIOD_TYPE_CREATE = "REPORTING_PERIOD_TYPE_CREATE";
    public static final String REPORTING_PERIOD_TYPE_UPDATE = "REPORTING_PERIOD_TYPE_UPDATE";

    //Unit Of Measure
    public static final String UNIT_OF_MEASURE_READ = "UNIT_OF_MEASURE_READ";
    public static final String UNIT_OF_MEASURE_CREATE = "UNIT_OF_MEASURE_CREATE";
    public static final String UNIT_OF_MEASURE_UPDATE = "UNIT_OF_MEASURE_UPDATE";

    //Inventory Item Type
    public static final String INVENTORY_ITEM_TYPE_READ = "INVENTORY_ITEM_TYPE_READ";
    public static final String INVENTORY_ITEM_TYPE_CREATE = "INVENTORY_ITEM_TYPE_CREATE";
    public static final String INVENTORY_ITEM_TYPE_UPDATE = "INVENTORY_ITEM_TYPE_UPDATE";

    //Price Scale
    public static final String PRICE_SCALE_READ = "PRICE_SCALE_READ";
    public static final String PRICE_SCALE_CREATE = "PRICE_SCALE_CREATE";
    public static final String PRICE_SCALE_UPDATE = "PRICE_SCALE_UPDATE";

    //Discount Scale
    public static final String DISCOUNT_SCALE_READ = "DISCOUNT_SCALE_READ";
    public static final String DISCOUNT_SCALE_CREATE = "DISCOUNT_SCALE_CREATE";
    public static final String DISCOUNT_SCALE_UPDATE = "DISCOUNT_SCALE_UPDATE";

    //User Account
    public static final String USER_ACCOUNT_READ = "USER_ACCOUNT_READ";
    public static final String USER_ACCOUNT_CREATE = "USER_ACCOUNT_CREATE";
    public static final String USER_ACCOUNT_UPDATE = "USER_ACCOUNT_UPDATE";

    //Bank Deposit
    public static final String BANK_DEPOSIT_READ = "BANK_DEPOSIT_READ";
    public static final String BANK_DEPOSIT_CREATE = "BANK_DEPOSIT_CREATE";
    public static final String BANK_DEPOSIT_UPDATE = "BANK_DEPOSIT_UPDATE";
    public static final String BANK_DEPOSIT_VOID = "BANK_DEPOSIT_VOID";

    //Bank Statement
    public static final String BANK_STATEMENT_READ = "BANK_STATEMENT_READ";
    public static final String BANK_STATEMENT_CREATE = "BANK_STATEMENT_CREATE";
    public static final String BANK_STATEMENT_UPDATE = "BANK_STATEMENT_UPDATE";

    //Bank Transfer
    public static final String BANK_TRANSFER_READ = "BANK_TRANSFER_READ";
    public static final String BANK_TRANSFER_CREATE = "BANK_TRANSFER_CREATE";
    public static final String BANK_TRANSFER_VOID = "BANK_TRANSFER_VOID";

    //ContactType
    public static final String CONTACT_TYPE_READ = "CONTACT_TYPE_READ";
    public static final String CONTACT_TYPE_CREATE = "CONTACT_TYPE_CREATE";
    public static final String CONTACT_TYPE_UPDATE = "CONTACT_TYPE_UPDATE";

    //Financial Account
    public static final String FINANCIAL_ACCOUNT_READ = "FINANCIAL_ACCOUNT_READ";
    public static final String FINANCIAL_ACCOUNT_CREATE = "FINANCIAL_ACCOUNT_CREATE";
    public static final String FINANCIAL_ACCOUNT_UPDATE = "FINANCIAL_ACCOUNT_UPDATE";

    //Financial account transaction
    public static final String FINANCIAL_ACCOUNT_TRANSACTION_READ = "FINANCIAL_ACCOUNT_TRANSACTION_READ";
    public static final String FINANCIAL_ACCOUNT_TRANSACTION_CREATE = "FINANCIAL_ACCOUNT_TRANSACTION_CREATE";
    public static final String FINANCIAL_ACCOUNT_TRANSACTION_UPDATE = "FINANCIAL_ACCOUNT_TRANSACTION_UPDATE";

    //General Payment
    public static final String GENERAL_PAYMENT_READ = "GENERAL_PAYMENT_READ";
    public static final String GENERAL_PAYMENT_CREATE = "GENERAL_PAYMENT_CREATE";
    public static final String GENERAL_PAYMENT_VOID = "GENERAL_PAYMENT_VOID";

    //General Receipt
    public static final String GENERAL_RECEIPT_READ = "GENERAL_RECEIPT_READ";
    public static final String GENERAL_RECEIPT_CREATE = "GENERAL_RECEIPT_CREATE";
    public static final String GENERAL_RECEIPT_VOID = "GENERAL_RECEIPT_VOID";

    //GLJournal
    public static final String GL_JOURNAL_READ = "GL_JOURNAL_READ";
    public static final String GL_JOURNAL_CREATE = "GL_JOURNAL_CREATE";
    public static final String GL_JOURNAL_VOID = "GL_JOURNAL_VOID";

    //StandingGeneralJournal
    public static final String STANDING_GENERAL_JOURNAL_READ = "STANDING_GENERAL_JOURNAL_READ";
    public static final String STANDING_GENERAL_JOURNAL_CREATE = "STANDING_GENERAL_JOURNAL_CREATE";
    public static final String STANDING_GENERAL_JOURNAL_UPDATE = "STANDING_GENERAL_JOURNAL_UPDATE";

    public static final String DATA_IMPORT_READ = "DATA_IMPORT_READ";
    public static final String DATA_EXPORT_READ = "DATA_EXPORT_READ";

    private static Set<String> permissionTypes = new HashSet<String>();

    static {
        PermissionType.scanPermissionTypes(new Executable<String>() {
            @Override
            public void execute(String item) {
                permissionTypes.add(item);
            }
        });
    }

    public static Set<String> getPermissionTypes() {
        return permissionTypes;
    }

    public static void scanPermissionTypes(Executable<String> executable) {
        for (Field field : PermissionType.class.getDeclaredFields()) {
            if (field.getType().equals(String.class)) {
                try {
                    executable.execute((String)field.get(null));
                } catch (IllegalAccessException e) {
                    //TODO throw new Exception("Incorrect permission creation, ask support service.", e);
                }
            }
        }
    }

    public static void scanPermissionTypesByGroupName(final String groupName, final Executable<String> executable) {
        final String argument = groupName.concat("_");

        scanPermissionTypes(new Executable<String>() {
            @Override
            public void execute(String name) {
                if (name.startsWith(argument) && !name.substring(argument.length()).contains("_")) {
                    executable.execute(name);
                }
            }
        });
    }

    public static void scanPermissionsByGroupName(final String groupName, final Executable<GlobalPermission> executable) {
        final String argument = groupName.concat("_");

        scanPermissionTypes(new Executable<String>() {
            @Override
            public void execute(String name) {
                if (name.startsWith(argument) && !name.substring(argument.length()).contains("_")) {
                    executable.execute(GlobalPermission.valueOf(name.substring(argument.length())));
                }
            }
        });
    }

    public static GlobalPermission convertToGlobalPermission(String name) {
        return GlobalPermission.valueOf(name.substring(name.lastIndexOf("_") + 1));
    }

    public static void scanPermissions(final Executable<GlobalPermission> executable) {
        scanPermissionTypes(new Executable<String>() {
            @Override
            public void execute(String name) {
                executable.execute(convertToGlobalPermission(name));
            }
        });
    }

}
