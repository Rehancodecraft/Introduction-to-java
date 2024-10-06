import java.util.Scanner;

public class LabTask4 {
    public static void main(String[] args) {
        int N;
        Scanner input = new Scanner(System.in);
        System.out.print("How many minutes passed: ");
        N = input.nextInt();
        int hour = N / 60;
        int minutes = N % 60;
        System.out.println("The time is : "+hour+":"+minutes);
        input.close(); 
    }
    
}
