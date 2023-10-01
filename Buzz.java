// Oues : Buzz numbers are those numbers that are divisible by 7 or end with 7.( Any 1 condition is statisfied )
// Exmaple : 1007 , 49

import java.util.Scanner;
public class Buzz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number");
        int num = sc.nextInt();

        boolean result  = check_buzz(num);
        if(result == true)
        {
            System.out.println("Given Number is Buzz Number");
        }
        else{
            System.out.println("Not a Buzz Number");
        }
    }

    public static boolean check_buzz(int num)
    {
        int last_digit = num % 10;
        
        // 1st Condition For Buzz Number 
        if(last_digit == 7)
        {
            return true;
        }

        // 2nd Condition for Buzz Number
        if(num % 7 == 0)
        {
            return true;
        }
    
        return false;
    }
}
