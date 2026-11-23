package Week2;

//Going to every/Each digit of the given input number
import java.util.Scanner;

class EachDigit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

       while(n>0) {
           int ld = n%10;
           System.out.println(ld);
           n = n/10;
       }

        scanner.close();
    }
}
