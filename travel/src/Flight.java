import java.util.*;
public class Flight {
    //each object is a piece of information about passengers flight information
    int flightNumber;
    String passengerName;
    String origin;
    String destination;
    String date;
    int numPassengers;
    double price;
    int confirmationNumber;

    public Flight(int flightNumber, String passengerName, String origin, String destination, String date, int numPassengers, double price) {
        this.confirmationNumber = confirmationNumber;
        this.date = date;
        this.flightNumber = flightNumber;
        this.price = price;
        this.passengerName = passengerName;
        this.origin = origin;
        this.numPassengers = numPassengers;
    }

    public void setConfirmationNumber(int confirmationNumber) {
        this.confirmationNumber = confirmationNumber;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public void setFlightNumber(int flightNumber) {
        this.flightNumber = flightNumber;
    }

    public void setNumPassengers(int numPassengers) {
        this.numPassengers = numPassengers;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public void setPassengerName(String passengerName) {
        this.passengerName = passengerName;
    }

    public int getConfirmationNumber() {
        return confirmationNumber;
    }

    public double getPrice() {
        return price;
    }

    public int getFlightNumber() {
        return flightNumber;
    }

    public int getNumPassengers() {
        return numPassengers;
    }

    public String getDate() {
        return date;
    }

    public String getDestination() {
        return destination;
    }

    public String getOrigin() {
        return origin;
    }

    public String getPassengerName() {
        return passengerName;
    }


}
