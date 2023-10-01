// Oues : A number is called an automorphic number if and only if the square of the given number ends with the same number itself. 
// Example : 5 is Automorphic because 5 * 5 = 25 that it ends with 5 .

import java.util.Scanner;
public class Automorphic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number");
        int num = sc.nextInt();

        int sqaure = (int)(Math.pow(num, 2));

        boolean result  = check_automorphic(num , sqaure);

        if(result == true)
        {
            System.out.println("The Number is Automorphic");
        }
        else{
            System.out.println("Not Automorphic");
        }


    }

    // Checking the Number is Automorphic or not 
    public static boolean check_automorphic(int num , int sqaure)
    {
        int temp = num;
        
        
        // Counting the Digits
        // We are taking out the digits of original number because to compare the sqaure with limited digits
        // example : 25*25 = 625  .... original num = 25 so hmko sirf 625 me se last ka 25 compare krna pde
        int digits_of_original_num  =0;
        while(temp>0)
        {
            temp = temp/10;
            digits_of_original_num++;

        }

        int last_of_sqaure = sqaure % (int)(Math.pow(10, digits_of_original_num));
        // 10 ki divide krte h hmko last ki diigt nikalne ke liye 
        // yaha pe 100 se diya h kyuki last ka 25 match krna hai

        if(last_of_sqaure == num)
        {
            return true;
        }


        return false;
    }
}
