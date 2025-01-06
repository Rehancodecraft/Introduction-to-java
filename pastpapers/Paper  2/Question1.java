import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int [] array = new int[10];
        for(int i = 0; i < array.length;i++){
                System.out.print("Enter the height of "+ (i+1) + " student ");
                array[i] = input.nextInt();
        }
        int max = 0;
        int index = 0;
        for(int j = 0; j<array.length;j++){
            if(max < array[j]){
                max = array[j];
                index = j;
            }
        }
        System.out.println("The index of Student having the heighest height is: " + (index + 1));
    }
}
