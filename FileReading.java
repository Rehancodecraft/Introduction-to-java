import java.util.Scanner;
import java.io.*;

public class FileReading {
    public static void main(String[] args) {
        try{
            File file = new File("MyFirstFile.txt");
            Scanner Reader = new Scanner(file);
            while(Reader.hasNextLine()){
                String data = Reader.nextLine();
                System.out.println(data);
            }
            Reader.close();
        }
        catch(FileNotFoundException e){
            System.out.println("An error has occured.");
            e.printStackTrace();
        }
    }
    
}
