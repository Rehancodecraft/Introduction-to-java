import java.util.Scanner;

public class squareroot{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
	// this is i am using vim editor
        int i = 1;
        while(i * i < number){
            i++;
        }
        System.out.println(i );
    }
}
