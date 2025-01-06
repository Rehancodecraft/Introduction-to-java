import java.util.Scanner;

public class LabTask4 {
    public static void main(String[] args) {
        int answer = counting();
        System.out.println("Number of Integers are: "+answer);
    }
    static int counting(){
        Scanner input = new Scanner(System.in);
        int SENTINEL = 0;            
        int counter = 0;
        while (true){
            int n = input.nextInt();
            if(n == SENTINEL){
                break;
            }
            counter ++;
        }
        input.close();
        return counter;
           
    }
}
