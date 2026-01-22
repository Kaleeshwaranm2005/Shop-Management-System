import java.util.ArrayList;

public class ShoppingList {
    private ArrayList<Item> items = new ArrayList<>();

    public void addItem(String name, int quantity) {
        items.add(new Item(name, quantity));
    }

    public boolean removeItem(String name) {
        return items.removeIf(item -> item.getName().equalsIgnoreCase(name));
    }

    public void showList() {
        if (items.isEmpty()) {
            System.out.println("Shopping list is empty.");
            return;
        }
        System.out.println("Your Shopping List:");
        for (Item item : items) { // enhanced looping
            System.out.println("- " + item);
        }
    }

    public boolean findItem(String name) {
        for (Item item : items) {
            if (item.getName().equalsIgnoreCase(name)) {
                return true;
            }
        }
        return false;
    }
    public int countItems() {
        return items.size();
    }
}