package Week1;

/* Prob 2: Write a program to check whether a triangle can be formed with the given values for the angles.

If sum of angles is equal to 180, then triangle can be formed, else it can't be formed.

Input: 45 45 45

Expected Output: 

Triangle cannot be formed */

import java.util.Scanner;

class Problem2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the three angles: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        int total = a+b+c;

        if(total == 180) {
            System.out.println("Triangle can be formed.");
        } else {
            System.out.println("Triangle cannot be formed.");
        }
        
        scanner.close();
    }
    
}