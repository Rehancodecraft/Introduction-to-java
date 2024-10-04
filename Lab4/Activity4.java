import java.util.Scanner;

public class Activity4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int score;
        System.out.print("Enter score: ");
        score = input.nextInt();
        if(score >= 90)
            System.out.println("The grade is A");
        if (score >=80)
            System.out.println("The grade is B");
            if(score >= 70)
            System.out.println("The grade is c");
        if (score >=600)
            System.out.println("The grade is d");
        else
            System.out.println("The grade is F");
    }
    
}
