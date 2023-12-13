package Basic_Syntax_Conditional_Statements_Аnd_Loop;

import java.util.Scanner;

public class EvenNumbre {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Math.abs(Integer.parseInt(scanner.nextLine()));

        while (num % 2 != 0) {

            System.out.printf("Please write an even number.%n");
            num = Math.abs(Integer.parseInt(scanner.nextLine()));
        }
        System.out.printf("The number is: %d",num);
    }
}