package Week3;



//Write a program that gets n as input and print the reverse of the number
//Method 1 - Self Solved
/* import java.util.Scanner;

class ReverseNumber{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        while(n>0) {
            int ld = n%10;
            System.out.print(ld);
            n = n/10;
        }
    }
} */

//Method 2

import java.util.Scanner;

class ReverseNumber{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int n = sc.nextInt();

        while(n>0) {
            int ld = n%10;
            sum = sum*10 + ld;
            n = n/10;
        }
        System.out.print(sum);
        sc.close();
    }
}

