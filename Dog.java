public class Dog {

    private String name; // name of the dog

    private double weight; // the weight of the dog in pounds

    private int age; // how old the dog is in years

    private String color; // what color is the dog

    private boolean checkedIn; // did the dog check in

    private boolean needsBathToday; // if gotten bath == false, if need bath == true

    private int lengthOfStay; // number of days the dog will stay at the daycare

    // default constructor
    public Dog() {

    }

    // parameterized constructor to set the dog name, weight, age and color
    public Dog(String name, double weight, int age, String color) {

        this.name = name;
        this.weight = weight;
        this.age = age;
        this.color = color;
    }

    // sets true if the dog checked in, and false if the dog is not checked in
    public void setCheckedIn(boolean checkedIn) {

        this.checkedIn = checkedIn;
    }

    // returns if the dog is checked in
    public boolean getCheckedIn() {

        return checkedIn;
    }

    // sets true if the dog needs a bath, and false if the dog doesn't need a bath
    public void setNeedsBathToday(boolean needsBathToday) {

        this.needsBathToday = needsBathToday;
    }

    // returns the value true if the dog needs a bath, and return false if the dog doesn't need a bath
    public boolean getNeedsBathToday() {

        return needsBathToday;
    }

    // sets the number of days the dog will be staying
    public void setLengthOfStay(int lengthOfStay) {

        this.lengthOfStay = lengthOfStay;
    }

    // returns the value for the amount of days the dog will be staying
    public int getLengthOfStay() {

        return lengthOfStay;
    }

    // needs to increment dog age by one
    public void birthday() {

        age++;
    }


}