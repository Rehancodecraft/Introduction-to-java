import java.util.Scanner;

public class array10 {
    public static void main(String[] args) {
        int [] arr = {20,10,30,50,15};
        int num;
        int found = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");
        num = input.nextInt();
        for(int i = 0; i < arr.length;i++){
            if ( arr[i] == num){
                found = 1;
            }            
        }
        if ( found == 1){
            System.out.println("Number is FOUND");
        }
        else{
            System.out.println("Number NOT found");
        }      
    }
    
}