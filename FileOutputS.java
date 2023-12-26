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
            
            // Writing in the form of Array 
            // byte b[] = str.getBytes();
            // for (byte x : b) {
            //     fos.write(x);
            // }


            fos.close();

        }
        catch(IOException e)
        {
            System.out.println(e);
        }

    }
}


