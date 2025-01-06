import java.util.Scanner;

public class LabTask8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter string: ");
        String string = input.nextLine();
        char [] characters = string.toCharArray();
        int counter = 0;
        for(int i = 0; i <characters.length;i++){
            switch (characters[i]) {
                case 'a'-> counter++;
                case 'A'-> counter++;
                case 'e'-> counter++;
                case 'E'-> counter++;
                case 'i'-> counter++;
                case 'I'-> counter++;
                case 'o'-> counter++;
                case 'O'-> counter++;
                case 'u'-> counter++;
                case 'U'-> counter++;
            }
        }
        System.out.println("Number of vowels in the string are : " + counter);
    }
    
}
