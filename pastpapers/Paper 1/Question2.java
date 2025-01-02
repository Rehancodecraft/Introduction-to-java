import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] marks = new int[10][5];
        for(int std = 0; std < 10;std++){
            for(int sub = 0; sub < 5; sub++){
                System.out.print("Enter Marks of Student " + (std + 1) + " of Subject " + (sub + 1)+ " ");
                marks[std][sub] = input.nextInt();
            }
        }
    }
    
}
