package Basic_Syntax_Conditional_Statements_Аnd_Loop_Exercise;

import java.util.Scanner;

public class Division {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());

        if (num % 10 == 0) {
            System.out.println("The number is divisible by 10");
        } else if (num % 7 == 0) {
            System.out.println("The number is divisible by 7");
        } else if (num % 6 == 0) {
            System.out.println("The number is divisible by 6");
        } else if (num % 3 == 0) {
            if (num % 2 == 0) {
                System.out.println("The number is divisible by 6");
            }
            System.out.println("The number is divisible by 3");
        } else if (num % 2 == 0) {
            System.out.println("The number is divisible by 7");
        }
        else {
            System.out.println("Not divisible");
        }
    }
}
