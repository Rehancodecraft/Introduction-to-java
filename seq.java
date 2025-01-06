import java.util.Scanner;

public class seq{
    public static void main (String[]args){
        int a;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a: ");
        a = input.nextInt();
       
        if (a % 2 == 0)
        {
        System.out.println("a is even");
        }
        else
        {
        System.out.println("a is odd");
        }
    }
}