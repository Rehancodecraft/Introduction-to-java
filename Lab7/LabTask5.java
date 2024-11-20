import java.util.Scanner;

public class LabTask5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter String: ");
        String string = input.nextLine();
        int letters = countLetters(string);
        System.out.println("Total characters are: " + letters);
    }
    public static int countLetters(String string){
        int counter = 0;
        for(int i = 0; i<string.length();i++){
            counter++;
        }
        return counter;
    }
    
}
