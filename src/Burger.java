public class Burger extends Item {
    private Item extra1;
    private Item extra2;
    private Item extra3;

    // Constructor without extras
    public Burger(String name, double price) {
        super("Burger", name, price);
    }

    // Override Methods
    @Override
    public double getAdjustedPrice() {
        // TODO Auto-generated method stub

        // Ternary to determine extra cost - if its null, it'll be 0 otherwise it'll call getAdjustedPrice.
        // Gets added to basePrice of burger.
        return getBasePrice() + 
            ((extra1 == null) ? 0 : extra1.getAdjustedPrice()) +
            ((extra2 == null) ? 0 : extra2.getAdjustedPrice()) +
            ((extra3 == null) ? 0 : extra3.getAdjustedPrice());
    }

    @Override
    public String getName() {
        // TODO Auto-generated method stub
        return super.getName() + " BURGER";
    }
    
    // Methods
    public double getExtraPrice(String toppingName) {

        // Making case 1 extra dollar, case 2 extra $1.5
        return switch (toppingName.toUpperCase()) {
            case "AVOCADO", "CHEESE" -> 1.0;
            case "BACON", "HAM", "SALAMI" -> 1.5;
            default -> 0.0;
        };
    }

    public void addToppings(String extra1, String extra2, String extra3) {
        this.extra1 = new Item("TOPPING", extra1, getExtraPrice(extra1));
        this.extra2 = new Item("TOPPING", extra2, getExtraPrice(extra2));
        this.extra3 = new Item("TOPPING", extra3, getExtraPrice(extra3));
    }

    // Itemizing extra toppings
    public void printItemizedList() {
        printItem("BASE BURGER", getBasePrice());
        if (extra1 != null) {
            extra1.printItem();
        }
        if (extra2 != null) {
            extra2.printItem();
        }
        if (extra3 != null) {
            extra3.printItem();
        }
    }

    @Override
    public void printItem() {
        // TODO Auto-generated method stub
        // Including a dash line "-" printed 30 times to separate printItemizedList() and super.printItem()
        printItemizedList();
        System.out.println("-".repeat(30));
        super.printItem();
    }

    
}
