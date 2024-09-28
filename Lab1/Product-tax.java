import java.util.Scanner;

public class ptax{
    public static void main (String[]args){
        int p1, p2, p3, total; 
        float finalprice;
        float tax = 0.15f;
        
        Scanner price = new Scanner(System.in);
        System.out.print("Produc-1 price: ");
        p1 = price.nextInt();
       
        System.out.print("Produc-2 price: ");
        p2 = price.nextInt();
       
        System.out.print("Produc-3 price: ");
        p3 = price.nextInt();
        
        total = p1 + p2 + p3;
        System.out.println("Total: "+ total);
        
        float total1 = total * tax;
        
        finalprice = total1 + total;
        System.out.println("Final Price: " + finalprice);

    }
}