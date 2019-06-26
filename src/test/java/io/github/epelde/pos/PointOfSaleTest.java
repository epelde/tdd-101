package io.github.epelde.pos;

import org.junit.Before;
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
    public void displayedPriceOnBarcodeEvent() {
        sale.onBarcode("6565656565");
        assertEquals("12.75€", display.getText());
    }

    @Test
    public void displayNothingOnBlankBarcode() {
        sale.onBarcode("");
        assertEquals("", display.getText());
    }

    @Test
    public void displayNothingOnNullBarcode() {
        sale.onBarcode(null);
        assertEquals("", display.getText());
    }

    public class Sale {

        private final Display display;

        Sale(Display display) {
            this.display = display;
        }

        public void onBarcode(String barcode) {
            if (barcode!= null && barcode.equals("6565656565")) {
                display.setText("12.75€");
            }
        }
    }

    public class Display {

        private String text = "";

        public void setText(String text) {
            this.text = text;
        }

        public String getText() {
            return this.text;
        }
    }
}
