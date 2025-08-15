package unsw.shopping;

import java.util.List;

public interface SupermarketStrategy {
    String getCardName();

    boolean validateItems(List<Item> items);

    void printReceipt(List<Item> items);
}
