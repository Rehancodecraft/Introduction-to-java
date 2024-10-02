import java.util.Scanner;

public class array4 {
    public static void main(String[] args) {
        int []marks = new int[5];
        for (int i = 0; i <5; i++){
            Scanner input = new Scanner(System.in);
            System.out.print("Enter the marks of subjects: ");
            marks[i] = input.nextInt();
        }
        System.out.println("English " + marks[0]);
        System.out.println("chemistry " + marks[1]);
        System.out.println("physics " + marks[2]);
        System.out.println("urdu " + marks[3]);
        System.out.println("maths " + marks[4]);
    }
    
}
