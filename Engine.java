

public class Engine {
  private FuelType fuelType;
  private double currentLevel;
  private double MaxLevel;

  public enum FuelType {
    STEAM, INTERNAL_COMBUSTION, ELECTRIC, OTHER;
  }
  public Engine(FuelType fuelType2,double max){
    this.fuelType= fuelType2;
    this.currentLevel=max;
    this.MaxLevel=max;
  }

  public void refuel(){
    currentLevel=MaxLevel;
  }
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

  public static void main(String[] args) {
    Engine myEngine = new Engine(FuelType.ELECTRIC,100.0);
    while (myEngine.go()) {
        System.out.println("Choo choo!");
    }
    System.out.println("Out of fuel.");
}
}