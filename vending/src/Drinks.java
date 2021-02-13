public class Drinks implements Items{
    private String itemName;
    private int amount;
    private double price;
    private boolean empty;

    public Drinks() {
        System.out.print("please insert items specification");
    }

    public Drinks(String itemName, int amount, double price) {
        this.itemName = itemName;
        this.amount = amount;
        this.price = price;
        empty = false;
    }

    private void checkAmount() {
        empty = amount >= 0;
    }

    @Override
    public void getItem() {
        checkAmount();
        if (empty) {
            throw new ArithmeticException("Sorry we don't have enough items");
        } else {
            amount--;
        }
    }

    @Override
    public String getItemName() {
        return itemName;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public int getNumberOfItems() {
        return amount;
    }

    @Override
    public void setItemName(String name) {
        this.itemName = name;
    }

    @Override
    public void setAmount(int amount) {
        this.amount = amount;
    }

    @Override
    public void setPrice(double price) {
        this.price = price;
    }
}
