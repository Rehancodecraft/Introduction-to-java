import java.util.Scanner;

public class Activity2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int [] array = new int [5];
        System.out.println("Enter array elements... ");
        for(int i = 0;i <array.length;i++){
            array[i] = input.nextInt();
        }
        System.out.println("Sum of the given array is ... " + sum(array));
    }
    public static int sum(int[] array){
        int s = 0;
        for(int x: array){
            s+=x;
        }
        return s;
    }
    
}
