package unsw.shopping;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class CheckoutSystem {
    private int amountPurchased;
    private SupermarketStrategy supermarketStrategy;

    private CheckoutSystem(String supermarket) {
        if (supermarket.equals("Coles")) {
            this.supermarketStrategy = new ColesStrategy();
        } else {
            this.supermarketStrategy = new WooliesStrategy();
        }
    }

    public static CheckoutSystem instance(String supermarket) {
        return new CheckoutSystem(supermarket);
    }

    private void welcome() {
        System.out.println("Welcome! Please scan your first item. If you have a " + supermarketStrategy.getCardName()
                + " card, please scan it at any time.");
    }

    private boolean takePayment(int paymentAmount, String paymentMethod) {
        if (paymentAmount < amountPurchased) {
            System.out.println("Not enough $$$.");
            return false;
        }

        if (paymentMethod.equals("cash")) {
            System.out.println("Paid $" + paymentAmount + " with $" + (paymentAmount - amountPurchased) + " change.");
        } else {
            paymentAmount = amountPurchased;
            System.out.println("Paid $" + paymentAmount + ".");
        }
        return true;
    }

    public void checkout(List<Item> items, String paymentMethod, int paymentAmount, boolean receipt) {
        welcome();

        scanItems(items);

        if (!takePayment(paymentAmount, paymentMethod))
            return;

        if (receipt)
            supermarketStrategy.printReceipt(items);
    }

    public void scanItems(List<Item> items) {
        // Supermarkets have restrictions on the number of items allowed
        if (!supermarketStrategy.validateItems(items))
            return;

        if (items.size() == 0) {
            System.out.println("You do not have any items to purchase.");
            return;
        }

        amountPurchased = items.stream().mapToInt(Item::getPrice).sum();
    }

    public static void main(String[] args) {
        List<Item> items = new ArrayList<Item>(
                Arrays.asList(new Item("Apple", 1), new Item("Orange", 1), new Item("Avocado", 5)));

        CheckoutSystem checkout = new CheckoutSystem("Woolies");
        checkout.checkout(items, "cash", 200, true);
    }
}
