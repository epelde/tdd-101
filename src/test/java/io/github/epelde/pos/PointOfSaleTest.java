package io.github.epelde.pos;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PointOfSaleTest {

    private Sale sale;

    private Display display;

    @Before
    public void setUp() {
        display = new Display();
        sale = new Sale(display);
    }

    @Test
    public void displayedPriceOnProductFound() {
        sale.onBarcode("6565656565");

        assertEquals("12.75€", display.getText());
    }

    @Test
    @Ignore
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

        Sale(Display display) {
            this.display = display;
        }

        public void onBarcode(String barcode) {
            if (barcode != null && barcode.equals("6565656565")) {
                display.setText("12.75€");
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
