import java.util.Scanner;

public class array2d {
    public static void main(String[] args) {
        int [][] arr = new int [5][5];
        Scanner input = new Scanner(System.in);
        for(int i = 0; i < 5;i++){
            System.out.println("Enter marks of student"+ i+" ");
                for(int j = 0; j < 5;j++){
                    System.out.print("Enter marks of subject "+j+" ");
                    arr[i][j] = input.nextInt();
                }
        for(int a = 0; a < 5;a++){
                for(int b = 0; b < 5;b++){
                    if(arr[a][b]%2 == 0){
                        System.out.println(arr[a][b]);
                    }
                        }

        }
    }
}  
}
