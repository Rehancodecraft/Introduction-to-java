import java.util.Scanner;

public class LabTask2{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int number = input.nextInt();
        int originalNumber = number;
        int reverseNumber = reverse(number);
        System.out.println(isPalindrome(originalNumber, reverseNumber));
        
        
    }
    public static int reverse(int number){
        int reverseNumber = 0;
        while ( number > 0){
            int rem = number % 10;
            reverseNumber = reverseNumber * 10 + rem;
            number = number / 10;
        }
        return reverseNumber;
    }
    public static boolean isPalindrome(int a, int b){
        return a == b;
    }
}
