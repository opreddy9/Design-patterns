package creationalPatterns.AbstractFactoryMethod.concreteFactories;

import creationalPatterns.AbstractFactoryMethod.ConcreteProductInterface.Samsung.S24;
import creationalPatterns.AbstractFactoryMethod.ConcreteProductInterface.Samsung.S25;
import creationalPatterns.AbstractFactoryMethod.FactoryInterface.Factory;
import creationalPatterns.AbstractFactoryMethod.productInterface.Phone;

public class SamsungFactory implements Factory{
    public SamsungFactory(){

    }
    @Override
    public Phone createPhone(String type){
        Phone phone=null;
        switch(type.toLowerCase()){
            case "s24":
                phone = new S24();
                break;
            case "s25":
                phone = new S25();
                break;
            default:
                break;
        }
        return phone;
    }
    
}
