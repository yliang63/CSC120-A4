import java.util.ArrayList;

public class Car {
  private ArrayList<Passenger> passengers;
    private int maxCapacity;

  public Car(int max){
    this.maxCapacity=max;
    this.passengers = new ArrayList<>(maxCapacity);
  }
  
  public int getCapacity(){
    return maxCapacity;
  }

  public int seatsRemaining(){
    return maxCapacity-passengers.size();
  }

  public boolean addPassenger(Passenger p){
    if(seatsRemaining()>0){
        passengers.add(p);
        return true;
    }
    return false;
  }

  public boolean removePassenger(Passenger p){
    if(passengers.contains(p)){
        passengers.remove(p);
        return true;
    }
    return false;
  }
  
  public void printManifest(){
    if(passengers.size()==0){
      System.out.println("This car is Empty");
    }
    else{
      System.out.println(passengers);
    }
  }
  
  public static void main(String[] args){

  }
}
