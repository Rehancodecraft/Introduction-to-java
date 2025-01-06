import java.util.Scanner;

public class LabTask1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter A: ");
        int a = input.nextInt();
        System.out.print("Enter B: ");
        int b = input.nextInt();
        for (int i = a; i <=b; i++){
            System.out.println(i);
        }
        System.out.println();
        System.out.print("Enter A: ");
        int a1 = input.nextInt();
        System.out.print("Enter B: ");
        int b1 = input.nextInt();
        if(a1<b1){
            System.out.println("In Ascending order");
            for(int i = a1; i<=b1; i++){
                System.out.println(i);
            }
        }
        else if(a1>b1){
            System.out.println("In Descending order");
            for(int j = a1;j>=b1;j--){
                System.out.println(j);
            }
        System.out.print("Number of Integers:  ");
        int integers = input.nextInt();
        int sum = 0;
        for(int i = 1;i<=integers;i++){
            System.out.print("Num "+i+":");
            sum+=input.nextInt(); 
        }
        System.out.println("Sum is "+ sum);
        }
        System.out.print("Enter Integer: ");
        int number = input.nextInt();
        int sum2 = 0;
        for(int i = 0; i<=number;i++){
            sum2 = sum2 + i*i*i;
        }
        System.out.println("Sum of Cubes : "+sum2);
    }
    
}
