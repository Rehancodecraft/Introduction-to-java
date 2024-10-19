import java.util.Scanner;

public class arrayfound {
    public static void main(String[] args) {
        int [][] a= {{23,54,23},{45,12,78},{14,67,1}};
        int found = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = input.nextInt();
        for(int i = 0;i<3;i++){
            for(int j = 0; j<3;j++){
                if(a[i][j]==num){
                found = 1;
                }
            }
        }
        if(found == 1){
            System.out.println("Found");
        }
        else{
            System.out.println("Valud not found");
        }
    }
    
}
