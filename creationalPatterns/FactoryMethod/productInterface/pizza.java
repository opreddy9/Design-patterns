package creationalPatterns.FactoryMethod.productInterface;
//we created porduct which can do these actions but every pizza will do it in its own way may differ in toppings and type of bake like 
//may use different oven and different base type some thin and some burnt edges ,deep dish pizza has different base some have leoparding
//some have different boxes dependent on the size of pizza, some are served different
public interface pizza{
    String name="";
    void base();
    void topping();
    void bake();
    void cut();
    void box();
    void serve();
}