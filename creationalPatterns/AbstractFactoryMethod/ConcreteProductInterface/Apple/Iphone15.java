package creationalPatterns.AbstractFactoryMethod.ConcreteProductInterface.Apple;

import creationalPatterns.AbstractFactoryMethod.productInterface.Phone;

public class Iphone15 implements Phone {
    public void call(){
        System.out.println("Iphone15 calling...");
    }

    public void text(){
        System.out.println("Iphone15 texting....");
    }

    public void play(){
        System.out.println("Iphone15 playing...");
    }

    public void browse(){
        System.out.println("Iphone15 browsing...");
    }
    public void takePhoto(){
        System.out.println("Iphone15 taking photo say cheese...");
    }

    public void recordVideo(){
        System.out.println("Iphone15 recording video...");
    }

    public void playMusic(){
        System.out.println("Iphone15 playing music...");
    }
}
