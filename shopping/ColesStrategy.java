package unsw.shopping;

import java.util.List;

public class ColesStrategy implements SupermarketStrategy {
    private String cardName = "flybuys";

    @Override
    public String getCardName() {
        return cardName;
    }

    @Override
    public boolean validateItems(List<Item> items) {
        if (items.size() > 20) {
            System.out.println("Too many items.");
            return false;
        }
        return true;
    }

    @Override
    public void printReceipt(List<Item> items) {
        System.out.println("Today at Coles you purchased the following:");

        items.stream().forEach(item -> System.out.println("- " + item.getName() + " : $" + item.getPrice()));
    }
}
