import java.util.Scanner;
public class LabTask4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a: ");
        int a = input.nextInt();
        System.out.print("Enter b: ");
        int b = input.nextInt();
        int min = Math.min(a, b);
        System.out.println("The smaller value is: " + min);
        System.out.print("Enter c: ");
        int c = input.nextInt();
        System.out.print("Enter d: ");
        int d = input.nextInt();
        int min2 = Math.min(c, d);
        System.out.println("The smaller value is: "+ min2);
        System.out.print("Enter the value of X: ");
        int x = input.nextInt();
        if ( x > 0)
            System.out.println("1");
        if (x < 0)
            System.out.println("-1");
        else 
            System.out.println("0");
        System.out.print("Enter p: ");
        int p = input.nextInt();
        System.out.print("Enter q: ");
        int q = input.nextInt();
        System.out.print("Enter r: ");
        int r = input.nextInt();
        int min3 = Math.min(r, Math.min(p,q));
        System.out.println("The smallest value is: " + min3);
    }
    
}
