# TMPS(Tehnici si Mecanici de Proiectare Software ) Labs
## Lab 1
### Topic:Creational Design Patterns
### Author
Spivac Iana, FAF-192, Software Engineering student at TUM.

### Introduction/Theory
Studying and understanding the Creational Design Patterns.
In software engineering, creational design patterns are design patterns that deal with object creation mechanisms,
trying to create objects in a manner suitable to the situation. Creational design patterns are composed of two dominant ideas. 
One is encapsulating knowledge about which concrete classes the system uses. Another is hiding how instances of these concrete classes are created and combined.
The creational patterns aim to separate a system from how its objects are created, composed, and rep.resented. 
They increase the system’s flexibility in terms of the what, who, how, and when of object creation

### Implementation & Explanation
In this laboratory work were implemented Creational Design Patterns such as builder,factory and singleton.
As a domain, there was choosen a restuarant which has a `menu`, which represents a singleton instance, because
for any restuarant, menu is unique. As main dishes which this `menu` contains are `burgers` and `pizzas`.
`Burger` class was designed by use of the builder method, it contains required items such as buns,meat and sauce and having
other things like vegetables and cheese which can be added optionaly.
`Pizza`class was designed by the use of factory method, `pizza`'s types may differ based on the ingredients.

### Conclusions
While doing this lab work, it was easy to identify which patterns the domain choosen uses and so, finding this connection made
it easier to understand how to implement patterns. At some point I was confused if the usage of builder method was correct, in my case `burger` class
wasn't complexe, but still, by addding build methods, I noticed how useful it may be if class has many components.

