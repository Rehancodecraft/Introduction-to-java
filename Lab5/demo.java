import java.util.Scanner;

public class demo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N;
        int sum = 0;
        N = input.nextInt();
        for(int i = 1; i<=N;i++){
            sum +=input.nextInt();
        }
        System.out.println("sum is "+ sum);
    }
    
}
