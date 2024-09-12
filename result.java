// importing the library to use scanner function
import java.util.Scanner;

public class result {
    public static void main(String[]args){
        // declaring the variables
        int phy,chem, urd, Eng, ist, total, average;
        System.out.println("Enter your marks!");
        // crating a new scanner for input
        Scanner marks = new Scanner(System.in);
        System.out.print("Physics: ");
        phy = marks.nextInt();
        System.out.print("Chemistry: ");
        chem = marks.nextInt();
        System.out.print("Urdu: ");
        urd = marks.nextInt();
        System.out.print("English: ");
        Eng = marks.nextInt();
        System.out.print("Islamiat: ");
        ist = marks.nextInt();
        // calculating the total marks
        total = phy + chem + urd + Eng + ist;
        // calculating the average of marks
        average = total/ 5;
        System.out.println("Average: " + average);
        System.out.println("Total marks: " + total);
    }
    
}
