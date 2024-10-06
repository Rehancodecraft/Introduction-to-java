import java.util.*;
public class LabTask7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter length of 1st Rectangle's length: ");
        int firstlength = input.nextInt();
        System.out.print("Enter width of 1st rectangle: ");
        int firstwidth = input.nextInt();
        int area1 = firstlength * firstwidth;
        System.out.print("Enter length of 2nd Rectangle's length: ");
        int seclength = input.nextInt();
        System.out.print("Enter width of 2nd Rectangel's length: ");
        int secwidth = input.nextInt();
        int area2  = seclength * secwidth;
        if (area1 > area2){
            System.out.println("1st Rectange is greater.");
        }
        else if(area1< area2){
            System.out.println("2nd Rectangle is greater.");
        }
        else{
            System.out.println("Both are same.");
        }
        input.close();
    }
    
}
