import java.util.*;

class Main {
  public static void main(String[] args) {

    DayCare care = new DayCare();
    

    String name = "";
    double weight;
    int age;
    String color = "";
    boolean checkedIn = false;

    String checkedInProcess = "";


    Scanner input = new Scanner(System.in);

    while (true) {

      checkedInProcess = "";

      while (!checkedInProcess.equals("y")) {

        System.out.println("Do you want to check in your dog? [y/n]");
        checkedInProcess = input.next();
      }

    System.out.println("What is your dog's name? ");
    name = input.next();

    System.out.println("What is your dog's approximate weight (in lbs.)?");
    weight = input.nextDouble();

    System.out.println("What is your dog's age?");
    age = input.nextInt();

    System.out.println("What is the color of your dog's coat?");
    color = input.next();

    System.out.println("Do you want to check in you dog now? [true/false] ");
    checkedIn = input.nextBoolean();

     if (checkedIn) {

      care.roster.add(new Dog(name, weight, age, color));

      System.out.println("How many days will your dog be checked in?");
      care.roster.get(care.roster.size() -1).setLengthOfStay(input.nextInt());

      System.out.println("Do you want to give your dog a bath today? (Extra $5) [true/false]");
      care.roster.get(care.roster.size() -1).setNeedsBathToday(input.nextBoolean());

    }

    

    }





  }
}