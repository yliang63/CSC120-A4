/**
 * The engine class represents the engine that runs on a specific type of fuel with specific fuel level.
 */
public class Engine {
    private FuelType fuelType;
    private double currentLevel;
    private double maxLevel;

    /**
     * Constructs an Engine object with specific fuel type and maximum fuel level.
     * 
     * @param fuelType2 The type of fuel the engines run on.
     * @param max The maximum fuel level that the engine can hold.
     */
    public Engine(FuelType fuelType2,double max){
        this.fuelType= fuelType2;
        this.currentLevel=max;
        this.maxLevel=max;
    }

    /**
     * Refuels the engine to its maximum level.
     */
    public void refuel(){
        currentLevel=maxLevel;
    }

    /**
     * Checks if the engine has enough fuel to function. If there is, decreases the fuel level by one and return true, else return false.
     * 
     * @return true if the engine has enough fuel, else return flase if the engine if out of fuel.
     */
    public boolean go(){
        if(currentLevel>0){
            System.out.println(currentLevel);
            currentLevel--;
            return true;
        }else{
            return false;
        }
    
    }
 
    /**
     * This method is to display the functionality of this class.
     */
    public static void main(String[] args) {
        Engine myEngine = new Engine(FuelType.ELECTRIC,100.0);
        while (myEngine.go()) {
            System.out.println("Choo choo!");
        }
        System.out.println("Out of fuel.");
    }
}