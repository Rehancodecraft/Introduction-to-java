public class diamond {
    public static void main(String[] args) {
        for( int i = 1; i<=5; i++)
        {
            for( int k = 1;k>=i;k--){
                System.out.print(" ");
            }
            for(int j = 1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int a = 4; a>=1; a--)
        {
            for(int b = 5; b>a; b--);
                {
                    System.out.print(" ");
                }
            for(int c = 1; c<=a;c++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
}
