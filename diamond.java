public class diamond {
    public static void main(String[] args) {
        // Upper half of the diamond
        for( int i = 1; i <= 5; i++) {
            // Print spaces
            for( int k = 5; k > i; k--) {
                System.out.print(" ");
            }
            // Print stars
            for(int j = 1; j <= i*2-1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Lower half of the diamond
        for(int a = 4; a >= 1; a--) {
            // Print spaces
            for(int b = 5; b > a; b--) {
                System.out.print(" ");
            }
            // Print stars
            for(int c = 1; c <= a*2-1; c++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

