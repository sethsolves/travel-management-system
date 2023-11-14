import java.util.*;

public class TravelApp {
    // An ArrayList which contains objects of the Flight class
    //each time, we need to create a new object of the Flight class,
    //and add it to the flights ArrayList, since flights is an array
    //of objects
    ArrayList<Flight> flights = new ArrayList<Flight>();
    //the same goes for the hotel ArrayList
    ArrayList<Hotel> hotel = new ArrayList<Hotel>();
    //Methods
    public void searchFlights(String origin, String destination, String date, int numPassengers) {
        System.out.println("Searching for available flights..");
    }
    public void bookFlight(int flightNumber, String passengerName, String origin, String destination, String date, int numPassengers, double price) {
        Flight theflight = new Flight(flightNumber, passengerName, origin, destination, date, numPassengers, price);
        Random rand = new Random();
        theflight.confirmationNumber = rand.nextInt(100000000, 999999999);
        System.out.println("Flight confirmation number: " + theflight.confirmationNumber);
        //reserves a flight and returns a random number
        //flightConfirmationNumber
    }

    public void searchHotels(String location, String checkIn, String checkOut, int numGuests) {
        System.out.println("Searching for available hotels..");
    }

    public void bookHotel(int hotelId, String name, String location, String checkIn, String checkOut, int numGuests, double price) {
        //reserves a hotel room and returns a random number
        Hotel thehotel = new Hotel(hotelId, name, location, checkIn, checkOut, numGuests, price);
        //hotelConfirmationNumber
        Random rand = new Random();
        thehotel.confirmationNumber = rand.nextInt(1000000, 9999999);
        System.out.println("Hotel confirmation number: " + thehotel.confirmationNumber);
    }
    public void cancelReservation(int confirmationNumber){
        //cancels the hotel or flight reservation
    }


}
