import java.util.Scanner;
public class LabTask5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a: ");
        int a = input.nextInt();
        System.out.print("Enter b: ");
        int b = input.nextInt();
        System.out.print("Enter c: ");
        int c = input.nextInt();
        int counter = 0;
        if ( a == b && a == c){
            System.out.println("same values: 3");
        }
        else if (a == b || a ==c || b==c){
            System.out.println("same values: 2");
        }
        else{
            System.out.println("same values: 0");
    }
}
}
