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
        if (catalog.containsKey(barcode)) {
            display.setText(catalog.get(barcode));
        } else {
            display.setText(getNotFoundMessage(barcode));
        }
    }

    private String getNotFoundMessage(String barcode) {
        if (barcode == null || barcode.equals("")) {
            return "Product not found";
        }
        return "Product not found " + barcode;
    }
}
