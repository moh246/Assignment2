public class retailShop {

    private long numberOfEmps;
    public int[] goodCategories ;

    public retailShop(long numberOfEmps)
    {
        this.numberOfEmps = numberOfEmps;

    }

    public void setGoodCategories(int[] goodCategories) {
        this.goodCategories = goodCategories;
    }

    public int[] getGoodCategories() {
        return goodCategories;
    }

}
