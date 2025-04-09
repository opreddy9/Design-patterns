package creationalPatterns.AbstractFactoryMethod.FactoryInterface;
import creationalPatterns.AbstractFactoryMethod.productInterface.Phone;

public interface Factory {
    public Phone createPhone(String type);
    
}
