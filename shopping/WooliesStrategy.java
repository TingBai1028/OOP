package unsw.shopping;

import java.util.List;

public class WooliesStrategy implements SupermarketStrategy {
    private String cardName = "Everyday Rewards";

    @Override
    public String getCardName() {
        return cardName;
    }

    @Override
    public boolean validateItems(List<Item> items) {
        if (items.size() >= 55) {
            System.out.println("Sorry, that's more than we can handle in a single order!");
            return false;
        }
        return true;
    }

    @Override
    public void printReceipt(List<Item> items) {
        System.out.print("Your purchase: ");

        for (int i = 0; i < items.size() - 1; i++) {
            System.out.print(items.get(i).getName() + ", ($" + items.get(i).getPrice() + "), ");
        }
        System.out
                .println(items.get(items.size() - 1).getName() + " ($" + items.get(items.size() - 1).getPrice() + ").");
    }

}
