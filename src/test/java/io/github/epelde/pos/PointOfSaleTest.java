package io.github.epelde.pos;

import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;

public class PointOfSaleTest {

    private Sale sale;

    private Display display;

    private static final String BARCODE_PRODUCT_1 = "6565656565";
    private static final String PRICE_PRODUCT_1 = "12.75€";
    private static final String BARCODE_PRODUCT_2 = "7878787878";
    private static final String PRICE_PRODUCT_2 = "9.45€";

    @Before
    public void setUp() {
        display = new Display();
        Map<String, String> catalog = new HashMap<>();
        catalog.put(BARCODE_PRODUCT_1, PRICE_PRODUCT_1);
        catalog.put(BARCODE_PRODUCT_2, PRICE_PRODUCT_2);
        sale = new Sale(display, catalog);
    }

    @Test
    public void displayedPriceOnProductFound() {
        sale.onBarcode(BARCODE_PRODUCT_1);

        assertEquals(PRICE_PRODUCT_1, display.getText());
    }

    @Test
    public void displayPriceOnAnotherProductFound() {
        sale.onBarcode(BARCODE_PRODUCT_2);

        assertEquals(PRICE_PRODUCT_2, display.getText());
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
