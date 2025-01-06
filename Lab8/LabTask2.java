import java.util.Arrays;
import java.util.Scanner;

public class LabTask2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int [ ] numbers = new int[10];
        for(int i = 0; i < numbers.length;i++){
            numbers[i] = input.nextInt();
        }
        int [] modifiedNumbers = (modify(numbers));
        System.out.println(Arrays.toString(modifiedNumbers));
    }
    public static int[] modify(int [] numbers){
        int [] modifiedNumbers = new int[10];
        for(int i = 0; i< numbers.length;i++){
             numbers[i] = numbers[i] *3;
             modifiedNumbers[i] = numbers[i];
        }
        return modifiedNumbers;
    }
    
}
