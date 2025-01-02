import java.util.Scanner;

public class Question4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = input.nextInt();
        System.out.println(sumofseries(n));
        
    }
    public static int sumofseries(int n){
        if(n == 1){
            return 1;
        }
        else{
            return n + sumofseries(n-1);
        }
    }
}
