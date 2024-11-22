import java.util.Scanner;

public class Activity1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter three pints: ");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();
        double x3 = input.nextDouble();
        double y3 = input.nextDouble();
        double a = Math.sgrt((x2-x3) * (x2 - x3) * (y2-y3) *(y2 - y3));
        double b = Math.sqrt((x1-x3)*(x1 - x3)*(y1 - y3)* (y1 - y3));
        double c = Math.sqrt((x1 - x2) * ( x1 - x2) +(y1 - y2)*(y1 - y2));
        
    }
    
}
