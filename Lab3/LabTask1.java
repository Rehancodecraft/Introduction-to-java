import java.util.Scanner;

public class LabTask1 {
    public static void main(String[] args) {
        double amount,dollars,cents,quarters,dimes,nickels,pennies;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the amount: ");
        amount = input.nextDouble();
        cents = amount * 100;
        dollars = cents / 100;
        dollars = (int) dollars;
        cents = cents % 100;
        quarters = cents / 25;
        quarters = (int) quarters;
        cents = cents % 25;
        dimes = cents / 10;
        dimes = (int) dimes;
        cents = cents % 10;
        nickels = cents / 5;
        nickels = (int) nickels;
        cents = cents % 5;
        pennies = cents;
        pennies = (int) pennies;
        System.out.println("Dollars: " + dollars);
        System.out.println("Quarters: " + quarters);
        System.out.println("Dimes: " + dimes);
        System.out.println("Nickels: " + nickels);
        System.out.println("Pennies: " + pennies);


    }
    
}
