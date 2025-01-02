public class fiboncci {
    public static void main(String[] args) {
        int n = 10;
        for(int i = 0; i < n;i++){
            System.out.print(calculatefiboncci(i) + " ");
        }
        
    }
    public static int calculatefiboncci(int n){
        if (n == 0 || n == 1){
            return 1;
        }
        else{
            return calculatefiboncci(n-1) + calculatefiboncci(n-2);
        }
    }
    
}
