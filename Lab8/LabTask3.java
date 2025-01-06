import java.util.Arrays;
import java.util.Scanner;

public class LabTask3 {
    public static void main(String[] args) {
        int [] array = new int[10];
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the values of Array: ");
        for(int i = 0; i< array.length;i++){
            array[i] = input.nextInt();
        }
        int [] copied = new int[10];
        int [] modifiedArray = (copyArray(array, copied));
        System.out.println("This is the new Array with reverse order: "+Arrays.toString(modifiedArray));

    }
    public static int[] copyArray(int[] array, int[] copied){
        for(int i = 0; i<array.length;i++){
                copied[i] = array[array.length - 1 - i];
        }
        return copied;
        
    }
    
}
