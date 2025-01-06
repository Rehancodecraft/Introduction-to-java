import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        int [][] marks = new int[5][3];
        Scanner input = new Scanner(System.in);
        int sum = 0;
        for(int std = 0; std < 5;std++){
            for(int sub = 0; sub < 3;sub++){
                System.out.print("Enter the marks of Student " + (std+1) + " of subject " + (sub+1) +": " );
                marks[std][sub] = input.nextInt();
                sum = sum + marks[std][sub];
            }

            System.out.println("Marks of Student " + (std+1)+ ": "+ sum);
            sum = 0;
        }
    }
    
}
