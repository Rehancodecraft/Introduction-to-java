import java.util.Scanner;

public class LabTask3 {
    public static void main(String[] args) {
        int a,b,c,total;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Students in Class A: ");
        a = input.nextInt();
        if (a % 2 == 0){
            a = a/2;
        }
        else if ( a % 2 != 0){
            a = (a+1)/2;
        }
        System.out.print("Enter Students in Class B: ");
        b = input.nextInt();
        if (b % 2 == 0){
            b = b/2;
        }
        else if ( b % 2 != 0){
            b = (b+1)/2;
        }
        System.out.print("Enter Students in Class C: ");
        c = input.nextInt();
        if (c % 2 == 0){
            c = c/2;
        }
        else if ( c % 2 != 0){
            c = (c+1)/2;
        }
        total = a + b + c;
        System.out.println("Total Desks required: " + total);
    }
}
