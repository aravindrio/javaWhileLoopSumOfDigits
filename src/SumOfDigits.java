public class SumOfDigits {

    public static void main(String[] args) {
        sumDigits(12538747);
        sumDigits(125);
    }

    public static int sumDigits(int number){
        if(number < 10){
            return -1;
        }

        //Use n % 10 to extract the least significant Digit
        //Use n = n /10 to discard the least significant digit
        int sum = 0;
        while(number > 0){
            int digit = number % 10;
            sum += digit;

            //Increment Operator comes within the loop
            //Trying to digit least significant digit
            number = number / 10;
        }
        System.out.println("sum: " + sum);
        return  sum;
    }
}
