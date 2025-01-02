import java.util.Scanner;

public class printcharacters {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the symbol: ");
        char symbol = input.next().charAt(0);
        System.out.print("Enter how many time you want to print: ");
        int size = input.nextInt();
        printsymbol(size, symbol);
    }
    public static void printsymbol(int a, char b){
        for(int i = 0; i < a;i++){
            for(int j = 0; j < a;j++){
                System.out.print(b);
            }
            System.out.println();
        }
    }
}
