import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class writenreadFile {
    public static void main(String[] args) {
        try {
            FileWriter write=new FileWriter("newfile.txt");
            write.write("Hello.This is Roshni Jha.Nice to meet you:)");
            write.close();
            File read=new File("newfile.txt");
            Scanner sc= new Scanner(read);
            System.out.println(sc.nextLine());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
