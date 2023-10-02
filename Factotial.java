// Ques : Factorial of a Number -> the product of an integer and all the integers below it
// Example : Factorial of 5 is -> 5 * 4 * 3 * 2 * 1 or its opposite from 1 to 5

public class Factotial {
    public static void main(String[] args) {
        // you can give number as a Input also using SCANNER class
        int num = 4;

        System.out.println(factorial(num));
    }    

    public static int factorial(int num)
    {
        int fact = 1;

        if(num == 0)
        {
            // factorial of 0 is 1
            return fact;
        }

        for(int i=1;i<=num;i++)
        {
            fact = fact * i;
        }

        return fact;
    }
}
