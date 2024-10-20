import java.util.Scanner;

public class LabTask6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int maxindex = 0;
        int maxvalue = 0;
        int index = 1;
        while(true){
            int number = input.nextInt();
            if(number == 0){
                break;
            }
            else if(number > maxvalue){
                maxvalue = number;
                maxindex = index;
            }
            index++;
        }
        System.out.println("Index of large value is : "+maxindex);
        input.close();
    }
    
}
