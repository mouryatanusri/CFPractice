package Week2;

//To count the total number of Odd digits of the given input number
import java.util.Scanner;

class OddDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int count = 0;

        while(n>0) {
            int ld = n%10;
            if(ld%2 != 0) {
             count++; //Count = count + 1;   
            }
            n = n/10;
        }

        System.out.print("The number of odd digits are " + count);  
        scanner.close();
    }
}
