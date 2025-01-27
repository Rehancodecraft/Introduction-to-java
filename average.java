import java.util.Scanner;
//this is i am using vim
public class average {
    public static void main(String[] args) {
        int [] array = new int[5];
        Scanner input = new Scanner(System.in);
        int sum = 0;

        for(int i = 0; i < array.length;i++){
            array[i] = input.nextInt();
            sum = sum + array[i];
        }
        int average = sum / 5;
        System.out.println(average);
    }
    
}
