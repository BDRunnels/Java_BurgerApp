// public class Meal {
//     private String burger;
//     private String side;
//     private String drink;
//     private boolean deluxeMeal;

//     // Constructor
//     public Meal() {
//         this("Regular burger", "Small Fries", "Small Coke", false);
//     }

//     public Meal(String burger, String side, String drink, boolean deluxeMeal) {
//         if (deluxeMeal == false) {
//             this.burger = burger;
//             this.side = side;
//             this.drink = drink;
//         } else {
            

//         }
//     }

//     @Override
//     public String toString() {
//         return "Meal [burger=" + burger + ", side=" + side + ", drink=" + drink + ", cost=$10" + "]";
//     }

//     // Override toString
    
    
    
// }

// class Burger extends Meal {

//     private String burgerType;


//     public Burger(String burgerType, String side, String drink, boolean deluxeMeal) {
//         super((burgerType == "Cheeseburger") ? "Cheeseburger" : "Hamburger", side, drink, false);
//     }
    
// }

// class Side extends Meal {
//     private String sideType;

//     public Side(String burger, String sideType, String drink, boolean deluxeMeal) {
//         super(burger, (sideType == "Fries") ? "Fries" : "Coleslaw" , drink, deluxeMeal);
        
//     }

    

// }

// class Drink extends Meal {

// }

// class DeluxeMeal extends Meal {

//     private String toppings;

   
//     public DeluxeMeal(boolean deluxeMeal, String toppings) {
//         this.toppings = toppings;
//         System.out.println("Deluxe meal cost of $20");
//     }


//     @Override
//     public String toString() {
//         return "DeluxeMeal [toppings=" + toppings + "]";
//     }
    
    
    
// }

