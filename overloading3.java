import java.util.Scanner;

public class overloading3 {
    public static void main(String[] args) {
        int[] numbers = new int[5];
        Scanner input = new Scanner(System.in);
        for(int i =0; i<numbers.length;i++){
            System.out.print("Enter Num " + i +": ");
            numbers[i] = input.nextInt();
        }
        int maximumNumber = maximum(numbers);
        System.out.println("The maximum number is: " + maximumNumber);
        int minimumNumber = minimum(numbers);
        System.out.println("The minimum number is : " + minimumNumber);
    }
    // This function is to find maximum number
    public static int maximum(int[] array){
        int max = array[0];
        for(int i = 0; i <array.length;i++){
            if(array[i]> max){
                max = array[i];
            }
        }
        return max;
    }
    //This function is to find minum number
    public static int minimum(int[] array){
        int min = array[0];
        for(int i = 0; i <array.length;i++){
            if(array[i]< min){
                min = array[i];
            }
        }
        return min;
    }
    
}
