import java.util.Scanner;

public class LabTask1_a {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");
        long number = input.nextLong();
        sumDigits(number);
    }
    public static void sumDigits(long number){
        long sum = 0;
        while (number > 0){
            long rem = number % 10;
            number  /= 10;
            sum += rem;
        }
        System.out.println("The sum of all digits are " + sum );
    }
    
}
