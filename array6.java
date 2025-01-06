public class array6 {
    public static void main(String[] args) {
    //This is how we use arrays in java
    
        int [] arr = {20,10,30,50,15};
        int  min = arr[0];
        for(int i = 1; i < 5; i++){
            if (arr[i]<min){
                min = arr[i];
            }
        }
        System.out.println("Minimum Value = " + min);
    }
    
}
