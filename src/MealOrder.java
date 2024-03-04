public class MealOrder {
    private Burger burger;
    private Item drink;
    private Item side;

    // Constructors
    // DEFAULT MEAL
    public MealOrder() {
        this("regular", "coke", "fries");
    }
    // Constructing the meal parts. We create a burger instance and drink / side both item instances. Encapsulating the details of the meal.
    public MealOrder(String burgerType, String drinkType, String sideType) {

        // If burgerType is deluxe it will create a new DeluxeBurger otherwise a default burger.
        if (burgerType.equalsIgnoreCase("deluxe")) {
            this.burger = new DeluxeBurger(burgerType, 8.5);
        } else {
            this.burger = new Burger(burgerType, 4.0);
        }
        this.drink = new Item("drink", drinkType, 1.00);
        this.side = new Item("side", sideType, 1.50);
    }

    // Methods
    // Setting adjusted prices for each item and returning.
    public double getTotalPrice() {

        // If burger is deluxe burger, it WILL NOT include the side item.
        if (burger instanceof DeluxeBurger) {
            return burger.getAdjustedPrice();
        }
        return side.getAdjustedPrice() + drink.getAdjustedPrice() + burger.getAdjustedPrice();
    }

    public void printItemizedList() {

        burger.printItem();
        if (burger instanceof DeluxeBurger) {
            Item.printItem(drink.getName(), 0);
            Item.printItem(side.getName(), 0);
        } else {
            drink.printItem();
            side.printItem();
        }
        System.out.println("-".repeat(30));
        Item.printItem("TOTAL PRICE", getTotalPrice());
    }

    // FOR BASE BURGER
    public void addBurgerToppings(String extra1, String extra2, String extra3) {
        burger.addToppings(extra1, extra2, extra3);
    }

    // FOR DELUXE BURGER, calling override method on addToppings in DeluxeBurger class
    public void addBurgerToppings(String extra1, String extra2, String extra3, String extra4, String extra5) {
        if (burger instanceof DeluxeBurger db) {
            db.addToppings(extra1, extra2, extra3, extra4, extra5);
        } else {
            burger.addToppings(extra1, extra2, extra3);
        }
    }

    // SETTING DRINK SIZE
    public void setDrinkSize(String size) {
        drink.setSize(size);
    }
    public void setSideSize(String size) {
        side.setSize(size);
    }

}
