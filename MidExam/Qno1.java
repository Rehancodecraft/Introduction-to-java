import java.util.Scanner;
public class practice {
    public static void main(String[] args) {
        double [] arr = new double[3];
        double largestNumber = arr[0];
        Scanner input = new Scanner(System.in);
        for(int i = 0; i<arr.length; i++){
            System.out.print("Enter"+i+" decimal: ");
            arr[i] = input.nextDouble();
            if(arr[i]>largestNumber){
               largestNumber = arr[i];
                }
            }
        System.out.println("Largest number is: "+ largestNumber);
        input.close();
    }
    
}
