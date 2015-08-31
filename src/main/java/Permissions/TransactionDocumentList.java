package Permissions;

import java.security.AllPermission;
import java.util.ArrayList;

/**
 * User: Andrew Redko
 * Date: 8/31/15
 * Time: 3:26 PM
 */
public class TransactionDocumentList {
    public static ArrayList<String> all = new ArrayList<String>() {{
        add("SALES_ORDER_READ");
        add("SALES_INVOICE_READ");
        add("PURCHASE_RECEIVAL_READ");
        add("PURCHASE_CREDIT_READ");
        add("PUT_AWAY_READ");
        add("PURCHASE_RETURN_AUTHORISATION_READ");
        add("PURCHASE_RETURN_READ");
        add("SALES_RETURN_AUTHORISATION_READ");
        add("SALES_DELIVERY_READ");
        add("PICKING_SLIP_READ");
        add("SALES_QUOTE_READ");
        add("PURCHASE_ORDER_READ");
        add("PURCHASE_INVOICE_READ");
        add("SALES_RETURN_READ");
        add("SALES_CREDIT_READ");
    }};

}
