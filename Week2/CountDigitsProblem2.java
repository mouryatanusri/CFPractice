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

//Geeks for geeks - Self-Solved Solution
/* class Solution {
    public int cornerDigitSum(int n) {
        // code here
      int ld = 0;
      int fd = 0;

      while(n>0) {
          
          ld = n%10;
          break;
          
      }
      
      while (n>0) {
          
          fd = n%10;
          n = n/10;
          if (n==0) {
             int sum = ld + fd;
             return sum;
             
          }
          
      }
      
      return 0;
     
    }
} */
