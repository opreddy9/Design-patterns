package creationalPatterns.BuilderMethod.Director;

import creationalPatterns.BuilderMethod.BuilderInterface.builder;
public class Director {
    public void constructSedan(builder builder){
        builder.reset();
        builder.setSeats(4);
        builder.setEngine("V6");
        builder.setTripComputer(false);
        builder.setGPS(true);

    }
    public void constructSUV(builder builder){
        builder.reset();
        builder.setSeats(6);
        builder.setEngine("V6");
        builder.setTripComputer(true);
        builder.setGPS(true);
    }
}
