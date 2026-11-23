package Week2;

class CountDigitsProblem2 {
    public static void main(String[] args) {
        
        int n = 123;
        int ld =0;
        int fd = 0;
        int sum;
         while(n>0) {
           
           ld = n%10; 
           System.out.println("The last digit is: " + ld );
           break;
           }
             
        while(n>0) {
           fd = n%10; 
           n = n/10;
           if(n==0) {
           System.out.println("The last digit is: " + fd);
           sum = ld + fd;
           System.out.print("Sum of First and Last digit : " + sum);
           }
        } 
    }
}
