import java.util.*;
public class LabTask3 {
 public static void main(String[] args) {
    Scanner console = new Scanner(System.in);
    final int SECRET = 11;
    final double RATE = 12.50;
    int num1,num2,newNum;
    String name; 
    double hoursWorked, wages;
    System.out.print("Enter Num1: ");
    num1 = console.nextInt();
    System.out.print("Enter Num2: ");
    num2 = console.nextInt();
    System.out.println("The value of Num1 = " + num1);
    System.out.println("The value of Num2 = " + num2);
    newNum = num1 * 2 + num2;
    System.out.println("The value of New Num = " + newNum);
    newNum =  newNum + SECRET;
    System.out.println("The updated Value of New Num = " + newNum);
    System.out.print("Enter your Last Name: ");
    name = console.next();
    System.out.print("Enter Hours you wroked (0-70): ");
    hoursWorked = console.nextDouble();
    wages = RATE * hoursWorked;
    System.out.println("Name: " + name);
    System.out.println("Pay Rate: " + RATE);
    System.out.println("Hours Worked: " + hoursWorked);
    System.out.println("Salary: " + wages);
 }   
}
