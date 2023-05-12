import java.util.*;

public class DayCare {
    
    ArrayList<Dog> roster = new ArrayList();

    // pass the dog object in to check in that dog
    public void checkIn(Dog d) {

        roster.add(d);
    }

    // remove the dog from the roster
    public void checkOut(String dogName) {

        roster.remove(dogName);
    }

    // flip the boolean needBath from true to false for all dogs that is true
    public void giveBaths() {

        for (int index = 0; index < roster.size(); index++) {

            if (roster.get(index).getNeedsBathToday() == true) {

                roster.get(index).setNeedsBathToday(false);
            }
        }

    }
}