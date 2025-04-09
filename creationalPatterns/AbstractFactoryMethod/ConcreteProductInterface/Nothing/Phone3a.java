package creationalPatterns.AbstractFactoryMethod.ConcreteProductInterface.Nothing;

import creationalPatterns.AbstractFactoryMethod.productInterface.Phone;

public class Phone3a implements Phone {
    public void call(){
        System.out.println("Phone3a calling...");
    }

    public void text(){
        System.out.println("phone3a texting....");
    }

    public void play(){
        System.out.println("phone3a playing...");
    }

    public void browse(){
        System.out.println("phone3a browsing...");
    }
    public void takePhoto(){
        System.out.println("phone3a taking photo say cheese...");
    }

    public void recordVideo(){
        System.out.println("phone3a recording video...");
    }

    public void playMusic(){
        System.out.println("phone3a playing music...");
    }
}
