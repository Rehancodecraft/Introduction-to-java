import java.util.Scanner;

public class LabTask7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter oder of Matrix: ");
        int n = input.nextInt();
        printMatrix(n);
    }
    public static void printMatrix(int n){
        int [] [] numbers = new int[n][n];
        for(int row = 0; row < numbers.length;row++){
            for(int col = 0; col < numbers[row].length;col++){
                numbers[row][col] = (int) (Math.random()*2);
            }
        }
        for(int row = 0; row < numbers.length;row++){
            for(int col = 0; col < numbers[row].length;col++){
                System.out.print(numbers[row][col] +" ");
            }
            System.out.println();
        } 
    }
    
}