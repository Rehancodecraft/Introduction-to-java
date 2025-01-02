public class MatriceMultiplication {
    public static void main(String[] args) {

        int[][] array = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] array1 = {{9, 8, 7}, {6, 5, 4}, {3, 2, 1}};
        int[][] array2 = new int[3][3];
        for (int i = 0; i < 3; i++) { 
            for (int j = 0; j < 3; j++) { 
                array2[i][j] = 0; 
                for (int k = 0; k < 3; k++) { 
                    array2[i][j] = array2[i][j] + array[i][k] * array1[k][j];
                }
            }
        }

       
        System.out.println("Resulting Matrix:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(array2[i][j] + " ");
            }
            System.out.println();
        }
    }
}

			
