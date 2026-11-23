package Week2;

// Given two numbers A and B find the kth digit from the right of A^B

import java.util.Scanner;

class KthDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();
        int K = sc.nextInt();
        
        int count = 1;
        long n = (long) Math.pow(A,B);

        while(n>0) {
            long ld = n%10;
            System.out.print(ld);
            if(count == K) {
            System.out.print(ld);
            }
            
            count++;
            n = n/10;
            
        }
        
        sc.close();
        
    }
}

//Geeks for geeks - Self-solved Answer 
/* class Solution {
    static long kthDigit(int a, int b, int k) {
        // code here
    long count = 0;
    
    long n = (long) Math.pow(a,b);
    
    while(n>0) {
        count ++;
        long ld = n%10;
        if(count == k) {
            return ld;
        }
        n = n/10;
    }
    return 0;
    }
} */
