public class array7 {
    public static void main(String[] args) {
        int [] arr = {20,10,30,50,15};
        int  max = arr[0];
        int loc = 0;
        for(int i = 1; i < 5; i++){
            if (arr[i]>max){
                max = arr[i];
                loc = i;
            }
        }
        System.out.println("Maximum Value = " + max);
        System.out.println("Location: " + loc);
    }
    
}