import java.io.File;
import java.io.IOException;

public class FileCreation {
    public static void main(String[] args) {
        String fileName = "testfile.txt";

        File file =new File(fileName);
    try{
        if(file.createNewFile()){
            System.out.println("File created:" +file.getName());
        } else {
            System.out.println("File already exist.");
        }
    }catch (IOException e){
        System.out.println("An ERROR occured.");
    }
}

    
}
