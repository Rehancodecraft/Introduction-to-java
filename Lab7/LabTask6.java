import java.util.Scanner;

public class LabTask6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter word: ");
        String word = input.nextLine();
        System.out.println("Capitalized: " +capitalize(word));
        
 
        
    }
    public static String capitalize(String word){
        char[] characters = word.toCharArray();
        characters[0] = Character.toUpperCase(characters[0]);
        word = String.valueOf(characters);
        return word;
    }
    
}
