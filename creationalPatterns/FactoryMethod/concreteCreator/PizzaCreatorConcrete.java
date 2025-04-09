package creationalPatterns.FactoryMethod.concreteCreator;

import creationalPatterns.FactoryMethod.creatorInterface.*;
import creationalPatterns.FactoryMethod.productInterface.*;
import creationalPatterns.FactoryMethod.concreteProducts.*;

public class PizzaCreatorConcrete implements PizzaFactory{
    public pizza createPizza(String type){
        pizza pizza =null;
        switch(type){
            case "Margarita":
                pizza =new MargaritaPizza();
                break;
            case "DeepDish":
                pizza =new DeepDishPizza();
                break;
            default:
                System.out.println("There is no such pizza available in the menu");
                break;
        }
        return pizza;
    }
}
