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
            displayErrorMessage(barcode);
        }
    }

    private boolean isProductInCatalog(String barcode) {
        return this.catalog.containsKey(barcode);
    }

    private void displayProductPrice(String barcode) {
        this.display.setText(this.catalog.get(barcode));
    }

    private void displayErrorMessage(String barcode) {
        String message = "Scanning error: empty barcode";
        if (!isBarcodeEmpty(barcode)) {
            message = "Product not found " + barcode;
        }
        this.display.setText(message);
    }

    private boolean isBarcodeEmpty(String barcode) {
        return barcode == null || barcode.equals("");
    }
}
