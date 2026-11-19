import java.util.Scanner;
    class Largest {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter first number: ");
            int a = scanner.nextInt();

            System.out.print("Enter second number: ");
            int b = scanner.nextInt();

            System.out.print("Enter third number: ");
            int c = scanner.nextInt();

            if(a >= b && a >= c) {
                System.out.println(a + " is the largest of all!");
            } else if (b>=a && b>=c) {
                System.out.println(b + " is the largest of all!");
            } else {
                System.out.println(c + " is the largest of all!");
            }
            scanner.close();
            
        }
            
    }

    //>= : for the cases where two inputs may have equal values. 

    /*import java.util.Scanner;
    class Largest {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Enter the numbers: ");
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int c = scanner.nextInt();

            if(a > b && a>c) {
                System.out.println(a + " is the largest of all!");
            } else if (b>a && b>c) {
                System.out.println(b + " is the largest of all!");
            } else {
                System.out.println(c + " is the largest of all!");
            }
            scanner.close();
            
        }
            
    } */