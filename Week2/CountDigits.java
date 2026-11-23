package Week2;

//FTo count the total number of digits of the given input number
import java.util.Scanner;

class CountDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int count = 0;

        while(n>0) {
            int ld = n%10;
            System.out.print(ld); //This is not necessary
            count++; //Count = count + 1;
            n = n/10;
        }

        System.out.print(count);  
        scanner.close();
    }
}
