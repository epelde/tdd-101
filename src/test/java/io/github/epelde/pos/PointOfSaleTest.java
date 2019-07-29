package io.github.epelde.pos;

import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;

public class PointOfSaleTest {

    private Sale sale;

    private Display display;

    @Before
    public void setUp() {
        display = new Display();
        Map<String, String> catalog = new HashMap<>();
        catalog.put("6565656565", "12.75€");
        catalog.put("7878787878", "9.45€");
        sale = new Sale(display, catalog);
    }

    @Test
    public void displayedPriceOnProductFound() {
        sale.onBarcode("6565656565");

        assertEquals("12.75€", display.getText());
    }

    @Test
    public void displayPriceOnAnotherProductFound() {
        sale.onBarcode("7878787878");

        assertEquals("9.45€", display.getText());
    }

    @Test
    public void displayProductNotFoundMessageOnNonExistingProduct() {
        sale.onBarcode("NON_EXISTING_PRODUCT_BARCODE");

        assertEquals("Product not found", display.getText());
    }

    @Test
    public void displayProductNotFoundMessageOnBlankBarcode() {
        sale.onBarcode("");

        assertEquals("Product not found", display.getText());
    }

    @Test
    public void displayProductNotFoundMessageOnNullBarcode() {
        sale.onBarcode(null);

        assertEquals("Product not found", display.getText());
    }

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
                display.setText("Product not found");
            }
        }
    }

    public class Display {

        private String text;

        public void setText(String text) {
            this.text = text;
        }

        public String getText() {
            return this.text;
        }
    }
}
