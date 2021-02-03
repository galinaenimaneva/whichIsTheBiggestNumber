import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner((System.in));
        System.out.print("Enter first number: ");
        int a = scanner.nextInt();
        System.out.print("Enter second number: ");
        int b = scanner.nextInt();
        System.out.print("Enter third number: ");
        int c = scanner.nextInt();

        if (a > b && b > c) {
            System.out.println(a + " is the biggest number!");}
        else if (b > a && b > c) {
            System.out.println(b + " is the biggest number!");}
        else { System.out.println(c + " is the biggest number!");}
    }

}