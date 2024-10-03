import java.util.ArrayList;

public class Car {
  private ArrayList<Passenger> passengers;
  private int maxCapacity;

  //Constructore
  public Car(int max){
    this.maxCapacity=max;
    this.passengers = new ArrayList<>(maxCapacity);
  }
  
  //return maximum people 
  public int getCapacity(){
    return maxCapacity;
  }

  //return remaining seat by minus passenger number from maximum numbers of seat.
  public int seatsRemaining(){
    return maxCapacity-passengers.size();
  }
  
  //retuen true if added successfully, return false if not available seat left.
  public boolean addPassenger(Passenger p){
    if(seatsRemaining()>0){
        passengers.add(p);
        return true;
    }
    return false;
  }

  //return true if removing sucessfully, return false if did not find the person.
  public boolean removePassenger(Passenger p){
    if(passengers.contains(p)){
        passengers.remove(p);
        return true;
    }
    return false;
  }
  
  //if the care is empty, print empty, if not, print all of the passenger.
  public void printManifest(){
    if(passengers.size()==0){
      System.out.println("This car is Empty");
    }
    else{
      System.out.println(passengers);
    }
  }
  
  //checking method
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

