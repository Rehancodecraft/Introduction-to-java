import java.util.Scanner;

public class Arithmatic {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print(" Enter 'a': ");
        int a = input.nextInt();
        System.out.print(" Enter 'b': ");
        int b = input.nextInt();
        System.out.print(" Enter 'c': ");
        int c = input.nextInt();
        System.out.print(" Enter 'd': ");
        int d = input.nextInt();
        System.out.print(" Enter 'e': ");
        int e = input.nextInt();
        int ans = (a + b| (c-5))|((d+7)|(e-37)%3);
        System.out.println(ans);
    }
}
