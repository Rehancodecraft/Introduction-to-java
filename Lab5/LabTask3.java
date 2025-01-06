import java.util.*;
public class LabTask3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int digit = input.nextInt();
        int counter = 0;
        for(int i = 0; i< digit;i++){
            int number = input.nextInt();
            if(number == 0){
                counter++;
            }
        }
        System.out.println("Number of zeros: "+counter);
    }
    
}
