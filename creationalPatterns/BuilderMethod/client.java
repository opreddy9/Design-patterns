package creationalPatterns.BuilderMethod;

import creationalPatterns.BuilderMethod.ConcreteBuilders.CarBuilder;
import creationalPatterns.BuilderMethod.Director.Director;

public class client {
    public static void main(String[] args) {
        Director director=new Director();
        CarBuilder carBuilder=new CarBuilder();
        director.constructSedan(carBuilder);
        System.out.println("Sedan Car: "+carBuilder.getProduct().toString());
        carBuilder.setEngine("hehe");
        carBuilder.setGPS(false);
        System.out.println("Sedan Car: "+carBuilder.getProduct().toString());
    }
}
