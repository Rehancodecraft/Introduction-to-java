import java.util.Scanner;

public class Activity3 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String firstName;
        String lastName;
        int age;
        double weight;
        System.out.println("Enter first name, last name, " + "age, and weight separated " + "by spaces.");
        firstName = console.next();
        lastName = console.next();
        age = console.nextInt();
        weight = console.nextDouble();
        System.out.println("Name: " + firstName + " " + lastName);
        System.out.println("Age: " + age);
        System.out.println("Weight: " + weight);

    }
    
}
