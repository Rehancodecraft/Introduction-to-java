import java.util.Scanner;

public class LabTask2 {
    public static void main(String[] args) {
        int N;
        int K;
        int applePerStudent;
        int appleInBasket;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Number of Students: ");
        N = input.nextInt();
        System.out.print("Enter the Number of Apples: ");
        K = input.nextInt();
        appleInBasket = K % N ;
        applePerStudent = K / N;
        if (applePerStudent % 2 == 0){
            System.out.println("Number of Apples Per Student: " + applePerStudent);
            System.out.println("Apples remain in basket: " + appleInBasket);
        }
        else if(applePerStudent % 2 != 0){
            int applePerStudent1 = applePerStudent-1;
            int appleInBasket1 = appleInBasket + N;
            System.out.println("Number of Apples Per Student: " + applePerStudent1);
            System.out.println("Apples remain in basket: " + appleInBasket1);
        }
        input.close();

    }
    
}
