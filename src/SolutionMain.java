public class SolutionMain {
    public static void main(String[] args) {
        // ONLY MY SOLUTION (Main & Meal)
        // Rest are solution

        // Item coke = new Item("drink", "coke", 1.50);
        // coke.printItem();
        // coke.setSize("LARGE");
        // coke.printItem();

        // Item avocado = new Item("Topping", "avocado", 1.50);
        // avocado.printItem();
        // Burger burger = new Burger("regular", 4.00);
        // burger.addToppings("BACON", "CHEESE", "MAYO");
        // burger.printItem();

        // CREATING MEALS
        // MealOrder regularMeal = new MealOrder();
        // regularMeal.addBurgerToppings("BACON", "CHEESE", "MAYO");
        // regularMeal.setDrinkSize("LARGE");
        // regularMeal.printItemizedList();

        // MealOrder secondMeal = new MealOrder("turkey", "7-up", "chili");
        // secondMeal.addBurgerToppings("LETTUCE", "CHEESE", "MAYO");
        // secondMeal.setDrinkSize("SMALL");
        // secondMeal.printItemizedList();
        MealOrder deluxeMeal = new MealOrder("deluxe", "7-up", "chili");
        deluxeMeal.addBurgerToppings("AVOCADO", "BACON", "LETTUCE", "CHEESE", "MAYO");
        deluxeMeal.setDrinkSize("SMALL");
        deluxeMeal.setSideSize("LARGE");
        deluxeMeal.printItemizedList();

        System.out.println(" ");
        
        MealOrder regular = new MealOrder();
        regular.setSideSize("LARGE");
        regular.setDrinkSize("SMALL");
        regular.addBurgerToppings("CHEESE", "AVOCADO", "BACON");
        regular.printItemizedList();

        
    }
}
