import java.util.Scanner;

public class seq9 {
    public static void main(String[] args) {
        int a;
        Scanner input = new Scanner(System.in);
         System.out.print("Enter a number: ");
         a = input.nextInt();
         for (int i = 1; i <=10; i++)
        {    
        System.out.println(a+"*"+i + "="+ a * i);
        }
         System.out.println();
    }
    
}
