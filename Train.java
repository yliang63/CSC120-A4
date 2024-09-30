import java.util.ArrayList;

public class Train {
    private Engine engine;
    private ArrayList<Car> cars;

    public Train(FuelType fuelType, double fuelCapacity, int numbersOfCars, int passengerCapacity) {
        engine = new Engine(fuelType, fuelCapacity);
        cars = new ArrayList<>();

        for (int i = 0; i < numbersOfCars; i++) {
            cars.add(new Car(passengerCapacity));
        }
    }

    public Engine getEngine() {
        return engine;
    }

    public Car getCar(int i) {
        if (i >= 0 && i < cars.size()) {
            return cars.get(i);
        }
        return null;
    }

    public int getMaxCapacity() {
        int maxCapacity = 0;
        for (Car car : cars) {
            maxCapacity += car.getCapacity();
        }
        return maxCapacity;
    }

    public int seatsRemaining() {
        int OccupiedSeats = 0;
        for (Car car : cars) {
            OccupiedSeats += car.getCapacity() - car.seatsRemaining();
        }
        return getMaxCapacity() - OccupiedSeats;
    }

    public void printManifest() {
        System.out.println("Train Manifest:");
        for (Car car : cars) {
            car.printManifest();
        }
    }
}
