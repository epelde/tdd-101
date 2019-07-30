package io.github.epelde.pos;

import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;

public class ProductScanningTests {

    private Sale sale;

    private Display display;

    private static final String BARCODE_PRODUCT_1 = "1234567890";
    private static final String PRICE_PRODUCT_1 = "12.75€";
    private static final String BARCODE_PRODUCT_2 = "2345678901";
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

        assertEquals("Product not found NON_EXISTING_PRODUCT_BARCODE", display.getText());
    }

    @Test
    public void displayProductNotFoundMessageOnBlankBarcode() {
        sale.onBarcode("");

        assertEquals("Scanning error: empty barcode", display.getText());
    }

    @Test
    public void displayProductNotFoundMessageOnNullBarcode() {
        sale.onBarcode(null);

        assertEquals("Scanning error: empty barcode", display.getText());
    }

}
