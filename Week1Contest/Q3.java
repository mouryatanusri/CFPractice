package Week1Contest;

import java.util.*;

public class Q3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        //Sum of Natural Numbers = n*(n+1)/2

        int sum = N*(N+1)/2;
        System.out.print(sum);

        sc.close();

    }
}