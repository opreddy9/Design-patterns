package creationalPatterns.BuilderMethod;

import creationalPatterns.BuilderMethod.ConcreteBuilders.CarBuilder;
import creationalPatterns.BuilderMethod.Director.Director;

public class client {
    public static void main(String[] args) {
        Director director=new Director();
        CarBuilder carBuilder=new CarBuilder();
        director.constructSedan(carBuilder);
        System.out.println("Sedan Car: "+carBuilder.getProduct().toString());
        //here it is changing so it is not immutable if we want to make this immutable we have to make the variables final in the car
        // and make constructor of car as private and make a builder class static inside the car class see an example of that
        carBuilder.setEngine("hehe");
        carBuilder.setGPS(false);
        System.out.println("Sedan Car: "+carBuilder.getProduct().toString());
    }
}
