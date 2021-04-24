public class item {
    public int itemCode;
    public int itemPrice;

    public item(int itemCode)
    {
        this.itemCode = itemCode;
    }
    // get the item from the customer
    public int calculateItemPrice (int itemCode)
    {
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

    }

