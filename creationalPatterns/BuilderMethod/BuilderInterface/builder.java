package creationalPatterns.BuilderMethod.BuilderInterface;

public  interface builder {
    void reset();
    void setSeats(int seats);
    void setEngine(String engine);
    void setTripComputer(boolean tripComputer);
    void setGPS(boolean gps);

}
