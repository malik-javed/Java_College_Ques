// Ques : Convert Digit to Word 
// Example : 123 to One Two Three
// Hint : Make a Array for 0 to 9 as its corresponding Word

public class Digit_to_word {
    public static void main(String[] args) {
        // you can give number as a Input also using SCANNER class
        int num = 123;

        String final_word = convert(num);
        System.out.println(final_word);
    }

    public static String convert(int num)
    {
        String digit_word[] = {
            "Zero" ,"One" ,"Two" ,"Three" ,"Four" ,"Five" ,"Six" ,"Seven" ,"Eight" ,"Nine"
        };

        String result=" ";

        // Case for Zero
        if(num == 0)
        {
            result = "Zero";
        }

        while(num>0)
        {
            int r = num % 10;
            // Adding result to last because if we add it in starting then the word is formed in reverse order -> like "Three Two One "
            result  = digit_word[r] +" " + result;
            num  = num /10;
        }

        

        return result;
    }
}
