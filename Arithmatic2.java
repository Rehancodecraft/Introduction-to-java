import java.util.Scanner;

public class Arithmatic2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print(" Enter 'a': ");
        int a = input.nextInt();
        System.out.print(" Enter 'b': ");
        int b = input.nextInt();
        System.out.print(" Enter 'c': ");
        int c = input.nextInt();
        System.out.print(" Enter 'd': ");
        int d = input.nextInt();
        int ans = a * ( b * b) -(c * b ) + d;
        System.out.println(ans);
    }
    
}
