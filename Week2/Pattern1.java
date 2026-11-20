package Week2;

import java.util.Scanner;

class Pattern1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the value of n: ");
        int n = scanner.nextInt();

        System.out.println();
        System.out.println("The patern is :");
        
        for (int i = 1; i<=n; i++) {
        for (int j = 1; j<=n; j++) {
            System.out.print("*" + " ");
            }
        System.out.println();
        }
        scanner.close();
    }
}