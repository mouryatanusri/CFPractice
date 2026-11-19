package Week1;
import java.util.Scanner;

class PNOE {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
            System.out.println("Enter the number: ");
            int num = scanner.nextInt();

            if(num > 0) {
                if(num % 2 == 0) {
                    System.out.print(num + " is an Even Postive Number");
                } else {
                    System.out.print(num + " is a Odd Postive Number");
                }
            } else if(num < 0) {
                if(num % 2 == 0) {
                    System.out.print(num + " is an Even Negative Number");
                } else {
                    System.out.print(num + " is a Odd Negative Number");
                }
            } else if (num == 0) {
                System.out.print(num + " is a Neutral Number");
            }
        
            scanner.close();
        
        }
    }   
   