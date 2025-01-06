import java.util.*;
public class LabTask8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int number = input.nextInt();
       
        if(number<1000 && number >0){
            int ans = 0;
            int rem = 0;
            while(number > 0){
                rem = number%10;
                number /=10;
                ans = ans + rem;
            }
            System.out.println("Answer: "+ ans);
        }
        else{
            System.out.println("Enter the number Between 0 - 999");
        }
    }
    
}
