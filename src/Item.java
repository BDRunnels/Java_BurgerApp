public class Item {
    private String type;
    private String name;
    private double price;
    private String size = "MEDIUM"; // Defaulting size to MEDIUM. Change happens with setSize, getName gets called in printItem.

    // Constructor
    public Item(String type, String name, double price) {
        this.type = type.toUpperCase();
        this.name = name.toUpperCase();
        this.price = price;
    }

    // GETTERS
    public String getName() {
        // If type is a side or drink, expecting size to small medium or large, NOT included with "TOPPING"
        if (type.equals("SIDE") || type.equals("DRINK")) {
            return size + " " + name;
        }
        return name;
    }

    public double getBasePrice() {
        return price;
    }

    // Adjusts price for size.
    public double getAdjustedPrice() {
        return switch (size) {
            case "SMALL" -> getBasePrice() - 0.5;
            case "LARGE" -> getBasePrice() + 1;
            default -> getBasePrice();
        };
    }

    // SETTERS 
    public void setSize(String size) {
        this.size = size;
    }

    // Printers
    public static void printItem(String name, double price) {
        // Formatting a string literal - this string has two specifiers
            // %s is for a string, 20 means how large the string is (20 characters)
            // %f is for a float, 6 places before the decimal and 2 decimal places
        System.out.printf("%20s:%6.2f%n", name, price);
    }
    public void printItem() {
        printItem(getName(), getAdjustedPrice());
    }
}
