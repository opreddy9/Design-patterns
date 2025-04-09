package creationalPatterns.AbstractFactoryMethod.ConcreteProductInterface.Nothing;

import creationalPatterns.AbstractFactoryMethod.productInterface.Phone;

public class Phone3 implements Phone {
    public void call(){
        System.out.println("Phone3 calling...");
    }

    public void text(){
        System.out.println("phone3 texting....");
    }

    public void play(){
        System.out.println("phone3 playing...");
    }

    public void browse(){
        System.out.println("phone3 browsing...");
    }
    public void takePhoto(){
        System.out.println("phone3 taking photo say cheese...");
    }

    public void recordVideo(){
        System.out.println("phone3 recording video...");
    }

    public void playMusic(){
        System.out.println("phone3 playing music...");
    }
}
