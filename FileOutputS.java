import java.util.*;
import java.io.FileOutputStream;
import java.io.IOError;
import java.io.IOException;




public class FileOutputS{
    
    public static void main(String[] args) {
        
        try{

            FileOutputStream fos = new FileOutputStream("Output.txt");

            String str = "Malik Javed Written from FileOutputStream";

            fos.write(str.getBytes());

            fos.close();

        }
        catch(IOException e)
        {
            System.out.println(e);
        }

    }
}


