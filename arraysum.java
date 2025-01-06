public class arraysum {
    public static void main(String[] args) {
        int [][] a= {{23,54,23},{45,12,78},{14,67,1}};
        int sum = 0;
        for(int i = 0; i<3;i++)
        {
            for(int j = 0; j< 3; j++){
                 sum = sum + a[i][j];
            }
            System.out.println("sum of row "+(i+1)+"="+sum);
        }
    }
    
}
