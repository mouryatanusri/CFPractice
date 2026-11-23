package Week2;

//Find the Last Digit
import java.util.Scanner;

class LastDigit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        System.out.print("The last digit of " + n + " is " + n%10);

        scanner.close();
    }
}