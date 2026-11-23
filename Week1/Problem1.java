package Week1;
/*Prob 1 : Write a program that takes an integer, then a string, then a char from the user and prints them in the screen.


Input:  2 Name y

Expected Output:

2

Name

y

----------------------------------------------------------------------------------------------------------------------------------------------------------- */

import java.util.Scanner;

class Problem1 {


   public static void main(String[] var0) {
      Scanner var1 = new Scanner(System.in);
      System.out.print("Enter the Integer: ");
      int var2 = var1.nextInt();
      System.out.print("Enter the word: ");
      String var3 = var1.next();
      System.out.print("Enter the Character: ");
      char var4 = var1.next().charAt(0);
      System.out.println(var2);
      System.out.println(var3);
      System.out.println(var4);
      var1.close();
   }
}
