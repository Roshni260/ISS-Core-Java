import java.io.File;
import java.io.IOException;

public class createFile {
    public static void main(String[] args) {
        try {
            File f=new File("newfile.txt");
            if(f.createNewFile()){
                System.out.println("File created: "+f.getName());
            }else{
                System.out.println("File already exists");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
