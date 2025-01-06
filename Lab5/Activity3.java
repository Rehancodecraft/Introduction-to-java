import java.util.Scanner;

public class Activity3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final int SENTINEL = 999;
        int number;
        int sum = 0;
        int counter = 0;
        System.out.println("Enter positive integers "+"ending with "+ SENTINEL);
        number = input.nextInt();
        while (number != SENTINEL){
            sum = sum + number;
            counter++;
            number = input.nextInt();
        }
        System.out.printf("The sum of %d " +  "numbers = %d%n",counter, sum);
            if(counter !=0)
                System.out.printf("The average = %d%n",(sum/counter));
            else
                System.out.println("No input.");
    }
    
}
