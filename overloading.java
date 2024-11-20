public class overloading{
    public static void main(String[] args) {
        square(5,7);
        square(9.9);
        square(5.043985,5);
        
    }
    public static void square(int a){
        int x = a*a;
        System.out.println("square "+ x);
    
    }
    public static void square(float a){
        float x = a*a;
        System.out.println("square "+ x);
    
    }
    public static void square(double a){
        double x = a*a;
        System.out.println("square "+ x);
    
    }
}