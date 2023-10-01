public class Armstrong {
    public static void main(String[] args) {
        int num = 67;

        int power = check_digit(num);
        // here power =  total number of digits

        boolean arm = check_armstrong(num , power);
        // System.out.println(power);

        if(arm == true)
        {
            System.out.println("Given Numnber :" +num + " is Armstrong");
        }
        else{
            System.out.println("Given Numnber :" +num + " is not an Armstrong");
        }

    }

    // Checking How many Digits are there in the Number 
    public static int check_digit(int num)
    {
        int count =0;
        while(num>0)
        {
            num = num /10;
            count++ ;

        }

        return count;
    }

    public static boolean check_armstrong (int num , int power)
    {
        int sum  = 0;
        int original_num = num ; 
        while(num>0)
        {
            int remainder  = num % 10;
            sum = (int)(sum + Math.pow(remainder, power));
            num = num /10;

        }

        if(sum ==  original_num)
        {
            return true;
        }

        return false;
    }
}
