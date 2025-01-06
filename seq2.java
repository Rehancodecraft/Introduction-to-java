import java.util.Scanner;

public class seq2{
    public static void main (String[]args){
        int a;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Marks: ");
        a = input.nextInt();
       if ( a >= 85)
        {
        System.out.println("Grade A");
        }
        else if(a >=75)
        {
        System.out.println("Grade B");
        }
        else if(a >=65)
        {
        System.out.println("Grade C");
        }
        else if(a >= 50)
        {
        System.out.println("Grade D");
        }
        else
        {
        System.out.println("Fail");
        }
    }
}