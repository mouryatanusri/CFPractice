package Week1;

/*Write a program which takes two values x and y. Prints x for y number of times.

Input:

2 

3

Expected Output

2

2

2

Explanation - 2 is x and 3 is y in the input. So 2 is printed 3 times on the output. */

//Aproach 1
import java.util.Scanner;

class LoopProb1 {
    public static void main(String[] main) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the two values: ");
        int x = scanner.nextInt();
        int y = scanner.nextInt();

        for(int i = 1; i<=y; i++) {
            System.out.println(x);
        }

        scanner.close();

    }
}

//Aproach 2
/* import java.util.Scanner;

class LoopProb1 {
    public static void main(String[] main) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the two values: ");
        int x = scanner.nextInt();
        int y = scanner.nextInt();

        for(int i = 0; i<y; i++) {
            System.out.println(x);
        }

        scanner.close();
        
    }
} */

//Alternative Approaches 

/* import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the values: ");
        int x = scanner.nextInt();
        int y = scanner.nextInt();


        int i = 0;
        //while (i< y) {
         //   System.out.println(x);
         //   i++;
        //}

        do {
            System.out.println(x);
            i++;
        } while(i<y);
        
        //for(int i = 0; i < y; i++) {
           // System.out.println(x);
       // }
        scanner.close();    
    }
} */


