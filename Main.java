import java.util.ArrayList;
import java.util.Scanner;

class Inventory {
int value;
String name, serialNumber;
 
}

class Main {
	public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    ArrayList<Inventory> Items = new ArrayList<Inventory>();
    int userInput; // Going to be the number input of the user

    System.out.println("Press 1 to add an item.");
    System.out.println("Press 2 to delete an item.");
    System.out.println("Press 3 to update an item.");
    System.out.println("Press 4 to show all the items.");
    System.out.println("Press 5 to quit the program.");

    userInput = sc.nextInt();

    while(userInput != 5){  //This will determine the outcome based off what input was given
      switch(userInput){
        case 1:

          Inventory input = new Inventory();

          sc.nextLine();
          System.out.println
            ("Enter the name:");
          input.name = sc.nextLine();
          System.out.println
            ("Enter the serial number:");
          input.serialNumber = sc.nextLine();
          System.out.println
            ("Enter the value in dollars (whole number):");
          input.value = sc.nextInt();

          Items.add(input);
          break;

        case 2:

          sc.nextLine();
          System.out.println
            ("Enter the serial number of the item to delete:");
          String replacementString = sc.nextLine();

          Items.removeIf(n -> n.serialNumber.equals(replacementString));
          break;


        
      }
            System.out.println("Press 1 to add an item.");
      System.out.println("Press 2 to delete an item.");
      System.out.println("Press 3 to update an item.");
      System.out.println("Press 4 to show all the items.");
      System.out.println("Press 5 to quit the program.");
      userInput = sc.nextInt();
    }

	}
}