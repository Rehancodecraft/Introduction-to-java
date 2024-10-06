import java.util.Scanner;

public class LabTask6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the pay rate: ");
        double payrate = input.nextDouble();
        System.out.print("How many Hours you worked in week 1: ");
        int week1 = input.nextInt();
        System.out.print("How many Hours you worked in week 2: ");
        int week2 = input.nextInt();
        System.out.print("How many Hours you worked in week 3: ");
        int week3 = input.nextInt();
        System.out.print("How many Hours you worked in week 4: ");
        int week4 = input.nextInt();
        System.out.print("How many Hours you worked in week 5: ");
        int week5 = input.nextInt();
        int totalhours = week1 + week2 + week3 + week4 + week5;
        double totalamount = payrate * totalhours;
        double Tax = totalamount * 0.14;
        double amountaftertax = totalamount - Tax;
        double amount = amountaftertax;
        double forClothes = amount * 0.1;
        amount = amount - forClothes;
        double forsupplies = amount * 0.01;
        amount = amount - forsupplies;
        double buysavingbonds = amount * 0.25;
        amount = amount - buysavingbonds;
        double parentsbuy = buysavingbonds * 0.50;
        System.out.println("Income before Tax: $" + String.format("%.2f",totalamount));
        System.out.println("Income after Tax: $"+ String.format("%.2f",amountaftertax));
        System.out.println("Spent on Clothes and other assessories: $" + String.format("%.2f",forClothes));
        System.out.println("Spent on School Supplies: $" + String.format("%.2f",forsupplies));
        System.out.println("Spent on Saving Bonds: $" + String.format("%.2f",buysavingbonds));
        System.out.println("Parents Spent money on Saving Bonds: $"+ String.format("%.2f",parentsbuy));
        input.close();
    }
    
}
