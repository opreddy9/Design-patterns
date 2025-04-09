package creationalPatterns.AbstractFactoryMethod;

import creationalPatterns.AbstractFactoryMethod.concreteFactories.Factoryconcrete;
import creationalPatterns.AbstractFactoryMethod.productInterface.*;

public class client {
    public static void main(String[] args) {
        Factoryconcrete factory =new Factoryconcrete();
        Phone phone=factory.createPhone("Apple", "Iphone14");
        phone.call();

        Phone phone2=factory.createPhone("Nothing","phone3a");
        phone2.browse();

        Phone phone3=factory.createPhone("Samsung", "S24");
        phone3.takePhoto();
        phone3.recordVideo();

    }
    
}
