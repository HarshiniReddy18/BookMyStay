/**
 * UseCase2RoomInitialization
 *
 * This class demonstrates basic room initialization using abstraction,
 * inheritance, and static availability variables.
 *
 * It creates different room types and displays their details.
 *
 * @author Harshini
 * @version 2.1
 */
abstract class Room {

    // Common attributes
    protected int beds;
    protected int size;
    protected double pricePerNight;

    // Constructor
    public Room(int beds, int size, double pricePerNight) {
        this.beds = beds;
        this.size = size;
        this.pricePerNight = pricePerNight;
    }

    // Abstract method
    public abstract String getRoomType();

    // Common method to display room details
    public void displayDetails(int availability) {
        System.out.println(getRoomType() + ":");
        System.out.println("Beds: " + beds);
        System.out.println("Size: " + size + " sqft");
        System.out.println("Price per night: " + pricePerNight);
        System.out.println("Available: " + availability);
        System.out.println();
    }
}

// Single Room
class SingleRoom extends Room {

    public SingleRoom() {
        super(1, 250, 1500.0);
    }

    @Override
    public String getRoomType() {
        return "Single Room";
    }
}

// Double Room
class DoubleRoom extends Room {

    public DoubleRoom() {
        super(2, 400, 2500.0);
    }

    @Override
    public String getRoomType() {
        return "Double Room";
    }
}

// Suite Room
class SuiteRoom extends Room {

    public SuiteRoom() {
        super(3, 750, 5000.0);
    }

    @Override
    public String getRoomType() {
        return "Suite Room";
    }
}

// Main Application
public class BookMyStay {

    public static void main(String[] args) {

        System.out.println("Hotel Room Initialization\n");

        // Static availability variables
        int singleAvailability = 5;
        int doubleAvailability = 3;
        int suiteAvailability = 2;

        // Polymorphism: using Room reference
        Room single = new SingleRoom();
        Room doubleRoom = new DoubleRoom();
        Room suite = new SuiteRoom();

        // Display details
        single.displayDetails(singleAvailability);
        doubleRoom.displayDetails(doubleAvailability);
        suite.displayDetails(suiteAvailability);
    }
}