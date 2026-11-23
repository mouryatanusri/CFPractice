package Week2;

//Odd or Even
import java.util.Scanner;

class EvenOdd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        if(n%2==0) {
            System.out.print(n + " is an Even Number");
        } else {
            System.out.print(n + " is a Odd Number");
        }

        scanner.close();
    }
}