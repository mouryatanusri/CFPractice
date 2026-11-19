package Week1;

/* Prob 3:

Write a program to get firstName and lastName and n as input and print fullName that is firstName+lastName for n times.

Input

Nandy

Raja

5

Expected output:

NandyRaja

NandyRaja

NandyRaja

NandyRaja

NandyRaja

Explanation - Nandy is the firstName, Raja is the lastName and n is 5, so the expected output has NandyRaja printed 5 times.*/

import java.util.Scanner;

class LoopProb3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the First name: ");
        String firstName = scanner.next();

        System.out.println("Enter the Last name: ");
        String lastName = scanner.next();

        System.out.println("Enter the number: ");
        int n = scanner.nextInt();

        String fullName = firstName + lastName;

        for(int i = 0; i < n; i++) {
            System.out.println(fullName);
        }

        scanner.close();
        
    }
}
















