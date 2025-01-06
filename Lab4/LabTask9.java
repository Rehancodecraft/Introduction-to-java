import java.util.*;
public class LabTask9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Pennies: ");
        int pennies = input.nextInt();
        System.out.print("Enter Nickels: ");
        int nickels = input.nextInt();
        System.out.print("Enter Dimes: ");
        int dimes = input.nextInt();
        System.out.print("Enter Quarters: ");
        int quarters = input.nextInt();
        int cents = pennies * 1;
        cents = cents + (nickels * 5);
        cents = cents + (dimes * 10);
        cents = cents + (quarters * 25);
        if( cents == 100){
            System.out.println("Congratulations! you are the winner.");

        }
        else if(cents > 100){
            System.out.println("Alas! you lose, Its more than one dollar.");
        }
        else if (cents < 100){
            System.out.println("Alas! you lose, Its less than one dollar.");
        }
    }
    
}
