import java.util.*;
public class LabTask10 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.print("Enter the number of books: ");
        int books = input.nextInt();
        switch (books){
            case 0:
            System.out.println("You earned 0 points");
            break;
            case 1:
            System.out.println("You earned 5 points");
            break;
            case 2:
            System.out.println("You earned 15 points");
            break;
            case 3:
            System.out.println("You earned 30 points");
            break;
            case 4:
            System.out.println("You earned 60 points");
            break;
        }
    }
    
}
