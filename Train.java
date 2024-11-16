import java.util.ArrayList;

/**
 * The Train class demonstrates a train consisting of an engine and multiple cars.
 */
public class Train {
    private Engine engine;
    private ArrayList<Car> cars;
    
    /**
     * Constructs a Train object with the specified engine and a number of cars.
     *
     * @param fuelType The type of fuel the engine uses.
     * @param fuelCapacity The fuel capacity of the engine.
     * @param numbersOfCars The number of cars in the train.
     * @param passengerCapacity The passenger capacity of each car.
     */
    public Train(FuelType fuelType, double fuelCapacity, int numbersOfCars, int passengerCapacity) {
        engine = new Engine(fuelType, fuelCapacity);
        cars = new ArrayList<>();

        for (int i=0; i<numbersOfCars; i++) {
            cars.add(new Car(passengerCapacity));
        }
    }

    /**
     * Returns the engine of the train.
     * 
     * @return The engine of the train.
     */
    public Engine getEngine() {
        return engine;
    }

    /**
     * Returns a specific car from the train based on its index.
     * 
     * @param i The index of the car to return.
     * @return The car at a specified index, or null if the index is out of the range.
     */
    public Car getCar(int i) {
        if (i>=0 && i<cars.size()) {
            return cars.get(i);
        }
        return null;
    }
    
    /**
     * Calculates the maximum passenger capacity of the train.
     * 
     * @return The number of maximum passengers capacity of the train.
     */
    public int getMaxCapacity() {
        int maxCapacity = 0;
        for (Car car : cars) {
            maxCapacity += car.getCapacity();
        }
        return maxCapacity;
    }

    /**
     * Calculates the number of remaining seats in the train.
     * 
     * @return The number of available seats.
     */
    public int seatsRemaining() {
        int OccupiedSeats = 0;
        for (Car car : cars) {
            OccupiedSeats += car.getCapacity()-car.seatsRemaining();
        }
        return getMaxCapacity()-OccupiedSeats;
    }

    /**
     * @Encapsulation
     * Prints the manifest of the train, including details of all cars.
     */
    public void printManifest() {
        System.out.println("Train Manifest:");
        for (Car car : cars) {
            car.printManifest();
        }
    }

    /**
     * This main method is to demonstrate the functionality of the train.
     */
    public static void main(String[] args) {
        Train train = new Train(FuelType.STEAM, 100.0, 3, 50);
        System.out.println("Train Engine Details:");
        System.out.println(train.getEngine());
        System.out.println("Train Max Capacity: "+train.getMaxCapacity());
        System.out.println("Available Seats: "+train.seatsRemaining());
        train.printManifest();
    }
}
