import java.util.Scanner;

public class diamond2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        for(int row = 0; row < 2 * n;row ++){
            int noofcolumns = row > n ? 2 * n - row : row;
            int noofspaces = n - noofcolumns;
            for(int sp = 0; sp < noofspaces;sp++){
                System.out.print(" ");
            }
            for(int col = 0; col < noofcolumns;col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    
}
