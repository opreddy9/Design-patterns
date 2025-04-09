package creationalPatterns.BuilderMethod.ConcreteBuilders;

import creationalPatterns.BuilderMethod.BuilderInterface.builder;
import creationalPatterns.BuilderMethod.products.*;

public class ManualBuilder implements builder {
    private Manual manual;
    public ManualBuilder(){
        this.manual = new Manual();
    }
    public void setSeats(int seats){
        this.manual.setSeatInfo(seats);
    }
    public void setEngine(String engine){
        this.manual.setEngineInfo(engine);
    }
    public void setTripComputer(boolean tripComputer){
        this.manual.setTripComputerInfo(tripComputer);
    }
    public void setGPS(boolean gps){
        this.manual.setGPSInfo(gps);
    }
    public void reset(){
        this.manual=new Manual();
    }
    public Manual getProduct(){
        Manual product=this.manual;
        this.reset();
        return product;
    }
}
