package Permissions;

/**
 * Created by Andrew Redko on 8/30/15.
 */
public class PermissionsToPagesStrings {
    public static String all = "CONTACT_READ,,contactsCustomerList\n" +
            "BANK_DEPOSIT_READ,,deposit\n" +
            "GL_JOURNAL_READ,,journal\n" +
            "BANK_STATEMENT_READ,,reconciliation\n" +
            "GL_JOURNAL_READ,,standingJournal\n" +
            "INVENTORY_MOVEMENT_READ,,movementsWithInventoryItemTabList\n" +
            "INVENTORY_MOVEMENT_READ,,purchaseMovementsWithInventoryItemTabList\n" +
            "INVENTORY_MOVEMENT_READ,,salesMovementsWithInventoryItemTabList\n" +
            "SUPPLIER_PAYMENT_READ,,supplierPayment\n" +
            "SUPPLIER_READ,,purchaseDocumentsWithSupplierTabList\n" +
            "CUSTOMER_READ,,salesDocumentsWithCustomerTabList\n" +
            "GL_JOURNAL_READ,,accountJournalList\n" +
            "EXCHANGE_RATE_READ,,exchangeRateList\n" +
            "GL_JOURNAL_READ,,journalItemsList\n" +
            "ADDRESS_TYPE_READ,,addressTypeList\n" +
            "BALANCE_SHEET_REPORT_PRINT,,balanceSheetReport\n" +
            "BANK_DEPOSIT_READ,,bankAccountDepositsList\n" +
            "BANK_DEPOSIT_READ,,depositsList\n" +
            "BANK_STATEMENT_READ,,bankAccountReconciliationsList\n" +
            "BANK_STATEMENT_READ,,reconciliationsList\n" +
            "BANK_TRANSFER_READ,FINANCIAL_ACCOUNT_READ; LOCATION_READ; DEPARTMENT_READ,bankTransfer\n" +
            "BANK_TRANSFER_READ,,bankTransferList\n" +
            "BILL_OF_MATERIAL_READ,INVENTORY_READ; UNIT_OF_MEASURE_READ,billOfMaterials\n" +
            "BILL_OF_MATERIAL_READ,,billOfMaterialsList\n" +
            "CHART_OF_ACCOUNTS_REPORT_PRINT,,chartofAccountsReport\n" +
            "COMPANY_READ,COUNTRY_READ; CURRENCY_READ; ADDRESS_TYPE_READ; GL_ACCOUNT_READ; CONTACT_READ,companyDetails\n" +
            "CONTACT_DETAIL_TYPE_READ,,contactDetailType\n" +
            "CONTACT_DETAIL_TYPE_READ,,contactDetailTypeList\n" +
            "CONTACT_READ,CONTACT_TYPE_READ; CONTACT_READ; ADDRESS_TYPE_READ; CONTACT_DETAIL_TYPE_READ; CUSTOMER_READ; SUPPLIER_READ,contact\n" +
            "CONTACT_READ,,contactList\n" +
            "CONTACT_TYPE_READ,,contactType\n" +
            "CONTACT_TYPE_READ,,contactTypeList\n" +
            "COUNTRY_READ,,country\n" +
            "COUNTRY_READ,,countryList\n" +
            "CURRENCY_READ,,currencyCatalog\n" +
            "CURRENCY_READ,,currency\n" +
            "CURRENCY_READ,,currencyList\n" +
            "CURRENCY_READ,,departmentList\n" +
            "CURRENCY_READ,,discountScaleList\n" +
            "CUSTOM_REPORT_TYPE_READ,,reportManagement\n" +
            "CUSTOMER_ADJUSTMENT_ALLOCATE,,customerAdjustmentList\n" +
            "CUSTOMER_ADJUSTMENT_READ,CUSTOMER_READ; GL_ACCOUNT_READ; LOCATION_READ; DEPARTMENT_READ,customerAdjustment\n" +
            "CUSTOMER_AGED_BALANCE_REPORT_PRINT,,customerAgedBalanceReport\n" +
            "CUSTOMER_READ,,customerCatalog\n" +
            "CUSTOMER_READ,PRICE_SCALE_READ; GL_ACCOUNT_READ; ADDRESS_TYPE_READ; CONTACT_READ; CURRENCY_READ; DISCOUNT_SCALE_READ; GL_ACCOUNT_READ; TRADING_TERM_READ; COUNTRY_READ; CONTACT_DETAIL_TYPE_READ; ADDRESS_TYPE_READ,customer\n" +
            "CUSTOMER_READ,,customerList\n" +
            "CUSTOMER_READ,,customerAdjustmentCustomerCatalog\n" +
            "CUSTOMER_READ,,customerReceiptCustomerCatalog\n" +
            "CUSTOMER_RECEIPT_READ,CUSTOMER_READ; FINANCIAL_ACCOUNT_READ; TENDER_TYPE_READ; LOCATION_READ; DEPARTMENT_READ,customerReceipt\n" +
            "CUSTOMER_RECEIPT_READ,,customerReceiptsList\n" +
            "CUSTOMER_STATEMENTS_PRINT,,customerStatementReport\n" +
            "CUSTOMER_TEMPLATE_READ,PRICE_SCALE_READ; GL_ACCOUNT_READ; ADDRESS_TYPE_READ; CONTACT_READ; CURRENCY_READ; DISCOUNT_SCALE_READ; GL_ACCOUNT_READ; TRADING_TERM_READ; COUNTRY_READ; CONTACT_DETAIL_TYPE_READ; ADDRESS_TYPE_READ,customerTemplate\n" +
            "CUSTOMER_TEMPLATE_READ,,customerTemplateList\n" +
            "DEPARTMENT_READ,,department\n" +
            "DISCOUNT_SCALE_READ,,discountScale\n" +
            "EXCHANGE_RATE_READ,CURRENCY_READ,exchangeRate\n" +
            "FINANCIAL_ACCOUNT_READ,,bankAccount\n" +
            "FINANCIAL_ACCOUNT_READ,,bankAccountsList\n" +
            "FINANCIAL_ACCOUNT_READ,TENDER_TYPE_READ; GL_ACCOUNT_READ; CURRENCY_READ,undepositedFund\n" +
            "FINANCIAL_ACCOUNT_READ,,undepositedFundDepositsList\n" +
            "FINANCIAL_ACCOUNT_TRANSACTION_READ,,bankAccountTransactionsList\n" +
            "GENERAL_PAYMENT_READ,LOCATION_READ; DEPARTMENT_READ; TENDER_TYPE_READ; GL_ACCOUNT_READ; FINANCIAL_ACCOUNT_READ,generalPayment\n" +
            "GENERAL_PAYMENT_READ,,generalPaymentList\n" +
            "GENERAL_RECEIPT_READ,FINANCIAL_ACCOUNT_READ; LOCATION_READ; DEPARTMENT_READ; TENDER_TYPE_READ; GL_ACCOUNT_READ,generalReceipt\n" +
            "GENERAL_RECEIPT_READ,,generalReceiptList\n" +
            "GL_ACCOUNT_CLASS_READ,,accountClass\n" +
            "GL_ACCOUNT_CLASS_READ,,accountClassList\n" +
            "GL_ACCOUNT_CLASS_READ,,accountType\n" +
            "GL_ACCOUNT_CLASS_READ,,addressType\n" +
            "GL_ACCOUNT_READ,,chartOfAccountAdjustmentCatalog\n" +
            "GL_ACCOUNT_READ,,chartOfAccountAssetCatalog\n" +
            "GL_ACCOUNT_READ,,chartOfAccountCatalog\n" +
            "GL_ACCOUNT_READ,,chartOfAccountCostCatalog\n" +
            "GL_ACCOUNT_READ,,chartOfAccountDBNICatalog\n" +
            "GL_ACCOUNT_READ,,chartOfAccountIncomeCatalog\n" +
            "GL_ACCOUNT_READ,,chartOfAccountRBNICatalog\n" +
            "GL_ACCOUNT_READ,,chatOfAccountGainLossCatalog\n" +
            "GL_ACCOUNT_READ,,chatOfAccountPayableCatalog\n" +
            "GL_ACCOUNT_READ,,chatOfAccountPurchaseTaxCatalog\n" +
            "GL_ACCOUNT_READ,,chatOfAccountReceivableCatalog\n" +
            "GL_ACCOUNT_READ,,chatOfAccountSalesTaxCatalog\n" +
            "GL_ACCOUNT_READ,GL_ACCOUNT_TYPE_READ,account\n" +
            "GL_ACCOUNT_READ,,chartOfAccountList\n" +
            "GL_ACCOUNT_TYPE_READ,,accountTypeList\n" +
            "GL_JOURNAL_READ,,journalsList\n" +
            "INVENTORY_ITEM_TYPE_READ,,itemType\n" +
            "INVENTORY_ITEM_TYPE_READ,,itemTypeList\n" +
            "INVENTORY_MOVEMENT_READ,DEPARTMENT_READ; LOCATION_READ; UNIT_OF_MEASURE_READ; INVENTORY_READ,inventoryMovement\n" +
            "INVENTORY_MOVEMENT_READ,,inventoryMovementsList\n" +
            "INVENTORY_READ,,buyableInventoryItemCatalog\n" +
            "INVENTORY_READ,,itemCatalog\n" +
            "INVENTORY_READ,,physicalBuyableIItemCatalog\n" +
            "INVENTORY_READ,,physicalInventoryItemCatalog\n" +
            "INVENTORY_READ,,physicalSellableIItemCatalog\n" +
            "INVENTORY_READ,,physicalStockcontrolledInventoryItemCatalog\n" +
            "INVENTORY_READ,,rawGoodsCatalog\n" +
            "INVENTORY_READ,,sellableInventoryItemCatalog\n" +
            "INVENTORY_READ,INVENTORY_ITEM_TYPE_READ; GL_ACCOUNT_READ; SUPPLIER_READ; UNIT_OF_MEASURE_READ; CURRENCY_READ; PRICE_SCALE_READ; DISCOUNT_SCALE_READ; TAX_CATEGORY_READ,inventoryItem\n" +
            "INVENTORY_READ,,inventoryItemList\n" +
            "INVENTORY_TEMPLATE_READ,INVENTORY_ITEM_TYPE_READ; GL_ACCOUNT_READ; SUPPLIER_READ; CURRENCY_READ; TAX_CATEGORY_READ,inventoryItemTemplate\n" +
            "INVENTORY_TEMPLATE_READ,,inventoryItemTemplates\n" +
            "LOCATION_READ,,binsPickingCatalog\n" +
            "LOCATION_READ,,binsPutAwayCatalog\n" +
            "LOCATION_READ,,location\n" +
            "LOCATION_READ,,locationList\n" +
            "LOCATION_READ,,warehousingLocationsList\n" +
            "PICKING_SLIP_READ,INVENTORY_READ,pickingSlip\n" +
            "PICKING_SLIP_READ,,pickingSlipList\n" +
            "PRICE_SCALE_READ,,priceScale\n" +
            "PRICE_SCALE_READ,,priceScaleList\n" +
            "PRODUCT_LIST_REPORT_PRINT,,productListReport\n" +
            "PRODUCT_MOVEMENT_REPORT_PRINT,,productMovementReport\n" +
            "PRODUCT_QUANTITY_BY_BIN_REPORT_PRINT,,productQuantityByBin\n" +
            "PRODUCT_QUANTITY_BY_LOCATION_REPORT_PRINT,,productQuantityByLocationReport\n" +
            "PRODUCT_QUANTITY_BY_PRODUCT_REPORT_PRINT,,productQuantityByProductReport\n" +
            "PRODUCTION_ORDER_READ,BILL_OF_MATERIAL_READ; UNIT_OF_MEASURE_READ; INVENTORY_READ; DEPARTMENT_READ; LOCATION_READ,productionOrder\n" +
            "PRODUCTION_ORDER_READ,,productionOrdersList\n" +
            "PROFIT_AND_LOSS_REPORT_PRINT,,profitAndLossReport\n" +
            "PURCHASE_BY_PRODUCT_REPORT_PRINT,,purchaseByProductReport\n" +
            "PURCHASE_BY_SUPPLIER_REPORT_PRINT,,purchaseBySupplierReport\n" +
            "PURCHASE_CREDIT_ALLOCATE,PURCHASE_CREDIT_READ,purchaseCreditAllocate\n" +
            "PURCHASE_CREDIT_READ,INVENTORY_READ; SUPPLIER_READ; LOCATION_READ; DEPARTMENT_READ; TRADING_TERM_READ; CONTACT_READ; ADDRESS_TYPE_READ,purchaseCredit\n" +
            "PURCHASE_CREDIT_READ,,purchaseCreditList\n" +
            "PURCHASE_RECEIVAL_READ,INVENTORY_READ; SUPPLIER_READ; LOCATION_READ; DEPARTMENT_READ; TRADING_TERM_READ; CONTACT_READ; ADDRESS_TYPE_READ,purchaseReceival\n" +
            "PURCHASE_INVOICE_ALLOCATE,PURCHASE_INVOICE_READ,purchaseInvoiceAllocate\n" +
            "PURCHASE_INVOICE_READ,INVENTORY_READ; SUPPLIER_READ; LOCATION_READ; DEPARTMENT_READ; TRADING_TERM_READ; CONTACT_READ; ADDRESS_TYPE_READ,purchaseInvoice\n" +
            "PURCHASE_INVOICE_READ,,purchaseInvoicesList\n" +
            "PURCHASE_ORDER_READ,INVENTORY_READ; CUSTOMER_READ; LOCATION_READ; DEPARTMENT_READ; TRADING_TERM_READ; CONTACT_READ; ADDRESS_TYPE_READ,purchaseOrder\n" +
            "PURCHASE_ORDER_READ,,purchaseOrdersList\n" +
            "PURCHASE_RECEIVAL_READ,,purchaseReceivalList\n" +
            "PURCHASE_RETURN_AUTHORISATION_READ,INVENTORY_READ; SUPPLIER_READ; LOCATION_READ; DEPARTMENT_READ; TRADING_TERM_READ; CONTACT_READ; ADDRESS_TYPE_READ,purchaseReturnAuthorisation\n" +
            "PURCHASE_RETURN_AUTHORISATION_READ,,purchaseReturnAuthorisationList\n" +
            "PURCHASE_RETURN_READ,INVENTORY_READ; SUPPLIER_READ; LOCATION_READ; DEPARTMENT_READ; TRADING_TERM_READ; CONTACT_READ; ADDRESS_TYPE_READ,purchaseReturn\n" +
            "PURCHASE_RETURN_READ,,purchaseReturnsList\n" +
            "PUT_AWAY_READ,INVENTORY_READ,putAway\n" +
            "PUT_AWAY_READ,,putAwayList\n" +
            "REORDER_REPORT_PRINT,,reorderReport\n" +
            "REPORTING_PERIOD_TYPE_READ,,reportingPeriod\n" +
            "REPORTING_PERIOD_TYPE_READ,,reportingPeriodList\n" +
            "REPORTING_PERIOD_TYPE_READ,,taxType\n" +
            "REPORTING_PERIOD_TYPE_READ,,taxTypeList\n" +
            "SALES_BY_CUSTOMER_REPORT_PRINT,,salesByCustomerReport\n" +
            "SALES_BY_PRODUCT_REPORT_PRINT,,salesByProductReport\n" +
            "SALES_BY_REPRESENTATIVE_REPORT_PRINT,,salesByRepresentativeReport\n" +
            "SALES_CREDIT_ALLOCATE,SALES_CREDIT_READ,salesCreditAllocate\n" +
            "SALES_CREDIT_READ,INVENTORY_READ; CUSTOMER_READ; LOCATION_READ; DEPARTMENT_READ; TRADING_TERM_READ; CONTACT_READ; ADDRESS_TYPE_READ,salesCredit\n" +
            "SALES_CREDIT_READ,,salesCreditList\n" +
            "SALES_DELIVERY_READ,,salesDeliveriesList\n" +
            "SALES_DELIVERY_READ,INVENTORY_READ; CUSTOMER_READ; LOCATION_READ; DEPARTMENT_READ; TRADING_TERM_READ; CONTACT_READ; ADDRESS_TYPE_READ,salesDelivery\n" +
            "SALES_INVOICE_ALLOCATE,SALES_INVOICE_READ,salesInvoiceAllocate\n" +
            "SALES_INVOICE_READ,INVENTORY_READ; CUSTOMER_READ; LOCATION_READ; DEPARTMENT_READ; TRADING_TERM_READ; CONTACT_READ; ADDRESS_TYPE_READ,salesInvoice\n" +
            "SALES_INVOICE_READ,,salesInvoicesList\n" +
            "SALES_ORDER_READ,INVENTORY_READ; CUSTOMER_READ; LOCATION_READ; DEPARTMENT_READ; TRADING_TERM_READ; CONTACT_READ; ADDRESS_TYPE_READ,salesOrder\n" +
            "SALES_ORDER_READ,,salesOrdersList\n" +
            "SALES_ORDER_READ,,warehousingSalesOrdersList\n" +
            "SALES_QUOTE_READ,INVENTORY_READ; CUSTOMER_READ; LOCATION_READ; DEPARTMENT_READ; TRADING_TERM_READ; CONTACT_READ; ADDRESS_TYPE_READ,salesQuote\n" +
            "SALES_QUOTE_READ,,salesQuotesList\n" +
            "SALES_RETURN_AUTHORISATION_READ,INVENTORY_READ; CUSTOMER_READ; LOCATION_READ; DEPARTMENT_READ; TRADING_TERM_READ; CONTACT_READ; ADDRESS_TYPE_READ,salesReturnAuthorisation\n" +
            "SALES_RETURN_AUTHORISATION_READ,,salesReturnAuthorisationList\n" +
            "SALES_RETURN_READ,INVENTORY_READ; CUSTOMER_READ; LOCATION_READ; DEPARTMENT_READ; TRADING_TERM_READ; CONTACT_READ; ADDRESS_TYPE_READ,salesReturn\n" +
            "SALES_RETURN_READ,,salesReturnsList\n" +
            "STOCKTAKE_READ,INVENTORY_READ; UNIT_OF_MEASURE_READ; DEPARTMENT_READ; LOCATION_READ; GL_ACCOUNT_READ,stocktake\n" +
            "STOCKTAKE_READ,,stocktakesList\n" +
            "STOCKTAKE_READ,,stocktakeVarianceReport\n" +
            "STOCKTAKE_READ,,warehousingStocktakesList\n" +
            "SUPPLIER_ADJUSTMENT_READ,SUPPLIER_READ; GL_ACCOUNT_READ,supplierAdjustment\n" +
            "SUPPLIER_ADJUSTMENT_READ,,supplierAdjustmentList\n" +
            "SUPPLIER_AGED_BALANCE_REPORT_PRINT,,supplierAgedBalances\n" +
            "SUPPLIER_PAYMENT_READ,,payablesSupplierPaymentsList\n" +
            "SUPPLIER_READ,,supplierCatalog\n" +
            "SUPPLIER_READ,GL_ACCOUNT_READ; ADDRESS_TYPE_READ; CONTACT_READ; CURRENCY_READ; DISCOUNT_SCALE_READ; GL_ACCOUNT_READ; TRADING_TERM_READ; COUNTRY_READ; CONTACT_DETAIL_TYPE_READ; ADDRESS_TYPE_READ,supplier\n" +
            "SUPPLIER_READ,,supplierAdjustmentSupplierCatalog\n" +
            "SUPPLIER_READ,,supplierPaymentSupplierCatalog\n" +
            "SUPPLIER_READ,,supplierList\n" +
            "SUPPLIER_READ,,purchaseSuppliersList\n" +
            "SUPPLIER_TEMPLATE_READ,GL_ACCOUNT_READ; ADDRESS_TYPE_READ; CONTACT_READ; CURRENCY_READ; DISCOUNT_SCALE_READ; GL_ACCOUNT_READ; TRADING_TERM_READ; COUNTRY_READ; CONTACT_DETAIL_TYPE_READ; ADDRESS_TYPE_READ,supplierTemplate\n" +
            "SUPPLIER_TEMPLATE_READ,,supplierTemplateList\n" +
            "TAX_CATEGORY_READ,,taxCategory\n" +
            "TAX_CATEGORY_READ,,taxCategoryList\n" +
            "TAX_STATEMENT_READ,REPORTING_PERIOD_TYPE_READ,taxStatement\n" +
            "TAX_STATEMENT_READ,,taxStatementList\n" +
            "TAX_STATEMENT_READ,,taxSummaryReport\n" +
            "TENDER_TYPE_READ,,tenderType\n" +
            "TENDER_TYPE_READ,,tenderTypesList\n" +
            "TRADING_POLICY_READ,,tradingPolicy\n" +
            "TRADING_POLICY_READ,,tradingPolicyList\n" +
            "TRADING_TERM_READ,,tradingTerm\n" +
            "TRADING_TERM_READ,,tradingTermsList\n" +
            "TRANSACTION_NUMBER_READ,,documentNumber\n" +
            "TRANSACTION_NUMBER_READ,,documentNumberList\n" +
            "TRIAL_BALANCE_REPORT_PRINT,,trialBalanceReport\n" +
            "UNIT_OF_MEASURE_READ,,unitOfMeasure\n" +
            "UNIT_OF_MEASURE_READ,,unitOfMeasureList\n" +
            "UNREALISED_BALANCE_SHEET_REPORT_PRINT,,unrealisedBalanceSheet\n" +
            "UNREALISED_GAIN_REPORT_PRINT,,unrealisedGainReport\n" +
            "USER_ACCOUNT_READ,DEPARTMENT_READ; LOCATION_READ,userAccount\n" +
            "USER_ACCOUNT_READ,,userAccountList\n" +
            "WAREHOUSE_BIN_TYPE_READ,,binType\n" +
            "WAREHOUSE_BIN_TYPE_READ,,binTypeList\n";
}
