package creationalPatterns.AbstractFactoryMethod.concreteFactories;

import creationalPatterns.AbstractFactoryMethod.ConcreteProductInterface.Nothing.Phone3;
import creationalPatterns.AbstractFactoryMethod.ConcreteProductInterface.Nothing.Phone3a;
import creationalPatterns.AbstractFactoryMethod.FactoryInterface.Factory;
import creationalPatterns.AbstractFactoryMethod.productInterface.*;

public class NothingFactory implements Factory{
    public NothingFactory(){

    }
    @Override
    public Phone createPhone(String type){
        Phone phone=null;
        switch(type.toLowerCase()){
            case "phone3":
                phone = new Phone3();
                break;
            case "phone3a":
                phone = new Phone3a();
                break;
            default:
                break;
        }
        return phone;
    }
    
}
