public class arraytwodimension {
    public static void main(String[]args){
        int [][] a = {{4,9,20},{5,2,9},{11,30,50}};
        int max = a[0][0];
        for(int i = 0;i<3;i++){
            for(int j = 0; j <3;j++){
                if(a[i][j]>max){
                    max = a[i][j];
                }

            }
        }
        System.out.println("Maximum value "+ max);
    }
    
}
