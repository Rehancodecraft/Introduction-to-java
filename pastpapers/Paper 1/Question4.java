//write a function to take two arguments first as intger and second as power
public class Question4 {
    public static void main(String[] args) {
        int finalresult = Power(5, 2);
        System.out.println("Result is : " + finalresult);
        
    }
    public static int Power(int a, int b){
        int result = 1;
        for(int i = 0; i < b; i++){
            result = result * a;
        }
        return result;
    }
    
}
