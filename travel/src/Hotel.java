import java.util.*;
public class Hotel {
    int hotelId;
    String name;
    String location;
    String checkIn;
    String checkOut;
    int numGuests;
    double price;
    int confirmationNumber;

    public Hotel(int hotelId, String name, String location, String checkIn, String checkOut, int numGuests, double price) {
        this.hotelId = hotelId;
        this.name = name;
        this.location = location;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
        this.numGuests = numGuests;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public int getConfirmationNumber() {
        return confirmationNumber;
    }

    public int getHotelId() {
        return hotelId;
    }

    public int getNumGuests() {
        return numGuests;
    }

    public String getCheckIn() {
        return checkIn;
    }

    public String getCheckOut() {
        return checkOut;
    }

    public String getLocation() {
        return location;
    }

    public String getName() {
        return name;
    }

    public void setCheckIn(String checkIn) {
        this.checkIn = checkIn;
    }

    public void setCheckOut(String checkOut) {
        this.checkOut = checkOut;
    }

    public void setHotelId(int hotelId) {
        this.hotelId = hotelId;
    }

    public void setConfirmationNumber(int confirmationNumber) {
        this.confirmationNumber = confirmationNumber;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNumGuests(int numGuests) {
        this.numGuests = numGuests;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
