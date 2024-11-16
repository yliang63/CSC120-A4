/**
 * The Passenger class is to help a passengers onboard or get off a car.
 */
public class Passenger {
    
    private String name;
    
    /**
     * Contructs a Passenger with given name.
     * 
     * @param name The name of the passenger.
     */
    public Passenger(String name) {
        this.name = name;
    }
    
    /**
     * If the car is full, return false. If there is available seat, add the passenger and return ture.
     * 
     * @return true if there is available seats, false if the car is full. 
     */
    public boolean Boardcar(Car c){
        if(c.addPassenger(this)){
            System.out.println(this.name+"boarded th car successfully.");
            return true;
        }else{
            System.out.println("The car is full");
        }
        return false;
    }

    /**Check if the passenger is onboard, return true and remove the name. Else, return false if not.
     * 
     * @param c The car object to check and get off from.
     * @retrun true if the passenger is onboard, false otherwise.
     */
    public boolean getOffCar(Car c){
        if (c.removePassenger(this)) {
            System.out.println(this.name + " got off the car.");
            return true;
        } else {
            System.out.println(this.name + " was not onboard the car.");
        }
        return false;
    }
    /**
     * Retrieves the name of the passenger.
     * @return The name of the passenger.
     */
    public String getName() {
        return name;
    }

}
