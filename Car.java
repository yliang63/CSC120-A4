import java.util.ArrayList;

/**
 * The Car class means that a car can carry passengers with maximum capacity.
 */
public class Car {
    private ArrayList<Passenger> passengers;
    private int maxCapacity;
  
    /**
     * Contructs a Car with specified maximum capacity.
     * Initializes the list of passengers based on the specified maximum capacity.
     * 
     * @param max The maximum capcities of passengers that the car can have.
     */
    public Car(int max){
        this.maxCapacity=max;
        this.passengers = new ArrayList<>(maxCapacity);
    }
  
    /**
     * Returns the msimum capacity of the car.
     * 
     * @return The maximum capcity of the car.
     */
    public int getCapacity(){
        return maxCapacity;
    }

    /**
     * Calculates the number of remaining seats available in the car.
     * 
     * @return The remainning seats that the car have.
     */
    public int seatsRemaining(){
        return maxCapacity-passengers.size();
    }
  
    /**
     * Adds a passenger to the car. If the passenger is onboard or there are seats remaining, return true. Return flase if there is no seats remaining.
     * 
     * @param p The passenger that is added to the car.
     * @return true if the passenger is already on the list or the passenger is added successfully, false it there are no available seats.
     */
    public boolean addPassenger(Passenger p){
        if(passengers.contains(p)){
            System.out.println("Passengers already onboard.");
            return true;
        } else{
            if(seatsRemaining()>0){
                passengers.add(p);
                return true;
            }
        }
        return false;
    }

    /**
     * Removes the passenger from the car if they are onboard.
     * 
     * @param p The passenger that is removed from the car.
     * @return true if the passenger is removed successfully, false if the passenger is not found in the list.
     */
    public boolean removePassenger(Passenger p){
        if(passengers.contains(p)){
            passengers.remove(p);
            return true;
        }
        return false;
    }
  
    /**
     * Prints the current manifest of  passenger in the car.
     * Prints "This car is empty" if the car is empty.
     * 
     */
    public void printManifest() {
      if (passengers.size() == 0) {
          System.out.println("This car is Empty");
      } else {
          for (Passenger p : passengers) {
              System.out.println(p.getName());
          }
      }
    }

    /**
     * This method is to display the functionality of the class
     */
    public static void main(String[] args){
        Car car = new Car(5);

        Passenger passenger1 = new Passenger("Yvonne");
        Passenger passenger2 = new Passenger("Liang");
        Passenger passenger3 = new Passenger("Jasmine");


        car.addPassenger(passenger1);
        car.addPassenger(passenger2);

        System.out.println("Current manifest:");
        car.printManifest();

        car.removePassenger(passenger1);

        System.out.println("\nUpdated manifest:");
        car.printManifest();

        car.addPassenger(passenger3);

        System.out.println("\nFinal manifest:");
        car.printManifest();
    }
}

