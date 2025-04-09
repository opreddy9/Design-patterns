package creationalPatterns.AbstractFactoryMethod.ConcreteProductInterface.Samsung;

import creationalPatterns.AbstractFactoryMethod.productInterface.Phone;

public class S25 implements Phone {
    public void call(){
        System.out.println("S25 calling...");
    }

    public void text(){
        System.out.println("S25 texting....");
    }

    public void play(){
        System.out.println("S25 playing...");
    }

    public void browse(){
        System.out.println("S25 browsing...");
    }
    public void takePhoto(){
        System.out.println("S25 taking photo say cheese...");
    }

    public void recordVideo(){
        System.out.println("S25 recording video...");
    }

    public void playMusic(){
        System.out.println("S25 playing music...");
    }
}
