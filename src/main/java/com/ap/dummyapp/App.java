package com.ap.dummyapp;

import security.GlobalPermission;
import security.PermissionType;
import security.PermissionTypeBlock;
import security.PermissionTypeGroup;

import java.io.*;
import java.util.Set;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        FileWriter w = null;
        File fnew = new File("testcases_to_import.xml");
        try {
            w = new FileWriter(fnew, false);

            Set<String> dbSet = PermissionType.getPermissionTypes();
//            for (String s : dbSet) {
//                w.append("\t" + s + "\n");
//            }

//            for (PermissionTypeBlock rootElement : PermissionTypeBlock.getRootElements()) {
            for (PermissionTypeBlock rootElement: PermissionTypeBlock.values()) {
                if (rootElement == PermissionTypeBlock.SETTINGS) {
                    continue; //skip just settings
                }

                w.append("<" + rootElement.toString() + "/>\n");

                for (PermissionTypeGroup group : rootElement.getGroups()) {
                    for (GlobalPermission permission : rootElement.getHeaders()) {
                        String permName = group + "_" + permission;
                        //check if it is in the list of permissions
                        if (dbSet.contains(permName)) {
                            w.append("\t<" + permName + "/>\n");
                        }
                    }
                }
            }

            w.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    private String perToPage = "PRODUCTION_ORDER_READ\tBILL_OF_MATERIAL_READ; UNIT_OF_MEASURE_READ; INVENTORY_READ; DEPARTMENT_READ; LOCATION_READ\tproductionOrderController\n" +
            "PRODUCTION_ORDER_READ\t\tproductionOrdersListController\n" +
            "LOCATION_READ\t\tbinsPickingCatalogController\n" +
            "LOCATION_READ\t\tbinsPutAwayCatalogController\n" +
            "INVENTORY_READ\t\tbuyableInventoryItemCatalogController\n" +
            "GL_ACCOUNT_READ\t\tchartOfAccountAdjustmentCatalogController\n" +
            "GL_ACCOUNT_READ\t\tchartOfAccountAssetCatalogController\n" +
            "GL_ACCOUNT_READ\t\tchartOfAccountCatalogController\n" +
            "GL_ACCOUNT_READ\t\tchartOfAccountCostCatalogController\n" +
            "GL_ACCOUNT_READ\t\tchartOfAccountDBNICatalogController\n" +
            "GL_ACCOUNT_READ\t\tchartOfAccountIncomeCatalogController\n" +
            "GL_ACCOUNT_READ\t\tchartOfAccountRBNICatalogController\n" +
            "GL_ACCOUNT_READ\t\tchatOfAccountGainLossCatalogController\n" +
            "GL_ACCOUNT_READ\t\tchatOfAccountPayableCatalogController\n" +
            "GL_ACCOUNT_READ\t\tchatOfAccountPurchaseTaxCatalogController\n" +
            "GL_ACCOUNT_READ\t\tchatOfAccountReceivableCatalogController\n" +
            "GL_ACCOUNT_READ\t\tchatOfAccountSalesTaxCatalogController\n" +
            "CURRENCY_READ\t\tcurrencyCatalogController\n" +
            "CUSTOMER_READ\t\tcustomerCatalogController\n" +
            "INVENTORY_READ\t\titemCatalogController\n" +
            "INVENTORY_READ\t\tphysicalBuyableIItemCatalogController\n" +
            "INVENTORY_READ\t\tphysicalInventoryItemCatalogController\n" +
            "INVENTORY_READ\t\tphysicalSellableIItemCatalogController\n" +
            "INVENTORY_READ\t\tphysicalStockcontrolledInventoryItemCatalogController\n" +
            "INVENTORY_READ\t\trawGoodsCatalogController\n" +
            "INVENTORY_READ\t\tsellableInventoryItemCatalogController\n" +
            "SUPPLIER_READ\t\tsupplierCatalogController\n" +
            "CONTACT_READ\tCONTACT_TYPE_READ; CONTACT_READ; ADDRESS_TYPE_READ; CONTACT_DETAIL_TYPE_READ; CUSTOMER_READ; SUPPLIER_READ\tcontactController\n" +
            "CONTACT_READ\t\tcontactListController\n" +
            "@@@ NO PERMISSION @@@\t\tcontactsCustomerListController\n" +
            "CUSTOMER_READ\tPRICE_SCALE_READ; GL_ACCOUNT_READ; ADDRESS_TYPE_READ; CONTACT_READ; CURRENCY_READ; DISCOUNT_SCALE_READ; GL_ACCOUNT_READ; TRADING_TERM_READ; COUNTRY_READ; CONTACT_DETAIL_TYPE_READ; ADDRESS_TYPE_READ\tcustomerController\n" +
            "CUSTOMER_READ\t\tcustomerListController\n" +
            "CUSTOMER_TEMPLATE_READ\tPRICE_SCALE_READ; GL_ACCOUNT_READ; ADDRESS_TYPE_READ; CONTACT_READ; CURRENCY_READ; DISCOUNT_SCALE_READ; GL_ACCOUNT_READ; TRADING_TERM_READ; COUNTRY_READ; CONTACT_DETAIL_TYPE_READ; ADDRESS_TYPE_READ\tcustomerTemplateController\n" +
            "CUSTOMER_TEMPLATE_READ\t\tcustomerTemplateListController\n" +
            "SUPPLIER_READ\tGL_ACCOUNT_READ; ADDRESS_TYPE_READ; CONTACT_READ; CURRENCY_READ; DISCOUNT_SCALE_READ; GL_ACCOUNT_READ; TRADING_TERM_READ; COUNTRY_READ; CONTACT_DETAIL_TYPE_READ; ADDRESS_TYPE_READ\tsupplierController\n" +
            "SUPPLIER_TEMPLATE_READ\tGL_ACCOUNT_READ; ADDRESS_TYPE_READ; CONTACT_READ; CURRENCY_READ; DISCOUNT_SCALE_READ; GL_ACCOUNT_READ; TRADING_TERM_READ; COUNTRY_READ; CONTACT_DETAIL_TYPE_READ; ADDRESS_TYPE_READ\tsupplierTemplateController\n" +
            "SUPPLIER_TEMPLATE_READ\t\tsupplierTemplateListController\n" +
            "SALES_BY_REPRESENTATIVE_REPORT_PRINT\t\tsalesByRepresentativeReportController\n" +
            "BALANCE_SHEET_REPORT_PRINT\t\tbalanceSheetReportController\n" +
            "FINANCIAL_ACCOUNT_READ\tTENDER_TYPE_READ; CURRENCY_READ\tbankAccountController\n" +
            "BANK_DEPOSIT_READ\t\tbankAccountDepositsListController\n" +
            "BANK_STATEMENT_READ\t\tbankAccountReconciliationsListController\n" +
            "FINANCIAL_ACCOUNT_READ\t\tbankAccountsListController\n" +
            "FINANCIAL_ACCOUNT_TRANSACTION_READ\t\tbankAccountTransactionsListController\n" +
            "BANK_TRANSFER_READ\tFINANCIAL_ACCOUNT_READ; LOCATION_READ; DEPARTMENT_READ\tbankTransferController\n" +
            "BANK_TRANSFER_READ\t\tbankTransferListController\n" +
            "CHART_OF_ACCOUNTS_REPORT_PRINT\t\tchartofAccountsReportController\n" +
            "@@@ NO PERMISSION @@@\t\tdepositController\n" +
            "BANK_DEPOSIT_READ\t\tdepositsListController\n" +
            "GENERAL_PAYMENT_READ\tLOCATION_READ; DEPARTMENT_READ; TENDER_TYPE_READ; GL_ACCOUNT_READ; FINANCIAL_ACCOUNT_READ\tgeneralPaymentController\n" +
            "GENERAL_PAYMENT_READ\t\tgeneralPaymentListController\n" +
            "GENERAL_RECEIPT_READ\tFINANCIAL_ACCOUNT_READ; LOCATION_READ; DEPARTMENT_READ; TENDER_TYPE_READ; GL_ACCOUNT_READ\tgeneralReceiptController\n" +
            "GENERAL_RECEIPT_READ\t\tgeneralReceiptListController\n" +
            "@@@ NO PERMISSION @@@\t\tjournalController\n" +
            "GL_JOURNAL_READ\t\tjournalsListController\n" +
            "PROFIT_AND_LOSS_REPORT_PRINT\t\tprofitAndLossReportController\n" +
            "@@@ NO PERMISSION @@@\t\treconciliationController\n" +
            "BANK_STATEMENT_READ\t\treconciliationsListController\n" +
            "@@@ NO PERMISSION @@@\t\tstandingJournalController\n" +
            "TAX_STATEMENT_READ\tREPORTING_PERIOD_TYPE_READ\ttaxStatementController\n" +
            "TAX_STATEMENT_READ\t\ttaxStatementListController\n" +
            "TAX_STATEMENT_READ\tREPORTING_PERIOD_TYPE_READ\ttaxSummaryReportController\n" +
            "TRIAL_BALANCE_REPORT_PRINT\t\ttrialBalanceReportController\n" +
            "FINANCIAL_ACCOUNT_READ\tTENDER_TYPE_READ; GL_ACCOUNT_READ; CURRENCY_READ\tundepositedFundController\n" +
            "FINANCIAL_ACCOUNT_READ\t\tundepositedFundDepositsListController\n" +
            "UNREALISED_BALANCE_SHEET_REPORT_PRINT\t\tunrealisedBalanceSheetController\n" +
            "UNREALISED_GAIN_REPORT_PRINT\t\tunrealisedGainReportController\n" +
            "BILL_OF_MATERIAL_READ\tINVENTORY_READ; UNIT_OF_MEASURE_READ\tbillOfMaterialsController\n" +
            "BILL_OF_MATERIAL_READ\t\tbillOfMaterialsListController\n" +
            "INVENTORY_MOVEMENT_READ\tDEPARTMENT_READ; LOCATION_READ; UNIT_OF_MEASURE_READ; INVENTORY_READ\tinventoryMovementController\n" +
            "INVENTORY_MOVEMENT_READ\t\tinventoryMovementsListController\n" +
            "INVENTORY_READ\tINVENTORY_ITEM_TYPE_READ; GL_ACCOUNT_READ; SUPPLIER_READ; UNIT_OF_MEASURE_READ; CURRENCY_READ; PRICE_SCALE_READ; DISCOUNT_SCALE_READ; TAX_CATEGORY_READ\tinventoryItemController\n" +
            "INVENTORY_READ\t\tinventoryItemListController\n" +
            "INVENTORY_TEMPLATE_READ\tINVENTORY_ITEM_TYPE_READ; GL_ACCOUNT_READ; SUPPLIER_READ; CURRENCY_READ; TAX_CATEGORY_READ\tinventoryItemTemplateController\n" +
            "INVENTORY_TEMPLATE_READ\t\tinventoryItemTemplatesController\n" +
            "@@@ NO PERMISSION @@@\t\tmovementsWithInventoryItemTabListController\n" +
            "PRODUCT_LIST_REPORT_PRINT\t\tproductListReportController\n" +
            "PRODUCT_MOVEMENT_REPORT_PRINT\t\tproductMovementReportController\n" +
            "PRODUCT_QUANTITY_BY_PRODUCT_REPORT_PRINT\t\tproductQuantityByProductReportController\n" +
            "PURCHASE_BY_PRODUCT_REPORT_PRINT\t\tpurchaseByProductReportController\n" +
            "@@@ NO PERMISSION @@@\t\tpurchaseMovementsWithInventoryItemTabListController\n" +
            "REORDER_REPORT_PRINT\t\treorderReportController\n" +
            "SALES_BY_PRODUCT_REPORT_PRINT\t\tsalesByProductReportController\n" +
            "@@@ NO PERMISSION @@@\t\tsalesMovementsWithInventoryItemTabListController\n" +
            "STOCKTAKE_READ\tINVENTORY_READ; UNIT_OF_MEASURE_READ; DEPARTMENT_READ; LOCATION_READ; GL_ACCOUNT_READ\tstocktakeController\n" +
            "STOCKTAKE_READ\t\tstocktakesListController\n" +
            "STOCKTAKE_READ\t\tstocktakeVarianceReportController\n" +
            "SUPPLIER_READ\t\tsupplierAdjustmentSupplierCatalogController\n" +
            "SUPPLIER_READ\t\tsupplierPaymentSupplierCatalogController\n" +
            "SUPPLIER_PAYMENT_READ\t\tpayablesSupplierPaymentsListController\n" +
            "PURCHASE_CREDIT_READ\tPURCHASE_CREDIT_ALLOCATE\tpurchaseCreditAllocateController\n" +
            "PURCHASE_CREDIT_READ\tINVENTORY_READ; SUPPLIER_READ; LOCATION_READ; DEPARTMENT_READ; TRADING_TERM_READ; CONTACT_READ; ADDRESS_TYPE_READ\tpurchaseCreditController\n" +
            "PURCHASE_CREDIT_READ\t\tpurchaseCreditListController\n" +
            "SUPPLIER_ADJUSTMENT_READ\tSUPPLIER_READ; GL_ACCOUNT_READ\tsupplierAdjustmentController\n" +
            "SUPPLIER_ADJUSTMENT_READ\t\tsupplierAdjustmentListController\n" +
            "SUPPLIER_AGED_BALANCE_REPORT_PRINT\t\tsupplierAgedBalancesController\n" +
            "SUPPLIER_READ\t\tsupplierListController\n" +
            "@@@ NO PERMISSION @@@\t\tsupplierPaymentController\n" +
            "PURCHASE_BY_SUPPLIER_REPORT_PRINT\t\tpurchaseBySupplierReportController\n" +
            "@@@ NO PERMISSION @@@\t\tpurchaseDocumentsWithSupplierTabListController\n" +
            "PURCHASE_INVOICE_READ\tPURCHASE_INVOICE_ALLOCATE\tpurchaseInvoiceAllocateController\n" +
            "PURCHASE_INVOICE_READ\tINVENTORY_READ; SUPPLIER_READ; LOCATION_READ; DEPARTMENT_READ; TRADING_TERM_READ; CONTACT_READ; ADDRESS_TYPE_READ\tpurchaseInvoiceController\n" +
            "PURCHASE_INVOICE_READ\t\tpurchaseInvoicesListController\n" +
            "PURCHASE_ORDER_READ\tINVENTORY_READ; CUSTOMER_READ; LOCATION_READ; DEPARTMENT_READ; TRADING_TERM_READ; CONTACT_READ; ADDRESS_TYPE_READ\tpurchaseOrderController\n" +
            "PURCHASE_ORDER_READ\t\tpurchaseOrdersListController\n" +
            "PURCHASE_CREDIT_READ\tINVENTORY_READ; SUPPLIER_READ; LOCATION_READ; DEPARTMENT_READ; TRADING_TERM_READ; CONTACT_READ; ADDRESS_TYPE_READ\tpurchaseReceivalController\n" +
            "PURCHASE_RECEIVAL_READ\t\tpurchaseReceivalListController\n" +
            "PURCHASE_RETURN_AUTHORISATION_READ\tINVENTORY_READ; SUPPLIER_READ; LOCATION_READ; DEPARTMENT_READ; TRADING_TERM_READ; CONTACT_READ; ADDRESS_TYPE_READ\tpurchaseReturnAuthorisationController\n" +
            "PURCHASE_RETURN_AUTHORISATION_READ\t\tpurchaseReturnAuthorisationListController\n" +
            "PURCHASE_RETURN_READ\tINVENTORY_READ; SUPPLIER_READ; LOCATION_READ; DEPARTMENT_READ; TRADING_TERM_READ; CONTACT_READ; ADDRESS_TYPE_READ\tpurchaseReturnController\n" +
            "PURCHASE_RETURN_READ\t\tpurchaseReturnsListController\n" +
            "SUPPLIER_READ\t\tpurchaseSuppliersListController\n" +
            "CUSTOMER_READ\t\tcustomerAdjustmentCustomerCatalogController\n" +
            "CUSTOMER_READ\t\tcustomerReceiptCustomerCatalogController\n" +
            "CUSTOMER_ADJUSTMENT_READ\tCUSTOMER_READ; GL_ACCOUNT_READ; LOCATION_READ; DEPARTMENT_READ\tcustomerAdjustmentController\n" +
            "CUSTOMER_ADJUSTMENT_ALLOCATE\t\tcustomerAdjustmentListController\n" +
            "CUSTOMER_AGED_BALANCE_REPORT_PRINT\t\tcustomerAgedBalanceReportController\n" +
            "CUSTOMER_RECEIPT_READ\tCUSTOMER_READ; FINANCIAL_ACCOUNT_READ; TENDER_TYPE_READ; LOCATION_READ; DEPARTMENT_READ\tcustomerReceiptController\n" +
            "CUSTOMER_RECEIPT_READ\t\tcustomerReceiptsListController\n" +
            "CUSTOMER_STATEMENTS_PRINT\t\tcustomerStatementReportController\n" +
            "SALES_CREDIT_READ\tSALES_CREDIT_ALLOCATE\tsalesCreditAllocateController\n" +
            "SALES_CREDIT_READ\tINVENTORY_READ; CUSTOMER_READ; LOCATION_READ; DEPARTMENT_READ; TRADING_TERM_READ; CONTACT_READ; ADDRESS_TYPE_READ\tsalesCreditController\n" +
            "SALES_CREDIT_READ\t\tsalesCreditListController\n" +
            "SALES_BY_CUSTOMER_REPORT_PRINT\t\tsalesByCustomerReportController\n" +
            "SALES_DELIVERY_READ\t\tsalesDeliveriesListController\n" +
            "SALES_DELIVERY_READ\tINVENTORY_READ; CUSTOMER_READ; LOCATION_READ; DEPARTMENT_READ; TRADING_TERM_READ; CONTACT_READ; ADDRESS_TYPE_READ\tsalesDeliveryController\n" +
            "@@@ NO PERMISSION @@@\t\tsalesDocumentsWithCustomerTabListController\n" +
            "SALES_INVOICE_READ\tSALES_INVOICE_ALLOCATE\tsalesInvoiceAllocateController\n" +
            "SALES_INVOICE_READ\tINVENTORY_READ; CUSTOMER_READ; LOCATION_READ; DEPARTMENT_READ; TRADING_TERM_READ; CONTACT_READ; ADDRESS_TYPE_READ\tsalesInvoiceController\n" +
            "SALES_INVOICE_READ\t\tsalesInvoicesListController\n" +
            "SALES_ORDER_READ\tINVENTORY_READ; CUSTOMER_READ; LOCATION_READ; DEPARTMENT_READ; TRADING_TERM_READ; CONTACT_READ; ADDRESS_TYPE_READ\tsalesOrderController\n" +
            "SALES_ORDER_READ\t\tsalesOrdersListController\n" +
            "SALES_QUOTE_READ\tINVENTORY_READ; CUSTOMER_READ; LOCATION_READ; DEPARTMENT_READ; TRADING_TERM_READ; CONTACT_READ; ADDRESS_TYPE_READ\tsalesQuoteController\n" +
            "SALES_QUOTE_READ\t\tsalesQuotesListController\n" +
            "SALES_RETURN_AUTHORISATION_READ\tINVENTORY_READ; CUSTOMER_READ; LOCATION_READ; DEPARTMENT_READ; TRADING_TERM_READ; CONTACT_READ; ADDRESS_TYPE_READ\tsalesReturnAuthorisationController\n" +
            "SALES_RETURN_AUTHORISATION_READ\t\tsalesReturnAuthorisationListController\n" +
            "SALES_RETURN_READ\tINVENTORY_READ; CUSTOMER_READ; LOCATION_READ; DEPARTMENT_READ; TRADING_TERM_READ; CONTACT_READ; ADDRESS_TYPE_READ\tsalesReturnController\n" +
            "SALES_RETURN_READ\t\tsalesReturnsListController\n" +
            "GL_ACCOUNT_CLASS_READ\t\taccountClassController\n" +
            "GL_ACCOUNT_CLASS_READ\t\taccountClassListController\n" +
            "GL_ACCOUNT_READ\tGL_ACCOUNT_TYPE_READ\taccountController\n" +
            "@@@ NO PERMISSION @@@\t\taccountJournalListController\n" +
            "GL_ACCOUNT_CLASS_READ\t\taccountTypeController\n" +
            "GL_ACCOUNT_TYPE_READ\t\taccountTypeListController\n" +
            "GL_ACCOUNT_CLASS_READ\t\taddressTypeController\n" +
            "ADDRESS_TYPE_READ\t\taddressTypeListController\n" +
            "WAREHOUSE_BIN_TYPE_READ\t\tbinTypeController\n" +
            "WAREHOUSE_BIN_TYPE_READ\t\tbinTypeListController\n" +
            "GL_ACCOUNT_READ\t\tchartOfAccountListController\n" +
            "COMPANY_READ\tCOUNTRY_READ; CURRENCY_READ; ADDRESS_TYPE_READ; GL_ACCOUNT_READ; CONTACT_READ\tcompanyDetailsController\n" +
            "CONTACT_DETAIL_TYPE_READ\t\tcontactDetailTypeController\n" +
            "CONTACT_DETAIL_TYPE_READ\t\tcontactDetailTypeListController\n" +
            "CONTACT_TYPE_READ\t\tcontactTypeController\n" +
            "CONTACT_TYPE_READ\t\tcontactTypeListController\n" +
            "COUNTRY_READ\t\tcountryController\n" +
            "COUNTRY_READ\t\tcountryListController\n" +
            "CURRENCY_READ\t\tcurrencyController\n" +
            "CURRENCY_READ\t\tcurrencyListController\n" +
            "DEPARTMENT_READ\t\tdepartmentController\n" +
            "CURRENCY_READ\t\tdepartmentListController\n" +
            "DISCOUNT_SCALE_READ\t\tdiscountScaleController\n" +
            "CURRENCY_READ\t\tdiscountScaleListController\n" +
            "TRANSACTION_NUMBER_READ\t\tdocumentNumberController\n" +
            "TRANSACTION_NUMBER_READ\t\tdocumentNumberListController\n" +
            "EXCHANGE_RATE_READ\tCURRENCY_READ\texchangeRateController\n" +
            "@@@ NO PERMISSION @@@\t\texchangeRateListController\n" +
            "@@@ NO PERMISSION @@@\t\tcustomerTagController\n" +
            "@@@ NO PERMISSION @@@\t\tinventoryItemTagController\n" +
            "@@@ NO PERMISSION @@@\t\tsupplierTagController\n" +
            "INVENTORY_ITEM_TYPE_READ\t\titemTypeController\n" +
            "INVENTORY_ITEM_TYPE_READ\t\titemTypeListController\n" +
            "@@@ NO PERMISSION @@@\t\tjournalItemsListController\n" +
            "LOCATION_READ\t\tlocationController\n" +
            "LOCATION_READ\t\tlocationListController\n" +
            "PRICE_SCALE_READ\t\tpriceScaleController\n" +
            "PRICE_SCALE_READ\t\tpriceScaleListController\n" +
            "REPORTING_PERIOD_TYPE_READ\t\treportingPeriodController\n" +
            "REPORTING_PERIOD_TYPE_READ\t\treportingPeriodListController\n" +
            "CUSTOM_REPORT_TYPE_READ\t\treportManagementController\n" +
            "TAX_CATEGORY_READ\t\ttaxCategoryController\n" +
            "TAX_CATEGORY_READ\t\ttaxCategoryListController\n" +
            "REPORTING_PERIOD_TYPE_READ\t\ttaxTypeController\n" +
            "REPORTING_PERIOD_TYPE_READ\t\ttaxTypeListController\n" +
            "TENDER_TYPE_READ\t\ttenderTypeController\n" +
            "TENDER_TYPE_READ\t\ttenderTypesListController\n" +
            "TRADING_POLICY_READ\t\ttradingPolicyController\n" +
            "TRADING_POLICY_READ\t\ttradingPolicyListController\n" +
            "TRADING_TERM_READ\t\ttradingTermController\n" +
            "TRADING_TERM_READ\t\ttradingTermsListController\n" +
            "UNIT_OF_MEASURE_READ\t\tunitOfMeasureController\n" +
            "UNIT_OF_MEASURE_READ\t\tunitOfMeasureListController\n" +
            "USER_ACCOUNT_READ\tDEPARTMENT_READ; LOCATION_READ\tuserAccountController\n" +
            "USER_ACCOUNT_READ\t\tuserAccountListController\n" +
            "PICKING_SLIP_READ\tINVENTORY_READ\tpickingSlipController\n" +
            "PICKING_SLIP_READ\t\tpickingSlipListController\n" +
            "PRODUCT_QUANTITY_BY_BIN_REPORT_PRINT\t\tproductQuantityByBinController\n" +
            "PRODUCT_QUANTITY_BY_LOCATION_REPORT_PRINT\t\tproductQuantityByLocationReportController\n" +
            "PUT_AWAY_READ\tINVENTORY_READ\tputAwayController\n" +
            "PUT_AWAY_READ\t\tputAwayListController\n" +
            "LOCATION_READ\t\twarehousingLocationsListController\n" +
            "SALES_ORDER_READ\t\twarehousingSalesOrdersListController\n" +
            "STOCKTAKE_READ\t\twarehousingStocktakesListController\n";
    //match lists

}
