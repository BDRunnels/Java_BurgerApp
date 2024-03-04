* Bill's Burger Challenge *

 - Bill runs a fast food hamburger restaurant and sells hamburger meals.
 - His meal orders are composed of 3 items - hamburger, drink, side.
 - The app lets Bill select the type of burgers, and some of the additional items or extras, that can be added to the burgers as well as the actual pricing.

 - THE OBJECTS
    1) Meal Order - one burger, one drink, one side.
        - Most common meal order should be constructed without any arguments, like a regular burger, small coke, and fries for example.
        - Should be able to create other meal orders by specifying different burgers, drinks and side items.
    2) Drink and Side Item
        - Drink : type, size, and price, & price should change for each size.
        - Side Item : type, price
    3) Burgers
        - Type, base price, up to 3 toppings.
        - Constructor should include only burger type and price.
        - Extra toppings need to be added somehow and priced according to their type.
    4) Deluxe Burger Bonus
        - Create a deluxe burger meal that has a set price.
        - 5 maximum toppings; all included.

- FUNCTIONALITY
    Main method should have code to :
        * Create a default meal, that uses the no arguments constructor
        * Create a meal with a burger, and the drink / side of your choice with up to 3 extra toppings.
        * Create a deluxe burger, where all items, drink, side, and toppings up to 5 are included.
    
    For each meal order :
        * Add some additional toppings to the burger.
        * Change the size of the drink.
        * Print the itemized list. This should include price of burger, any extra toppings, the drink price based on size and the side item price.
        * Print the total due amount for the meal.

----------------------------
* Initial Design Considerations *
    MealOrder - uses composition, which means Item and Burger HAS A mealOrder.
        side: Item
        drink: Item
        burger: Burger
        addToppings()
        setDrinkSize()
        printItemizedList()
        printTotal()

    HAS A
        Item - uses inheritance, which means BURGER IS An Item.
            name: String
            type: String
            price: Double
            size: String
            getBasePrice(): double
            getAdjustedPrice(): double
            printItem()

    HAS A 
        Burger - IS A to ITEM
            extra1: Item
            extra2: Item
            extra3: Item
            addToppings()

        DeluxeBurger - IS A to BURGER, IS A to ITEM
            deluxe1: item
            deluxe2: item
            addToppings()
    
    


