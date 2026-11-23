package Week2;

import java.util.Scanner;

class CountDigitsProblem1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int count = 0;
        int n = sc.nextInt();

        while(n>0) {
            int ld = n%10;
            System.out.print(ld);
            count++;
            n=n/10;
        }
        System.out.print("The Number of digits are : " + count);
        sc.close();
    }
}
