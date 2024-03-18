import java.util.ArrayList;
import java.util.List;

// Defines a grocery item with a name and a price.
class Item {
    private String name;
    private double price;

    public Item(String name, double price) {
        this.name = name;
        this.price = price;
    }

    // Retrieves the item's name.
    public String getName() {
        return name;
    }

    // Retrieves the item's price.
    public double getPrice() {
        return price;
    }
}

// Represents an order for an item, including the item itself and the quantity.
// Also handles bulk pricing.
class ItemOrder {
    private Item item;
    private int quantity;
    private double bulkPrice;
    private int bulkQuantity;

    public ItemOrder(Item item, int quantity) {
        this.item = item;
        this.quantity = quantity;
        this.bulkPrice = 0; // Default: no bulk pricing.
        this.bulkQuantity = 0; // Default: no bulk quantity.
    }

    // Sets the bulk pricing and the bulk quantity.
    public void setBulkPricing(double bulkPrice, int bulkQuantity) {
        this.bulkPrice = bulkPrice;
        this.bulkQuantity = bulkQuantity;
    }

    // Calculates the price for the order, considering bulk pricing if applicable.
    public double getPrice() {
        if (bulkPrice > 0 && quantity >= bulkQuantity) {
            int bulkSets = quantity / bulkQuantity;
            int remainingItems = quantity % bulkQuantity;
            return (bulkSets * bulkPrice) + (remainingItems * item.getPrice());
        }
        return quantity * item.getPrice();
    }

    // Retrieves the item in the order.
    public Item getItem() {
        return item;
    }

    // Retrieves the quantity of the item in the order.
    public int getQuantity() {
        return quantity;
    }
}

// Represents a shopping cart that can contain multiple item orders.
class ShoppingCart {
    private List<ItemOrder> orders;

    public ShoppingCart() {
        orders = new ArrayList<>();
    }

    // Adds an item order to the cart.
    public void addItemOrder(ItemOrder order) {
        orders.add(order);
    }

    // Removes an item order from the cart.
    public void removeItemOrder(ItemOrder order) {
        orders.remove(order);
    }

    // Finds an item order in the cart by the item's name.
    public ItemOrder findItemOrder(String itemName) {
        for (ItemOrder order : orders) {
            if (order.getItem().getName().equals(itemName)) {
                return order;
            }
        }
        return null;
    }

    // Calculates the total price of all orders in the cart.
    public double getTotalPrice() {
        double total = 0;
        for (ItemOrder order : orders) {
            total += order.getPrice();
        }
        return total;
    }
}
