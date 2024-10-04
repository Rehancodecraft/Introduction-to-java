public class LabTask1 {
    public static void main(String[] args) {
        int x = 10,y = 15 , z = 20;
        boolean ans = !(x > 10);
        System.out.println("Answer1: "+ans);
        boolean ans2 = (x<=5 || y<15);
        System.out.println("Answer2: "+ans2);
        boolean ans3 = (x != 5) && (y != z);
        System.out.println("Answer3: "+ans3);
        boolean ans4 = (x>= y) || (x + y >= z);
        System.out.println("Answer4: "+ans4);
        boolean ans5 = (x<= y -2) && (y>=z) || (z-2 != 20);
    }
    
}
