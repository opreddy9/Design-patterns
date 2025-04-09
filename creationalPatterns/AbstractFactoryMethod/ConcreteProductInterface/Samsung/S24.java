package creationalPatterns.AbstractFactoryMethod.ConcreteProductInterface.Samsung;

import creationalPatterns.AbstractFactoryMethod.productInterface.Phone;

public class S24  implements Phone{
    public void call(){
        System.out.println("S24 calling...");
    }

    public void text(){
        System.out.println("S24 texting....");
    }

    public void play(){
        System.out.println("S24 playing...");
    }

    public void browse(){
        System.out.println("S24 browsing...");
    }
    public void takePhoto(){
        System.out.println("S24 taking photo say cheese...");
    }

    public void recordVideo(){
        System.out.println("S24 recording video...");
    }

    public void playMusic(){
        System.out.println("S24 playing music...");
    }
}
