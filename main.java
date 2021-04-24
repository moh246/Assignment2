import java.util.Scanner;
public class main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        // A check if the customer item exists in the shop.
        System.out.println("Enter the customer item");
        cu
        customer cusone = new customer("Ahmed", 42, "helwan", "cash", 2);
        System.out.println(cusone.customerItem);
        retailShop shop1 = new retailShop(24);
        int [] categories_list = {4,6,9};
        shop1.setGoodCategories(categories_list);
        int[] ctg = shop1.getGoodCategories();
        for (int i = 0; i<categories_list.length; i++)
        {
            if(cusone.customerItem == categories_list[i])
            {
                System.out.println("it exists");
            }

        }
         // Printing the price from the cashier
        cashier csr = new cashier("Ali", 422, "Aswan");
        csr.setItemCode(1);
        int price = csr.getItemPrice();
        int tax = csr.getItemtax();
        System.out.println(price+tax);


        retailShop shop = new retailShop(24);
        int [] Goods = {1,2,3,4,5};

        shop.setGoodCategories(Goods);
        int [] goodsCategory = shop.getGoodCategories();
        for (int i = 0; i<goodsCategory.length; i++){
            System.out.println(goodsCategory[i]);
        }






    }
}