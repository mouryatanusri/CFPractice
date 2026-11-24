package Week3;

//Self Solved Palindrome

class PalindromeNumbers {
    public static void  main (String[] args) {
        int num = 65456;
        int n = 65456;
        int sum = 0;

        while(n>0) {
            int ld = n%10;
            sum = 10*sum + ld;
            n = n/10;
        }
        if(sum == num){
            System.out.print("Given number is a Palindrome Number");
        } else {
            System.out.print("Given number is NOT a Palindrome Number");
        }
    }
} 
