public class Passenger {
    
    private String name;
    
    //Constructor
    public Passenger(String name) {
        this.name = name;
    }
    
    //if the car is full, return false. If there is available seat, add the passenger and return ture.
    public boolean Boardcar(Car c){
        if(c.addPassenger(this)){
            System.out.println(this.name+"boarded th car successfully.");
            return true;
        }
        else{
            System.out.println("The car is full");
        }
        return false;
    }

    //Check if the passenger is onboard, return true and remove the name. Else, return false if not.
    public boolean getOffCar(Car c){
        if (c.removePassenger(this)) {
            System.out.println(this.name + " got off the car.");
            return true;
        } 
        else {
            System.out.println(this.name + " was not onboard the car.");
        }
        return false;
    }
}
