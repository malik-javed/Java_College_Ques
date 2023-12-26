
import java.util.*;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOError;
import java.io.IOException;

public class FileCopying{
    
    public static void main(String[] args) {
        
        try{

            FileOutputStream fos = new FileOutputStream("Challenge.txt");

            String s = "Copying Challenge";

            fos.write(s.getBytes());

            FileInputStream fins = new FileInputStream("Challenge.txt");

            int x;

            while ((x=fins.read())!=-1) {
                System.out.print((char)x);
            }

            fos.close();
            fins.close();
        }
        catch(IOException e)
        {
            System.out.println(e);
        }

    }
}

