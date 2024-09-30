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

  public static void main(String[] args){

  }
}
