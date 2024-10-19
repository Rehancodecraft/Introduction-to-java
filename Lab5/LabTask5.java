import java.util.Scanner;

public class LabTask5{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter sequence: ");
        int temporary = 0;
        while (true){
            int n = input.nextInt();
            if(n== 0)
            break;
            else if(n>temporary){
                temporary =n;
            }
        }
        System.out.println("Maximum value is : "+temporary);
    }
}