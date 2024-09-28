import java.util.Scanner;

public class pattern5 {
    public static void main(String[] args) {
        int num;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number: ");
        num = input.nextInt();
        int sum = 0, digit;
        while (num !=0)
        {
            digit = num % 10;
            num = num / 10;
            sum = sum + digit;
        }
        System.out.println("sum = " + sum);
    }
    
}
