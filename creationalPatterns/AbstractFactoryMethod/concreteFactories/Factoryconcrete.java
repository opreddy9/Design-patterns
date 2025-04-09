package creationalPatterns.AbstractFactoryMethod.concreteFactories;

import creationalPatterns.AbstractFactoryMethod.productInterface.Phone;

public class Factoryconcrete {
    public Phone createPhone(String phoneCompany,String model){
        Phone phone = null;
        switch (phoneCompany.toLowerCase()){
            case "apple":
                phone = new AppleFactory().createPhone(model);
                break;
            case "samsung":
                phone = new SamsungFactory().createPhone(model);
                break;
            case "nothing":
                phone = new NothingFactory().createPhone(model);
                break;
            default:
                System.out.println("This phone is not available in our store.");
                break;
        }
        return phone;
    }
}
