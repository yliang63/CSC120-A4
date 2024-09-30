public class Passenger {
    
    private String name;
    
    public Passenger(String name) {
        this.name = name;
    }
    
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
