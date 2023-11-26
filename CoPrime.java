//Ques : Co prime numbers are those numbers that have only one common factor, namely 1
// Hint : Check the common factor except 1
public class CoPrime {
    public static void main(String[] args) {
        // you can give number as a Input also using SCANNER class
        int num1 = 15 , num2 = 13;

        if(check_CoPrime(num1 , num2))
        {
            System.out.println("Numbers are Co-Prime");
        }
        else
        {
            System.out.println("Numbers are Not Co-Prime");
        }
    }

    public static boolean check_CoPrime(int num1 , int num2)
    {
        if(num1 == 0 || num2 == 0)
        {
            return false;
        }

        // Both numbers are eqaul then it is not co-prime
        if(num1 == num2)
        {
            return false;
        }

        for(int i = 2;i<num1;i++)
        {
            if(num1 % i ==0)
            {
                check_CoPrime(num1, num2);
            }
        }
        

        return true;
    }

    // public static boolean check_common(int a, int b)
    // {
    //     return false;
    // }
}
