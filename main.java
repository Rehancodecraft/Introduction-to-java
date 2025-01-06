import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double a = sc.nextDouble();

        System.out.print("Enter second number: ");
        double b = sc.nextDouble();

        System.out.println("1. Addition");
        System.out.println("2. Substraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.print("Which operation you want to do: ");
        
        int z = sc.nextInt();

        
        if (z == 1) {
            double c = a + b;
            System.out.println("Answer is: " + c);
        } else if (z == 2) {
            double d = a - b;
            System.out.println("Answer is: " + d);
        } else if (z == 3) {
            double e = a * b;
            System.out.println("Answer is: " + e);
        } else if (z == 4) {
            double f = a / b;
            if (b == 0) {
                System.out.println("Error: Division by zero is not allowed.");
            } else {
                System.out.println("Answer is: " + f);
            }
        } else {
            System.out.println("Invalid operation");
        }
    }
}