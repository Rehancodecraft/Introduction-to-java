public class arraymultiply {
    public static void main(String[] args) {
        int [][] arr = {{2,4},{6,8}};
        int [][] arr2 = {{2,1},{3,5}};
        int [][] arr3 = new int[2][2];
        int sum = 0;
        for(int i = 0; i < 2;i++){
            for(int j = 0; j < 2;j++){
                arr3[i][j] =arr[i][j]*arr2[j][i];
            }
        }
    }
}
