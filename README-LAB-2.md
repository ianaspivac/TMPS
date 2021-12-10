# Creational Design Patterns


## Author: Spivac Iana

----

## Objectives:

* Study and understand the Structural Design Patterns.
* As a continuation of the previous laboratory work, think about the functionalities that system will be needed to be provide to the user.
*  Implement some additional functionalities using structural design patterns.


## Used Design Patterns: 

* Adapter
* Facade
* Bridge


## Implementation

Adapter design pattern was used to implement the functionality of the serving process of the order
which can be:
* Served directly
* Delivered
* Take out

I've choosed this pattern as there is a default state for a restaurant to serve locally and
on request there is other way to which the order packaging should adapt and it is comoratable
to use such implementation.

The default action is served locally aka ServingLocally, the other 2 methods use the
adapter:
```
com/lab1/domain/orderServingAdapter/ServingAdapter.java

public class ServingAdapter implements Serving {

    ServingMethod servingMethod;

    public ServingAdapter(String servingType){

        if(servingType.equalsIgnoreCase("takeOut") ){
            servingMethod = new ServeTakeOut();

        }else if (servingType.equalsIgnoreCase("delivery")){
            servingMethod = new ServeViaDelivery();
        }
    }
                        ...
}
```
Adapter implements interface Serving

```
com/lab1/domain/orderServingAdapter/Serving.java

public interface Serving {
    void serveOrder(String servingType, Order order);
}
```
and interface with Serving Methods
```
com/lab1/domain/orderServingAdapter/ServingMethod.java

public interface ServingMethod {
    void serveViaDelivery(Order order);
    void serveTakeOut(Order order);
}
```

The next design pattern is brigde, it was used to implement payment functionality which can
be payed in lei/dollar and card/cash.
It's comfortable to have such mix as there is no need in creation of separate 4 classes and
they can be combined between them and there could be added more currencies and card/cash implementation
will not suffer changes.

The Bill is an abstract class:
```
com/lab1/domain/paymentBridge/Bill.java

public abstract class Bill {
    protected PaymentMethod paymentMethod;

    protected Bill(PaymentMethod paymentMethod){
        this.paymentMethod = paymentMethod;
    }
    public abstract void payBill();
}
```
The concrete implementation of this class is DollarBill and LeiBill, both of which implements
the payment method Cash or Card.
Here is the LeiBill, where paymentMethod would be based on the choice of the client
```
com/lab1/domain/paymentBridge/LeiBill.java

public class LeiBill extends Bill {
    private int sum;

    public LeiBill(int sum, PaymentMethod paymentMethod) {
        super(paymentMethod);
        this.sum = sum;
    }
    public void payBill() {
        paymentMethod.pay(Integer.toString(sum) + " lei");
    }
}
```
In Main, which is client:
```
com/lab1/client/Main.java

 Bill billLei = new LeiBill(billSum, new Card());
```
Card is the paymentMethod which would be choosed and it's implementation:
```
com/lab1/domain/paymentBridge/Card.java

public class Card implements PaymentMethod {
    @Override
    public void pay(String sum) {
        System.out.println("Client paid " + sum + " with card");
    }
}
```

Facade represent the restaurant itselft, the client just orders food and recives it:
```
com/lab1/client/Main.java

restaurantFacade.orderFood(order)
```
While facade contains multiple processes and classes such as waiter and cook, where the basic
function are made, waiter recives order, announces kitchen, the food is prepared, waiter is called,
waiter serves the order.
I used facade as it perfectly describes a restuarant, people go to eat, and they don't
care about process, only the result.
```
com/lab1/domain/restaurantFacade/RestaurantFacade.java

   public Order orderFood(String[] order) {
        waiter.writeOrder(order);
        waiter.sendToKitchen();
        cook.prepareFood(order);
        this.order = cook.callWaiter();
        waiter.serveCustomer(this.order);
        return this.order;
    }
```
## Conclusions / Screenshots / Results
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
