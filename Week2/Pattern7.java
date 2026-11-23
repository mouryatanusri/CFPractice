package Week2;
/* Write a Program which takes input n and prints the below pattern and upload the code to your github repo.



Sample 1:

Input:

n = 4

Expected output:

4321

321

21

1



Sample 2

Input:

n= 6

654321

54321

4321

321

21

1


 */


/* class Pattern7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("n = ");
        int n = scanner.nextInt();

        for(int i = 1; i <= n; i++) {
            for(int j = n; j >= i ; j--) {
                System.out.print(j);
                
            }
            System.out.println();
        }

        scanner.close();
    }
} */

    class Pattern7 {
    public static void main(String[] args) {

        int n = 4;

        for(int i = n; i <= n; i--) {
            for(int j = i; j >= 1  ; j--) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}