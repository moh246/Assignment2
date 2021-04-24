public class cashier {
    // attributes
    private String casName;
    private int casID;
    private String casAddress;
    public int itemCode;
    public int itemPrice;
    public int itemtax;

    // constructor
    public cashier (String casName, int casID, String casAddress)
    {
        this.casName = casName;
        this.casID = casID;
        this.casAddress = casAddress;
    }

    public void setItemCode(int itemCode) {
        this.itemCode = itemCode;
    }

    public int getItemPrice() {
        switch (itemCode) {
            case (1):
                itemPrice = 10;
                break;
            case (2):
                itemPrice = 20;
                break;
            case (3):
                itemPrice = 30;
                break;
            case (4):
                itemPrice = 40;
                break;
            default:
                itemPrice = 50;
        }
        return itemPrice;
    }


    public int getItemtax() {
        switch (itemCode) {
            case (1):
                itemtax = 1;
                break;
            case (2):
                itemtax = 2;
                break;
            case (3):
                itemtax = 3;
                break;
            case (4):
                itemtax = 4;
                break;
            default:
                itemtax= 5;
        }
        return itemtax;
    }

}