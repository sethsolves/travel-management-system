# Travel Management System

This is a simple Java console application for managing flights and hotel reservations in a travel system. The program allows users to search for available flights and hotels, book flights and hotels, and cancel reservations.

## Features

- **Flight Class**: Represents flight information, including flight number, passenger name, origin, destination, date, number of passengers, price, and confirmation number. The class provides methods to set and get these attributes.

- **Hotel Class**: Represents hotel information, including hotel ID, name, location, check-in, check-out, number of guests, price, and confirmation number. The class provides methods to set and get these attributes.

- **TravelApp Class**: The main class for the travel application. It includes methods for searching flights and hotels, booking flights and hotels, and canceling reservations. The class uses ArrayLists to store flight and hotel objects.

- **Main Class**: The main class that demonstrates the functionality of the travel application. It creates a `TravelApp` instance and performs various operations like searching for flights and hotels, booking flights and hotels, and canceling reservations.

## How to Use

1. Clone the repository to your local machine.
2. Open the project in your preferred Java development environment (e.g., IntelliJ, Eclipse).
3. Run the `Main` class to execute the travel application.
4. Follow the on-screen prompts to interact with the application. You can enter commands to search for flights and hotels, book flights and hotels, and cancel reservations.

## Commands

- `searchFlights <origin> <destination> <date> <numPassengers>`: Searches for available flights based on the specified criteria.
- `bookFlight <flightNumber> <passengerName> <origin> <destination> <date> <numPassengers> <price>`: Books a flight and generates a confirmation number.
- `searchHotels <location> <checkIn> <checkOut> <numGuests>`: Searches for available hotels based on the specified criteria.
- `bookHotel <hotelId> <name> <location> <checkIn> <checkOut> <numGuests> <price>`: Books a hotel and generates a confirmation number.
- `cancelReservation <confirmationNumber>`: Cancels a flight or hotel reservation based on the confirmation number.

## Sample Usage

```java
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
```

## Author

Sethsolves

## License

This project is licensed under the [MIT License](LICENSE).
