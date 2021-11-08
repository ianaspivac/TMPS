package utilities;

import com.lab1.burgerBuilder.Burger;
import com.lab1.domain.pizzaFactory.Pizza;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private List<Pizza> pizzas;
    private List<Burger> burgers;

    public Order() {
        this.pizzas = new ArrayList<Pizza>();
        this.burgers = new ArrayList<Burger>();
    }

    public void addPizza(Pizza pizza) {
        pizzas.add(pizza);
    }

    public void addBurger(Burger burger) {
        burgers.add(burger);
    }

    public List<Pizza> getPizzas() {
        return pizzas;
    }

    public List<Burger> getBurgers() {
        return burgers;
    }
}
