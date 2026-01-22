public class Item {
    private String name;
    private int quantity;
   // constructor
    public Item(String name, int quantity) {
        this.name = name;
        this.quantity = quantity;
    }
    //getter
    public String getName() {
        return name;
    }
    public int getQuantity() {
        return quantity;
    }
    @Override
    public String toString() {
        return name + " (x" + quantity + ")";
    }
}