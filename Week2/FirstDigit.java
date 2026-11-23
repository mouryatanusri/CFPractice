package Week2;

//First digit of a number
import java.util.Scanner;

class FirstDigit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        while(n>0) {
            int ld = n%10;
            if(n==ld) {  //if(n==0)
                System.out.print(ld);
            } 
            n = n/10;
        }
        scanner.close();
    }
}
