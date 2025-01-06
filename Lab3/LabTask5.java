import java.util.Scanner;

public class LabTask5 {
    public static void main(String[] args) {
        double milk;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Total Amount of Milk: ");
        milk = input.nextDouble();
        double cartons = milk / 3.78;
        cartons = Math.round(cartons);
        double cost = milk * 0.38; 
        double profit = cartons * 0.27;
        profit = Math.round(profit);
        milk = Math.round(milk);
        System.out.println("Total cartons Needed: " + cartons);
        System.out.println("Total cost of Producing milk: " + cost+"$");
        System.out.println("Total profit of milk today morning: " + profit+"$");
        input.close();
    }   
    
}
