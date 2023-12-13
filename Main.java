import java.util.ArrayList;

public class Main {
  public static void main (String[] args) {
    int numOfDoors = 100;
    ArrayList<Boolean> doors = new ArrayList<>(numOfDoors);
    // Start with all doors closed
    for (int i = 0; i < numOfDoors; i++) {
      doors.add(false);
	}
    
    // Go through the doors 100 times
      for (int d = 0; d <= numOfDoors; d++) {
        for (int door = d; door < numOfDoors; door++) {
        doors.set(door, !doors.get(door));
         
      }
    // Print which doors are open
    for (int i = 1; i < numOfDoors; i++) {
      if (doors.get(i)) {
        System.out.println("Door "+(i+1)+" is open");
      }
    }
  }
 }
}
