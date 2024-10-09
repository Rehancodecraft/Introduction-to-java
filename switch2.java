import java.util.Scanner;

public class switch2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of day: ");
        int day = input.nextInt();
        switch(day){
            case 1-> System.out.println("Monday");
            case 2-> System.out.println("Tuesday");
            case 3-> System.out.println("wednesday");
            case 4-> System.out.println("Thursday");
            case 5-> System.out.println("Friday");
            case 6-> System.out.println("Saturday");
            case 7-> System.out.println("Sunday");
            default->System.out.println("Enter a valid day");
        }
    }
    
}
