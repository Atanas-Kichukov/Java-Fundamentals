package Basic_Syntax_Conditional_Statements_Аnd_Loop;

import java.util.Scanner;

public class SumOfOddNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numbers = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        for (int i = 1; i < numbers * 2  ; i+=2 ) {
            System.out.println(i);
            sum+=i;
        }
        System.out.printf("Sum: %d", sum);
    }
}
