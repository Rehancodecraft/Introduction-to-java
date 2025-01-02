public class Question2_2 {
    public static void main(String[] args) {
        int [] [] array = {
            {1,2,3,4},
            {5,6,7,8},
            {9,10,11,12},
            {13,14,15,16}
        };
        for(int row = 0; row < 4;row++){
            for(int col = 0; col<4;col++){
                if((row == 0 && col == 0)|| (row == 1 && col == 1) || (row == 2 && col == 2) || (row == 3 && col == 3)){
                    continue;

                }
                else{
                    System.out.print(array[row][col]);
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    
}
