public class pattern3 {
    public static void main(String[] args) {
      for (int a = 1; a<=5;a++)
      {
        for (int b = 5; b>a; b--)
        {
            System.out.print(" ");
        }
        for (int c = 1; c <=2*a-1; c++ )
        {
            System.out.print("*");
        }
        System.out.println();
      }
      for (int i = 4; i>=1; i--)
      {
        for(int j = 5; j > i; j--)
        {
            System.out.print(" ");
        }
        for(int k = 1; k<= 2*i-1; k++)
        {
            System.out.print("*");
        }
        System.out.println();
      }
    }
}
