package Week1;
/* Prob 1 : Write a program that takes an integer, then a string, then a char from the user and prints them in the screen.


Input:  2 Name y

Expected Output:

2

Name

y */

import java.util.Scanner;

class Problem1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the Integer: ");
        int num = scanner.nextInt();
        System.out.print("Enter the word: ");
        String word = scanner.next();
        System.out.print("Enter the Character: ");
        char letter = scanner.next().charAt(0);

        System.out.println(num);
        System.out.println(word);
        System.out.println(letter);
        
        scanner.close();
    }
}
