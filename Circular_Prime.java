// Oues : Circular Prime Number [ all rotations of its digits must also be prime numbers ]
// Example : 1193 Its all combination 3119 , 9311 etc all are prime numbers

// True = Prime 
// False = Not Prime
public class Circular_Prime {
    public static void main(String[] args) {
        // you can give number as a Input also using SCANNER class
        int num = 1193;

        boolean result = check_circular_prime(num);

        if (result == true) {
            System.out.println("Given Number is Circular Prime");
        } else {
            System.out.println("Not a Circular Prime Number");
        }
    }

    public static boolean check_circular_prime(int num) {
        // 0 and 1 are non-prime
        if (num <= 1) {
            return false;
        }
        // If the original is not Prime then the circular is also not prime so terminate
        // the conditon
        if (!prime(num)) {
            return false;
        }

        // formular for calculating total digits in a number -> you can use mathmatical
        // formula also for calculating the digts
        int total_digits = (int) (Math.log10(num) + 1);

        int temp = num;
        
        // possible combination = no.of digits
        // loop  = total_digits-1 because ek baar upper check krliya
        for (int i = 1; i < total_digits - 1; i++) {

            int last_digit = temp % 10;
            // checking all possible answers
            temp = (last_digit * (int) (Math.pow(10, total_digits - 1))) + temp / 10;
            if (!prime(temp)) {
                return false;
            }
        }

        return true;
    }

    public static boolean prime(int num)
    // Prime are those numbers which are Divisibe by 1 or itself
    {
        if (num == 2) {
            return true;
        }

        int count = 0;
        // if count = 1 means num is divided so it is not prime
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                count++;
            }
        }

        if (count >= 1) {
            return false;
        }

        return true;
    }
}
