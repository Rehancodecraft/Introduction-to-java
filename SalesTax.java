import java.util.Scanner;

public class SalesTax {
    public static void main(String[]args){
    // declaring identifiers
    double price;
    double tax;
    double total;
    String item;
    final double Tax_Rate = 0.055;
    // creating the scanner object to take input from user
    Scanner input = new Scanner(System.in);
    // Getting input from the users
    System.out.println("Item Discription: ");
    item = input.nextLine();
    System.out.println("Item Price: ");
    price = input.nextDouble();
    // calculating tax
    tax = price * Tax_Rate;
    total = price + tax;
    //displaying the results
    System.out.println("Item: " + item);
    System.out.println("Price: " +price);
    System.out.println("Tax: " +tax);
    System.out.println("Total Price: " + total );
    }
}
