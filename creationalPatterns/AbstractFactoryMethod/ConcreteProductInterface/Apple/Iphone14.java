package creationalPatterns.AbstractFactoryMethod.ConcreteProductInterface.Apple;

import creationalPatterns.AbstractFactoryMethod.productInterface.Phone;

public class Iphone14 implements Phone {
    public void call(){
        System.out.println("Iphone14 calling...");
    }

    public void text(){
        System.out.println("Iphone14 texting....");
    }

    public void play(){
        System.out.println("Iphone14 playing...");
    }

    public void browse(){
        System.out.println("Iphone14 browsing...");
    }
    public void takePhoto(){
        System.out.println("Iphone14 taking photo say cheese...");
    }

    public void recordVideo(){
        System.out.println("Iphone14 recording video...");
    }

    public void playMusic(){
        System.out.println("Iphone14 playing music...");
    }
    
    
}
