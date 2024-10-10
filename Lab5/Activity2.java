import java.util.Scanner;

public class Activity2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of " + " integers in the list: ");
        int limit = input.nextInt();
        System.out.println();
        int sum = 0;
        int counter = 0;
        System.out.println("Enter " + limit + "integers.");
        while(counter < limit){
            int number = input.nextInt();
            sum = sum + number;
            counter++;
        }
        System.out.printf("The sum of the %d"+" numbers = %d%n",limit,sum);
        if(counter !=0)
            System.out.printf("The average = %d%n", (sum / counter));
            else
                System.out.println("No input.");
    }
    
}
