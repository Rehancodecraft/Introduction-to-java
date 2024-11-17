import java.util.Scanner;

public class LabTask1_b {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int number = input.nextInt();
        reverse(number);
        input.close();
    }
    public static void reverse(int number){
        int reverseNumber = 0;
        while (number > 0){
        int rem = number % 10;
        number /= 10;
        reverseNumber = reverseNumber * 10 + rem;
        }
        System.out.println("The reversed number is: " + reverseNumber);
    }
    
}
