package creationalPatterns.BuilderMethod.products;

public class Manual {
    private String seatInfo;
    private String engineInfo;
    private String tripComputerInfo;
    private String gpsInfo;

    public void setSeatInfo(int seats) { this.seatInfo = "Seats: " + seats; }
    public void setEngineInfo(String engine) { this.engineInfo = "Engine: " + engine; }
    public void setTripComputerInfo(boolean tripComputer) { 
        this.tripComputerInfo = tripComputer ? "Trip Computer: Included" : "Trip Computer: Not included"; 
    }
    public void setGPSInfo(boolean gps) { 
        this.gpsInfo = gps ? "GPS: Included" : "GPS: Not included"; 
    }

    @Override
    public String toString() {
        return "Manual [" + seatInfo + ", " + engineInfo + ", " + 
               tripComputerInfo + ", " + gpsInfo + "]";
    }
}
