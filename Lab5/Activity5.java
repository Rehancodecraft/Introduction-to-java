import java.util.Scanner;

public class Activity5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number, sum = 0, count;
        for (count = 0; count < 5; count++){
            number = input.nextInt();
            sum += number;//this is i am using vim editor
        }
        System.out.println("sum is "+ sum);
    }
    
}
