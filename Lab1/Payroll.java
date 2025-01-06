import java.util.Scanner;

public class Payroll{
    public static void main(String[]args){
        // creating a scanner object to get input from user
        Scanner Lab = new Scanner(System.in);
        // declaring the variables;
        double hours;
        double payroll;
        double result;
        //taking the hours input from user
        System.out.println("How many hours did you worked? ");
        hours = Lab.nextDouble();
        // taking the par-rate input from the user
        System.out.println("How much do get paid per hour? ");
        payroll = Lab.nextDouble();
        // calculations 
        if (hours <= 40 )
            result = hours * payroll;
        else
            result = (hours - 40) * (1.5 * payroll) + 40 * payroll;
        // Gross pay 
        System.out.println("You earned "+result+"$ pay");

    }
}