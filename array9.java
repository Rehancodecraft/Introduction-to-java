public class array9 {
    public static void main(String[] args) {
        int [] arr = {20,10,30,50,15};
        int sum = 0;
        for(int i = 0; i < arr.length;i++){
            sum = sum + arr[i];
        }
        int avg = sum / arr.length;
        System.out.println("Average: " + avg);
    }
    
}
