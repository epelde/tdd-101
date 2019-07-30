package io.github.epelde.pos;

import java.util.Map;

public class Sale {

    private final Display display;

    private Map<String, String> catalog;

    Sale(Display display, Map<String, String> catalog) {
        this.display = display;
        this.catalog = catalog;
    }

    public void onBarcode(String barcode) {
        if (isProductInCatalog(barcode)) {
            displayProductPrice(barcode);
        } else {
            displayProductNotFoundMessage(barcode);
        }
    }

    private boolean isProductInCatalog(String barcode) {
        return this.catalog.containsKey(barcode);
    }

    private void displayProductPrice(String barcode) {
        this.display.setText(this.catalog.get(barcode));
    }

    private void displayProductNotFoundMessage(String barcode) {
        String message = "Product not found";
        if (barcode != null && !barcode.equals("")) {
            message += " " + barcode;
        }
        this.display.setText(message);
    }
}
