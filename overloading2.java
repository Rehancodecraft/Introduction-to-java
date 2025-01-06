public class overloading2 {
    public static void main(String[] args) {
        int[] numbers = {4,23,5,6,2,7};
        int [] y = {5,10,20};
        int a = sum(numbers);
        int b = sum(a);
        
        System.out.println(a);
        System.out.println(b);
    }
    public static int sum(int [] array){
        int sum = 0;
        for(int i = 0; i<=array.length;i++){
            sum = sum + array[i];
        }
        return sum;
    }
    
}
