package io.github.epelde.pos;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class PointOfSaleTest {

    private Sale sale;
    private Display display;

    @Before
    public void setUp() {
        sale = new Sale();
        display = new Display();
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
        public void onBarcode(String barcode) {

        }
    }

    public class Display {
        public String getText() {
            return "12.75€";
        }
    }
}
