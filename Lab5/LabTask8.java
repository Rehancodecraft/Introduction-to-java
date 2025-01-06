import java.util.Scanner;

public class LabTask8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int maxvalue = 0;
        int counter = 1;
        while (true){
            int number = input.nextInt();
            if(number==0){
                break;
            }
            else if(number>maxvalue){
                maxvalue = number;
                counter++;
            }
        }
        System.out.println("Answer: " + counter);
    }    
}
