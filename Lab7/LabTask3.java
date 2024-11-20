import java.util.Arrays;
import java.util.Scanner;

public class LabTask3 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int  [] numbers = new int[3];
        //Getting input from user and storing then in an array
        for(int i = 0; i <numbers.length;i++){
            System.out.print("Enter Num " + i+ ":");
            numbers[i] = input.nextInt();
        }
        displaySortedNumbers(numbers);

    }
    public static void displaySortedNumbers(int [] array){
        //To check the first value with last value
      if(array[0]> array[2]){
        int temp = array[2];
        array[2] = array[0];
        array[0] = temp;
      }
      //To check the 2nd value with third value
      if(array[1]> array[2]){
        int temp = array[2];
        array[2] = array[1];
        array[1] = temp;
      }
      //To check the first value with the 2nd value
      if(array[0]> array[1]){
        int temp = array[1];
        array[1] = array[0];
        array[0] = temp;
      }
        System.out.println(Arrays.toString(array));
    }
    
}
