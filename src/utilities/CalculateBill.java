package utilities;

import com.lab1.domain.burgerBuilder.Burger;
import com.lab1.domain.pizzaFactory.Pizza;

public class CalculateBill {
    public int calculateBill(Order order) {
        int billSum = 0;

        for (Pizza pizza : order.getPizzas())
            billSum += pizza.getPrice();

        for (Burger burger : order.getBurgers())
            billSum += burger.getPrice()
                    ;
        return billSum;
    }
}
