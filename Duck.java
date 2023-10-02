// Ques : A Duck number is a positive number which has zeroes present in it. But 0 Can't present as first Digit
// Example : 3210

public class Duck {
    public static void main(String[] args) {
        // you can give number as a Input also using SCANNER class 
        int num = 7890;

        if(duck_number(num))
        {
            System.out.println("It is Duck Number");
        }
        else
        {
            System.out.println("Not a Duck Number");
        }
    }

    public static boolean duck_number(int num)
    {
        // base case -> 0 is not a duck number
        if(num == 0)
        {
            return false;
        }

        while(num>0)
        {
            int last_digit = num % 10;
            // Comparing digit one by one , if it is 0 return true means it is a duck number
            if(last_digit == 0)
            {
                return true;
            }
            num = num / 10;
        }
        
        return false;
    }
}
