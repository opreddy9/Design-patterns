package creationalPatterns.FactoryMethod.creatorInterface;

import creationalPatterns.FactoryMethod.productInterface.*;

public interface PizzaFactory {

    public pizza createPizza(String type);

}
