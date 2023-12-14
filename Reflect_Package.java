import java.util.*;
import java.lang.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

class Hello{
    int a;
    int b;

    public void display()
    {
        System.out.println("Display Method");
    }
}

public class Reflect_Package {

    public static void main(String[] args) {

       Class c = Hello.class;

       Field f[] = c.getDeclaredFields();
        for (Field field : f) 
        {
            System.out.println(field);
        }

        // Similarily or bhi methods hote hai to analyze the Methods in class , Constructor ke liye and many more 

        Method m[] = c.getMethods();
       for (Method meths : m) {
        System.out.println(meths);
       }
    }
}

