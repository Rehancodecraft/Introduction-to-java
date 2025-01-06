import java.util.Scanner;

public class pattern6 {
    public static void main(String[] args) {
        char ch  = 'y';
        int num;
        int sum = 0;
        Scanner input = new Scanner(System.in);
        while (ch == 'y')
        {
            System.out.println("Enter  number: ");
            num = input.nextInt();
            sum = sum + num;
            System.out.println("Do you more addition. enter y/n");
            ch = input.next().charAt(0);
        }
        System.out.println(sum);        
    }
    
}
