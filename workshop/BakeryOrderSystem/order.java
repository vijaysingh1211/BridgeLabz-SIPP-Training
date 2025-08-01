package workshop.BakeryOrderSystem;

public class order {
    private final String itemName;
    private final int Quantity;
    private final String category;

    public order(String itemName, int Quantity, String category) {
        this.itemName = itemName;
        this.Quantity = Quantity;
        this.category = category;
    }

    @Override
    public String toString() {
        return "itemName" + itemName + "  " + Quantity + " category: " + category ;
    }
}

