import java.util.*;
public class LabTask8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter month: ");
        int mnth = input.nextInt();
        System.out.print("Enter day: ");
        int day = input.nextInt();
        System.out.print("Enter year: ");
        int year = input.nextInt();
        int magic = day * mnth;
        if (magic == year){
            System.out.println("The Date is magic!");
        }
        else{
            System.out.println("The Date is Not magic!");

        }
    }
    
}
