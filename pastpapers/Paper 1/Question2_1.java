import java.util.Scanner;

public class Question2_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int [] array = new int[10];
        for(int i = 0; i < array.length;i++){
            System.out.print("Enter "+ (i + 1) + " number: ");
            array[i] = input.nextInt();
        }
        int sum = 0;
        for(int j = 0; j < array.length; j++){
            if(array[j]%2 == 0){
                sum = sum + array[j];
            }
        }
        System.out.println("Sum of Even is: " + sum);

    }
    
}
