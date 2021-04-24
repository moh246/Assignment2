import java.util.Scanner;

public class customer {
    // Attributes
    private String cusName;
    private int cusAge;
    private String cusAddress;
    public String paymentType;
    public final String[] paymentMethods = {"cash", "cheque", "credit", "debit"};
    public int customerItem;

    // Methods.
    public customer(String cusName, int cusAge, String cusAddress, String paymentType, int customerItem) {
        this.cusName = cusName;
        this.cusAge = cusAge;
        this.cusAddress = cusAddress;
        this.paymentType = paymentType;
        this.customerItem = customerItem;
    }

    private void showingPaymentMethod(String paymentType) {
        for (String s : paymentMethods) {
            if (s.compareToIgnoreCase(paymentType) == 0) {
                System.out.println("this is the customer payment method");
            }
        }
    }

    public void setCustomerItem(int customerItem) {
        this.customerItem = customerItem;
    }

    public int getCustomerItem() {
        return customerItem;
    }

}
/*    public boolean setItem (int customerItem)
        {
            for (int i =0; i< goodCategories.length; i++)
            {
                if (customerItem == goodCategories(i)) {
                    return true;
                }
            }
        }

    }

    //retailShop goodItems[] = new retailShop();
    //int chosens[] = {4,5,6}
    //goodItems.setGoodCategories(chosens);
    //goodItems.getGoodCategories();

    /*
    //Scanner in = new Scanner(System.in);
    int customerItem = in.nextInt();
    public int selectItem(int[] goodItems )
    {
        for(int i =0; i< goodItems.length; i++)
        {
            if(customerItem == goodItems[i]){
                System.out.println("This item exists in the shop");
            }
        }
    }

*/

