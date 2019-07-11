package airport;

public class Flight {

    private String airlineName;
    private int flightNumber;
    private String origin;
    private String destination;

    public Flight(String airlineName, int flightNumber, String origin, String destination){
        this.airlineName = airlineName;
        this.flightNumber = flightNumber;
        this.origin = origin;
        this.destination = destination;
    }

    //Getter and setter functions for the airline data will now be created

    public String getAirlineName() {
        return airlineName;
    }

    //In reality the airline name will probably never change
    public void setAirlineName(String airlineName) {
        this.airlineName = airlineName;
    }

    public int getFlightNumber() {
        return flightNumber;
    }

    //Flight numbers are subject to change in reality hence the setter
    public void setFlightNumber(int flightNumber) {
        this.flightNumber = flightNumber;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    //Override toString function
    @Override
    public String toString(){
        String result = "Airline: " + airlineName + "\n";
        result += "Flight Number: " + flightNumber + "\n";
        result += "Origin: " + origin + "\n";
        result += "Destination: " + destination;
        return result;

        /*return "Airline: " + airlineName + "\n" + "Flight Number: " + flightNumber
                + "\n" + "Origin: " + origin +
                "\n" + "Destination: " + destination;
                */
    }
}
