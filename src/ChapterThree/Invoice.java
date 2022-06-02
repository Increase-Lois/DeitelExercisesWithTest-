package ChapterThree;

public class Invoice {
    private String partNumber;
    private String partDescription;
    private int qtyItemPurchased;
    private double pricePerItem;

    public Invoice(String partNumber, String partDescription, int qtyItemPurchased, double pricePerItem) {

        this.partNumber = partNumber;
        this.partDescription = partDescription;
        if (qtyItemPurchased > 0.0 )this.qtyItemPurchased = qtyItemPurchased;
        if (pricePerItem > 0.0) this.pricePerItem = pricePerItem;


    }

    public String getPartNumber() {
        return partNumber;
    }

    public void setPartNumber(String partNumber) {
        this.partNumber = partNumber;
    }

    public String getPartDescription() {
        return partDescription;
    }

    public void setPartDescription(String partDescription) {
        this.partDescription = partDescription;
    }

    public int getQtyItemPurchased() {
        return qtyItemPurchased;
    }

    public void setQtyItemPurchased(int qtyItemPurchased) {
        this.qtyItemPurchased = qtyItemPurchased;
    }

    public double getPricePerItem() {
        return pricePerItem;
    }

    public void setPricePerItem(double pricePerItem) {
        if (pricePerItem > 0.0) {
            this.pricePerItem = pricePerItem;
        } else {
            this.pricePerItem = 0;
        }
    }
    public double getInvoiceAmount() {
        return qtyItemPurchased * pricePerItem;
    }
}
