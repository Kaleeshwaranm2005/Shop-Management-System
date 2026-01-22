import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ShoppingList shoppingList = new ShoppingList(); // Object is been created for the shoppinglist
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.println("\n--- Shopping List Menu ---");
            System.out.println("1. Add Item");
            System.out.println("2. Remove Item");
            System.out.println("3. Show List");
            System.out.println("4. Search Item");
            System.out.println("5. Count Items");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter item name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter quantity: ");
                    int qty = scanner.nextInt();
                    shoppingList.addItem(name, qty);
                    break;
                case 2:
                    System.out.print("Enter item name to remove: ");
                    String itemToRemove = scanner.nextLine();
                    if (shoppingList.removeItem(itemToRemove)) {
                        System.out.println("Item removed.");
                    } else {
                        System.out.println("Item not found.");
                    }
                    break;
                case 3:
                    shoppingList.showList();
                    break;
                case 4:
                    System.out.print("Enter item name to search for: ");
                    String itemToSearch = scanner.nextLine();
                    if (shoppingList.findItem(itemToSearch)) {
                        System.out.println(itemToSearch + " is in the shopping list.");
                    } else {
                        System.out.println(itemToSearch + " is not in the shopping list.");
                    }
                    break;
                case 5:
                    System.out.println("Total items: " + shoppingList.countItems());
                    break;
                case 6:
                    System.out.println("Thank you! Goodbye.");
                    break;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        } while (choice != 6);
        scanner.close();
    }
}