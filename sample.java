import java.util.Scanner;

public class overloading3 {
    public static void main(String[] args) {
        int[] numbers = {45,6,3,6,7,3,4,6,75,47,34};
        Scanner input = new Scanner(System.in);
            System.out.print("Enter Num to find: ");
            numbertoSearch = input.nextInt();
            int searched = search(numbers, numbertoSearch);
            if (searched == 1){
                System.out.println("Found");
            }
            else{
                System.out.println(" NOT Found");
            }
        
    }
            // This function is to find maximum number
    public static int search(int[] array,numbertoSearch){
        int found = 0;
        for(int i = 0; i <array.length;i++){
            if(array[i]== numbertoSearch){
                found = 1;
            }
        }
        return found;
    }
}  