public class Main {
    public static void main(String[] args) {
        TravelApp app = new TravelApp();
        app.searchFlights("New York", "London", "2022-09-01", 1);
        app.searchHotels("London", "2022-08-01", "2022-09-05", 2);
        app.bookFlight(12345670, "Martin Nadine", "New York", "London", "2022-08-01", 1, 700.00 );
        app.bookFlight(67843513, "Jennifer Ulrike", "New York", "London", "2022-08-01", 1, 655.00 );
        app.bookHotel(98765432, "Martin Nadine", "London", "2022-09-01", "2022-09-05", 1, 100.00 );
        app.cancelReservation(12345670);
    }
}
