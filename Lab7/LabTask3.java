import java.util.Arrays;
import java.util.Scanner;

public class LabTask3 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int  [] numbers = new int[3];
        for(int i = 0; i <numbers.length;i++){
            System.out.println("Enter Num " + i);
            numbers[i] = input.nextInt();
        }
        displaySortedNumbers(numbers);

    }
    public static void displaySortedNumbers(int [] array){
        int smallestNumber = array[0];
        for(int i = 0;i < array.length;i++){
            if (array[i]<smallestNumber){
                smallestNumber = array[i];
            }
        }
            array[0] = smallestNumber;
        for(int i = 1; i< array.length;i++){
            if (array[i]<smallestNumber){
                smallestNumber = array[i];
            }
        }
        System.out.println(Arrays.toString(array));
    }
    
}
