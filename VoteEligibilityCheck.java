import java.util.Scanner;

class VoteEligibilityCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
            System.out.print("Enter the age:");
            int age = scanner.nextInt();

        //if (age>18 || age==18) {
        if (age>=18) {
            System.out.println("Eligible to Vote");
        } else {
            System.out.println("NOT Eligible to Vote");
            }
        System.out.println("Age is:" + age);

        scanner.close();
     }
}