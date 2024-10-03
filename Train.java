import java.util.ArrayList;

public class Train {
    private Engine engine;
    private ArrayList<Car> cars;
    
    //constructor
    public Train(FuelType fuelType, double fuelCapacity, int numbersOfCars, int passengerCapacity) {
        engine = new Engine(fuelType, fuelCapacity);
        cars = new ArrayList<>();

        for (int i = 0; i < numbersOfCars; i++) {
            cars.add(new Car(passengerCapacity));
        }
    }

    //get method from engine class
    public Engine getEngine() {
        return engine;
    }

    //get method from car class
    public Car getCar(int i) {
        if (i >= 0 && i < cars.size()) {
            return cars.get(i);
        }
        return null;
    }
    
    //get maxcapacity of car,encapsulation
    public int getMaxCapacity() {
        int maxCapacity = 0;
        for (Car car : cars) {
            maxCapacity += car.getCapacity();
        }
        return maxCapacity;
    }

    //get seats availalbe,encapsulation
    public int seatsRemaining() {
        int OccupiedSeats = 0;
        for (Car car : cars) {
            OccupiedSeats += car.getCapacity() - car.seatsRemaining();
        }
        return getMaxCapacity() - OccupiedSeats;
    }

    //encapsulation
    public void printManifest() {
        System.out.println("Train Manifest:");
        for (Car car : cars) {
            car.printManifest();
        }
    }
    public static void main(String[] args) {
        Train train = new Train(FuelType.STEAM, 100.0, 3, 50);
        System.out.println("Train Engine Details:");
        System.out.println(train.getEngine());
        System.out.println("\nTrain Max Capacity: " + train.getMaxCapacity());
        System.out.println("\nAvailable Seats: " + train.seatsRemaining());
        train.printManifest();
    }
}
