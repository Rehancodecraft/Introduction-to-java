import java.io.FileWriter;
import java.io.IOException;

public class FileWriting {
    public static void main(String[] args) {
        try{
            FileWriter Writer = new FileWriter("MyFirstFile.txt", true);
            Writer.write(
                "Files in Java are  good!! . I am writing a new another line "
            );
            Writer.close();
            System.out.println("Successfully Written");
            
        }
        catch(IOException e){
            System.out.println("Error ocurred");
            e.printStackTrace();
        }
    }
    
}
