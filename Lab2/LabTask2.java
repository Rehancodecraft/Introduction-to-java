import java.util.*;
public class LabTask2 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int width, length;
        System.out.print("Enter the Width: ");
        width = console.nextInt();
        System.out.print("Enter the Length: ");
        length = console.nextInt();
        int area = length * width;
        int perimeter = 2 * (length + width);
        System.out.println("Area = " + area);
        System.out.println("Perimeter = " + perimeter);

    }
    
}
