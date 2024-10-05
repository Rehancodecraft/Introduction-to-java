import java.util.Scanner;
public class array5 {
    public static void main(String[] args) {
        String []name = new String[5];
        int []age = new int [5];
        Scanner input = new Scanner(System.in);
        for ( int i = 0; i < 5; i++){ 
            System.out.print("Enter name of " +(i+1)+ " Student: ");
            name[i] = input.nextLine();
        } 
        for(int j = 0; j< 5; j++){
            System.out.print("Enter age of " + (j+1)+ " Student: ");
            age[j]= input.nextInt();
        }
    }
}
