package Basic_Syntax_Conditional_Statements_Аnd_Loop;

import java.util.Scanner;

public class RefractorSumOfOddNumbres {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        int sum = 0;

        for (int i = 0; i < n; i++) {

            System.out.println(2 * i + 1);
            sum += 2 * i + 1 ;
        }
        System.out.printf("Sum: %d%n", sum);
    }
}
