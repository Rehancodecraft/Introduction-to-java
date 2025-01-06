import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileCreat {
    public static void main(String[] args) {
        try{
            File file = new File("MySecondFile.txt");
            if(file.createNewFile()){
                System.out.println("File Successfully created");
            }
            else{
                System.out.println("File already exist");
            }
        }
        catch(IOException e){
            System.out.println("An error occured");
            e.printStackTrace();
        }
    }
    
}
