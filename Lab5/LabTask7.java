import java.util.Scanner;

public class LabTask7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the sequence: ");
        int counter = 0;
        while(true){
            int number = input.nextInt();
            //If user give input 0 function will brake
            if(number==0){
                break;
            }
            else if(number % 2 == 0){
                counter++;
            }
        }
        System.out.println("There are "+counter+" Even numbers in sequence.");
        input.close();
    }
    
}
