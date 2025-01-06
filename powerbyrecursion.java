public class powerbyrecursion {
    public static void main(String[]args){
        System.out.println("Answer is : " + power(5,2));
        
    }
    public static int power(int a, int b){
        if(b == 0){
            return 1;
        }
        else{
            return a * power(a, b-1);
        }
    }
    
}
