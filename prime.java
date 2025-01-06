import java.util.Scanner;
public class prime {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.print("Enter number: ");
        int number = input.nextInt();
        int flag = 0;
        if(number == 0 || number == 1){
            System.out.println("This is NOT prime number");
        }
        else{
            for(int i = 2; i< number; i++){
                if(number%i== 0){
                    flag = 1;
                    break;
                }
                else{
                    flag = 0;
                }
            }
            if(flag == 0){
                System.out.println("This is prime number.");
            }
            else{
                System.out.println("This is not a prime number.");
            }
        }
        

    }
    
}
