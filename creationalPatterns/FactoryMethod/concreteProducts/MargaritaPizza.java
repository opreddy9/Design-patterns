package creationalPatterns.FactoryMethod.concreteProducts;
import creationalPatterns.FactoryMethod.productInterface.*;
public class MargaritaPizza implements pizza {
    public MargaritaPizza(){
        System.out.println("Margarita Pizza is Created");

    }
    public void base(){
        System.out.println("Margarita Pizza Base is created");
    }
    public void topping(){
        System.out.println("Margarita Pizza topping is added with cheese and tomato sause from italy");

    }
    
    public void bake(){
        System.out.println("Margarita Pizza baked in classic oven wood fire rosemary and thyme");
    }

    public void cut(){
        System.out.println("Margarita Pizza cut into 8 slices with a pizza cutter");
    }

    public void serve(){
        System.out.println("Margarita Pizza Base is served with italian love mama miya");
    }

    public void box(){
        System.out.println("Margarita Pizza Base is boxed for delivery");
    }
}
