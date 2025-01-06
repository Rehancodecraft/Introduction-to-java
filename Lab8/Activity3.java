import java.util.Scanner;

public class Activity3 {
    public static void main(String[] args) {
        char[] character = new char[10];
        int element = character[0];
        int counter = 0;
        Scanner input = new Scanner(System.in);

        for(int i = 0;i<10;i++){
            System.out.println("A["+i+"] = ");
            character[i] = input.next().charAt(0);
        }
        for(int i = 0; i< 10;i++){
            for(int j = 0; j<10;j++){
                if(character[i] == character[j]){
                    counter+=1;
                }
            }
            System.out.println(character[i] + " occurs " + counter + " times");
            counter = 0;
        }
    }
    
}
