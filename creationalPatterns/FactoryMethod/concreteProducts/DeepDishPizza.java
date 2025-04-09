package creationalPatterns.FactoryMethod.concreteProducts;

import creationalPatterns.FactoryMethod.productInterface.*;

public class DeepDishPizza  implements pizza{
    public DeepDishPizza(){
        System.out.println("deep dish Pizza is Created");

    }
    public void base(){
        System.out.println("deep dish Pizza Base is created");
    }
    public void topping(){
        System.out.println("deep dish Pizza topping is added with cheese and tomato sause fuck ton load");

    }
    
    public void bake(){
        System.out.println("deep dish Pizza baked in oven with heavy skilet ");
    }

    public void cut(){
        System.out.println("deep dish Pizza cut into 6 slices with a pizza cutter");
    }

    public void serve(){
        System.out.println("deep dish Pizza Base is served with chicago love ");
    }

    public void box(){
        System.out.println("deep dish Pizza Base is boxed for delivery why the fuck are you living when you want to eat fucking deep dish");
    }
}
