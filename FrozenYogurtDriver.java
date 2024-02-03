package Project2.Project2;
/**
 * Driver Code for FrozenYogurtDriver class, which allows the user to input details for frozen yogurt
 *  @author Bunhout Nub
 * @version 0.1 (Feb 1, 2024)
 */

import java.util.Scanner;

public class FrozenYogurtDriver{
  public static void main(String[] args){

    Scanner scanner = new Scanner(System.in);
    //Variables to store input details for frozen yogurt
    String name = "";
    double price = 0.0;
    String yogurtFlavor = "";
    String topping = "";
    
    //Welcome message
    System.out.println("Welcome to the Frozen Yogurt Selector");
    
    //Create two FrozenYogurt objects
    FrozenYogurt yogurtA = new FrozenYogurt(name, price, yogurtFlavor, topping);
    FrozenYogurt yogurtB = new FrozenYogurt();

    //Prompt the user to input the name of the first yogurt
    System.out.print("\nPlease enter the name of the first frozen yogurt: ");
    name = scanner.next();  
    yogurtA.setName(name);
    System.out.println("You entered: "+name);

    //Prompt the user to input the name of the second yogurt
    System.out.print("Please enter the name of the second frozen yogurt: ");
    name = scanner.next();
    yogurtB.setName(name);
    System.out.println("You entered: "+name);

    //Prompt the user to input the price of the first yogurt
    System.out.print("Please enter the price for the "+yogurtA.getName()+": ");
    price = scanner.nextDouble();
    yogurtA.setPrice(price);
    System.out.println("You entered: "+price);

    //Prompt the user to input the price of the second yogurt
    System.out.print("Please enter the price for the "+yogurtB.getName()+": ");
    price = scanner.nextDouble();
    yogurtB.setPrice(price);
    System.out.println("You entered: "+price);
  
    //Prompt the user to input the flavor of the first yogurt
    System.out.print("Please enter the base yogurt flavor for "+yogurtA.getName()+": ");
    yogurtFlavor = scanner.next();
    yogurtA.setYogurtFlavor(yogurtFlavor);
    System.out.println("You entered: "+yogurtFlavor);

    //Prompt the user to input the flavor of the second yogurt
    System.out.print("Please enter the base yogurt flavor for "+yogurtB.getName()+": ");
    yogurtFlavor = scanner.next();
    yogurtB.setYogurtFlavor(yogurtFlavor);
    System.out.println("You entered: "+yogurtFlavor);

    //Prompt the user to input the topping of the first yogurt
    System.out.print("Please enter the topping to add to "+yogurtA.getName()+": ");
    topping = scanner.next();
    yogurtA.setTopping(topping);
    System.out.println("You entered: "+topping);

    //Prompt the user to input the topping of the second yogurt
    System.out.print("Please enter the topping to add to "+yogurtB.getName()+": ");
    topping = scanner.next();
    yogurtB.setTopping(topping);
    System.out.println("You entered: "+topping);
    
    //Display description of both frozen yogurt
    System.out.println(yogurtA.description());
    System.out.println(yogurtB.description());
    
    System.out.println("Thank you!");
    scanner.close();
  }
}