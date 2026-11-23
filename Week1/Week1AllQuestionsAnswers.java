package Week1;

/* import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();
        String s = sc.nextLine();
        char c = sc.next().charAt(0);
        double d = sc.nextDouble();

        System.out.println(n);
        System.out.println(s);
        System.out.println(c);
        System.out.println(d);
        
    } 
    sc.close();
} */

/* import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        
        if(a>=b && a>=c) {
            System.out.print(a + " is the Largest");
        } else if (b>=a && b>=c) {
            System.out.print(b + " is the Largest");
        } else {
            System.out.print(c + " is the Largest");
        }
        sc.close();
    } 
} */

/* import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        
        for(int i = 0; i<= 100; i++) {
            if(i%5==0) {
            System.out.print(i + " ");
            }
        }
        
        sc.close();
    } 
} */

//import java.util.Scanner;

/* class Main {
    public static void main(String[] args) {
       // Scanner sc = new Scanner(System.in);
        int n = 10;
       // int n = sc.nextInt();
        
       // for(int i = 10; i>= 1; i--) {
       //     System.out.print(i + " ");
       //     }
       // }
        
        //sc.close();
        //while(n>=1) {
        //    System.out.print(n + " ");
         //   n--;
        do {
            System.out.print(n + " ");
            n--;
        } while(n>=1);
    } 
} */

/* import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();
        
        for(int i = 1; i<=y; i++) {
            System.out.println(x);
        }
        
        sc.close();
    } 
} */

/* import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        
        for(int i = 1; i<=100; i++) {
            if(i%x==0) {
            System.out.print(i + " ");
            }
        }
        
        sc.close();
    } 
} */

/* import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();
        String firstName = sc.nextLine();
        String lastName = sc.nextLine();

        String fullName = firstName + lastName;

        for(int i = 1; i<=n; i++) {
            System.out.println(fullName);
        } 
        sc.close();
    } 
} */

/* import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        if ( n > 0) {
            if(n%2==0) {
                System.out.print(n + " is a Positive Even Integer");
            } else {
                System.out.print(n + " is a Positive Odd Integer");
            }
        } else if (n < 0 ) {
            if(n%2==0) {
                System.out.print(n + " is a Negative Even Integer");
            } else {
                System.out.print(n + " is a Negative odd Integer");
            }
        }
        sc.close();
    } 
} */

/* import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a1 = sc.nextInt();
        int a2 = sc.nextInt();
        int a3 = sc.nextInt();

        int sum = a1 + a2 + a3;

        if(sum == 180) {
            System.out.print("Triangle CAN be formed.");
        } else {
            System.out.print("Triangle CANNOT be formed.");
        }
        sc.close();
    } 
} */

/* import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int marks = sc.nextInt();

        if(marks>=90) {
            System.out.print("Grade A");
        } else if(marks>=80) {
            System.out.print("Grade B");
        } else if(marks>=70) {
            System.out.print("Grade C");
        } else if(marks>=60) {
            System.out.print("Grade D");
        } else {
            System.out.print("Fail");
        }
        sc.close();
    } 
} */

/* import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();

        switch(size) {
            case 20 : 
                System.out.print("XS Size");
                break;
            case 22 : 
                System.out.print("S Size");
                break;
            case 24 : 
                System.out.print("M Size");
                break;
            case 26 : 
                System.out.print("L Size");
                break;
            case 28 : 
                System.out.print("XL Size");
                break;
            default :
                System.out.print("Invalid size");
        }
        
        sc.close();
    } 
} */

/* import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int age = sc.nextInt();

        if(age>=18) {
            System.out.print("Eligible to Vote!");
        } else {
            System.out.print("NOT Eligible to Vote!");
        }
        
        sc.close();
    } 
} */

/* import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for(int i = 2; i<=n; i++) {
            System.out.print(i + " ");
        }        
        sc.close();
    } 
} */

/* import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int sum = n*(n+1)/2;

        System.out.print(sum);
        
        sc.close();
    } 
} */












