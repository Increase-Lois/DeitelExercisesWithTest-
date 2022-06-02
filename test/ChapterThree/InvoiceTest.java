package ChapterThree;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class InvoiceTest {
    Invoice invoice;
    Invoice invoice2;

    @BeforeEach
    void setUp(){
        invoice = new Invoice("140","Battery",
                5, 3000);
    }
    @Test
    public void newInvoiceCanBeCreatedTest(){
        invoice.setPartNumber("70");
        invoice.setPartDescription("Grocery");
        invoice.setQtyItemPurchased(2);
        invoice.setPricePerItem(2000);
        assertEquals("70",invoice.getPartNumber());
        assertEquals("Grocery", invoice.getPartDescription());
        assertEquals(2, invoice.getQtyItemPurchased());
        assertEquals(2000, invoice.getPricePerItem());
    }

    @Test
    public void invoiceAmountCanBeGottenTest(){
       assertEquals(15000,invoice.getInvoiceAmount());
    }

    @Test
    void pricePerItemReturnsZeroWhenNegativeTest(){
        invoice2 = new Invoice("5","Shack",
                -3, -90);
        assertEquals("5",invoice2.getPartNumber());
        assertEquals("Shack", invoice2.getPartDescription());
        assertEquals(0, invoice2.getQtyItemPurchased());
        assertEquals(0, invoice2.getPricePerItem());
    }

}
