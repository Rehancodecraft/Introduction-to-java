public class arraycolumnsum {
    public static void main(String[] args) {
    //     int [][] a= {{23,54,23},{45,12,78},{14,67,1}};
    //     for(int i = 0; i<3;i++)
    //     {
    //         int sum = 0;
    //         for(int j = 0; j< 3; j++){
    //              sum = sum + a[j][i];
    //             }
    //         System.out.println("sum of column "+(i+1)+"="+sum);
    //     }
    // }
    int number = 5;
   int endresult = (factorial(number));
   System.out.println(endresult);

}
public static int factorial(int n){
    if(n  == 0 || n == 1){
        return 1;
    }
    else{
        return n * factorial(n-1);
    }
     
}
}
