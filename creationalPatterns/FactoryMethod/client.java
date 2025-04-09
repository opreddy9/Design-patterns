package creationalPatterns.FactoryMethod;

import creationalPatterns.FactoryMethod.concreteCreator.*;
import creationalPatterns.FactoryMethod.productInterface.*;
public class client {
    public static void main(String[] args) {
        pizza pizza =null;
        PizzaCreatorConcrete pizzaCreatorConcrete = new PizzaCreatorConcrete();
        pizza= pizzaCreatorConcrete.createPizza("Margarita");
        pizza.base();
        pizza.topping();
        pizza.bake();
        pizza.cut();
        pizza.serve();
        pizza.box();
        System.out.println("-------------------------------------------------");
        pizza= pizzaCreatorConcrete.createPizza("DeepDish");
        pizza.base();
        pizza.topping();
        pizza.bake();
        pizza.cut();
        pizza.serve();
        pizza.box();


    }
    
}
