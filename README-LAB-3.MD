# Behavioral Design Patterns


## Author: Spivac Iana

----

## Objectives:

* Study and understand the Behavioral Design Patterns.
* As a continuation of the previous laboratory work, think about the functionalities that system will be needed to be provide to the user.
*  Implement some additional functionalities using structural design patterns.


## Used Design Pattern: 

* Command

## Implementation

I've chosen this pattern as I thought it could fit for the behaviour of the preparing
food for restaurant.

So I've used Prepare interface which is implemented in PrepareBurger class and PreparePizza class:
```
com/lab1/domain/prepareCommand/PrepareBurger.java

public class PrepareBurger implements Prepare {
    private Food food;

    public PrepareBurger(Food food) {
        this.food = food;
    }

    public Order execute(Order order) {
        return food.burger(order);
    }
}
```
Both of these classes containts Food class which mainly indicates the type of food (which type of pizza or burger).
This Food class looks the following way:

```
com/lab1/domain/prepareCommand/Food.java

public class Food {
    private String foodType;

    public Food(String foodType) {
        this.foodType = foodType;
    }

    public Order burger(Order order) {
        BurgerClient burgerClient = new BurgerClient();
        Burger burger = burgerClient.getBurger(foodType);
        order.addBurger(burger);
        System.out.println(burger.getName() + " was prepared.");

        return order;
    }

    public Order pizza(Order order) {
        PizzaFactory pizzaFactory = new PizzaFactory();
        Pizza pizza = pizzaFactory.getPizza(foodType);
        order.addPizza(pizza);
        System.out.println(pizza.getName() + " was prepared.");

        return order;
    }
}
```
Food class contains 2 methods for ways of preparing food, being different foods, burger and pizza have their own way of preparing, but
both of them represents a component of Order.
Order is a class which contains arrays of pizzas and burgers, in that way when the method execute of Prepare class is called:
```
com/lab1/domain/prepareCommand/Prepare.java

public interface Prepare {
    Order execute(Order order);
}
```
And it is called inside Cook class:
```
com/lab1/domain/restaurantFacade/restaurantStaff/Cook.java

public class Cook {
    Order order = new Order();
    Prepare prepare;

    public void reciveOrder(Prepare prepare){
       this.prepare = prepare;
    }

    public void cookFood(){
        order = prepare.execute(order);
    }

...
};
```
The prepare element is obtained from the call inside the facade.
Here depending on which type of food is, the objects are created, so for
burger, should be used PrepareBurger which is saved inside cook class and executed.
```
 private void prepareFood(String[] orders) {
        for (String foodName : orders) {
            Food food = new Food(foodName);
            String[] pizzas = {"americanaPizza", "chickenPizza", "funghiPizza", "pepperoniPizza"};
            String[] burgers = {"miniChickenBurger", "miniCheeseBurger", "chickenBurger", "chillyBurger", "cheeseBurger", "shrimpBurger"};

            for (String pizza : pizzas) {
                if (pizza.equals(foodName)) {
                    PreparePizza preparePizza = new PreparePizza(food);
                    cook.reciveOrder(preparePizza);
                }
            }
            for (String burger : burgers) {
                if (burger.equals(foodName)) {
                    PrepareBurger prepareBurger = new PrepareBurger(food);
                    cook.reciveOrder(prepareBurger);
                }
            }
            cook.cookFood();
        }
    }
...
  public Order orderFood(String[] order) {
        ...
        prepareFood(order);
        ...
        return this.order;
    }
```
## Conclusions / Screenshots / Results
Comparing to the previous lab, this implementation was a good feature as it made
the Cook class more specific, as the main task is to recieve order, cook and give prepared to waiter,
and the main logic of the preparing food was separated and are defined better.
The output looks like this:
```
Waiter takes the order: Chicken Burger; Americana Pizza;
Order is sent to kitchen.
All ingredients were prepared for Chicken Burger
All ingredients added to Americana Pizza and put into oven
Cook prepared the order and waits to be served.
Waiter packages the dishes and brings them to clients:
---------------------------
Pizza name:Americana Pizza
Price:118
Ingredients:[Chicken, Tomatoes, Ham, Olives, Mushrooms, Parmesan]
---------------------------
Burger name: Chicken Burger
Price:59
Bun type: Sesame seed
Sauce: Mustard
Meat: Chicken
Additional ingredients: [Rucola, Cucumbers, Onions, Tomatoes]
Client paid 177 lei with card
Client paid 9 dollars with cash
```
