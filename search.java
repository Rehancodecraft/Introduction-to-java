import java.util.*;
public class search {
    public static void main(String[] args) {
    int []arr = {24,56,4,45,8,23,01,45};
    int found = 0;
    Scanner input = new Scanner(System.in);
    int num = input.nextInt();
        for(int i = 0; i<8; i++){
            if(num == arr[i])
            {
                found = 1;
                break;
            }
        }
        System.out.println(found);
    }
    
}
