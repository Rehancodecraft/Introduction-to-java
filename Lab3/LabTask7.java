import java.util.*;
public class LabTask7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Tickets of Class A: ");
        int classA = input.nextInt();
        System.out.print("Tickets of Class B: ");
        int classB = input.nextInt();
        System.out.print("Tickets of Class C: ");
        int classC = input.nextInt();
        System.out.print("Tickets of Class D: ");
        int classD = input.nextInt();
        int incomeA = classA * 20;
        int incomeB = classB * 15;
        int incomeC = classC * 10;
        int incomeD = classD * 5;
        int totalincome = incomeA + incomeB + incomeC + incomeD;
        System.out.println("Class A tickets sold "+classA+" Income "+incomeA);
        System.out.println("Class A tickets sold "+classB+" Income "+incomeB);
        System.out.println("Class A tickets sold "+classC+" Income "+incomeC);
        System.out.println("Class A tickets sold "+classD+" Income "+incomeD);
        System.out.println("Total Income: "+ totalincome);
        input.close();
    }
    
}
