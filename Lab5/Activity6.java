import java.util.Scanner;

public class Activity6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number, max;
        number = input.nextInt();
        max  = number;
        do {
            number = input.nextInt();
            if(number > max)
                max = number;
        }while (number !=0);
        System.out.println("Max is "+ max +" and Number is "+ number);
    }
}
