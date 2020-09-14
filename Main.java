import java.util.Scanner;
/**
 * This program asks the quantity of each computer part then calculates the subtotal, taxes, and total cost
 * @author Jackson
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    //create a scanner for user input
    Scanner input = new Scanner(System.in);

    //ask how many chromebook chargers
    System.out.println("How many chromebook chargers?");

    //declare and initialize the variable for chargers
    double charger = input.nextDouble();

    //ask how many motherboards
    System.out.println("How many motherboards?");

    //declare and initialize the variable for motherboards
    double board = input.nextDouble();

    //ask how many mice
    System.out.println("How many mice?");

    //declare and initialize the variable for computer mice
    double mice = input.nextDouble();
    
    //calculate subtotal
    double subtotal = charger*34.99 + board*127.50 + mice*18.0;

    //calculate taxes
    double taxes = charger*34.99*0.13 + board*127.50*0.13 + mice*18.0*0.13;

    //calculate total
    double total = subtotal + taxes;

    //tell user subtotal
    System.out.println("Subtotal = $" + subtotal);

    //tell user taxes
    System.out.println("Taxes = $" + taxes);

    //tell user total
    System.out.println("Total = $" + total);
  }
}
