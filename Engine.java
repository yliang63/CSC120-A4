
public class Engine {
  private FuelType fuelType;
  private double currentLevel;
  private double MaxLevel;

  //Constructor
  public Engine(FuelType fuelType2,double max){
    this.fuelType= fuelType2;
    this.currentLevel=max;
    this.MaxLevel=max;
  }

  //refuel therefore the fuel will at maximum value
  public void refuel(){
    currentLevel=MaxLevel;
  }

  //check if the car has enough fuel, and run with decreasing fuel. If not return false.
  public boolean go(){
    if(currentLevel>0){
        System.out.println(currentLevel);
        currentLevel--;
        return true;
    }
    else{
        return false;
    }
    
  }
 
  //checking funcitons
  public static void main(String[] args) {
    Engine myEngine = new Engine(FuelType.ELECTRIC,100.0);
    while (myEngine.go()) {
        System.out.println("Choo choo!");
    }
    System.out.println("Out of fuel.");
}
}