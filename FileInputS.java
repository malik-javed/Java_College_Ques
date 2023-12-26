import java.util.*;
import java.io.FileInputStream;
import java.io.IOError;
import java.io.IOException;



public class FileInputS{
    
    public static void main(String[] args) {
        
        try{

            FileInputStream fins = new FileInputStream("Output.txt");

            byte b[] = new byte[fins.available()]; // Avialable methods read until it reaches at the end

            fins.read(b);

            String str = new String(b); // Converting into the String For Printing

            System.out.println(str);

        }
        catch(IOException e)
        {
            System.out.println(e);
        }

    }
}
