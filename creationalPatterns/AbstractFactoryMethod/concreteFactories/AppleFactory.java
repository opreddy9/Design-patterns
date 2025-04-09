package creationalPatterns.AbstractFactoryMethod.concreteFactories;

import creationalPatterns.AbstractFactoryMethod.ConcreteProductInterface.Apple.Iphone14;
import creationalPatterns.AbstractFactoryMethod.ConcreteProductInterface.Apple.Iphone15;
import creationalPatterns.AbstractFactoryMethod.FactoryInterface.Factory;
import creationalPatterns.AbstractFactoryMethod.productInterface.Phone;

public class AppleFactory implements Factory{
    public AppleFactory(){

    }
    @Override
    public Phone createPhone(String type){
        Phone phone=null;
        switch (type.toLowerCase()) {
            case "iphone14":
                phone=new Iphone14();
                break;
            case "iphone15":
                phone=new Iphone15();
                break;
            default:
                break;
        }
        return phone;
    }
}
