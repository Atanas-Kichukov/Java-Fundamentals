package Basic_Syntax_Conditional_Statements_Аnd_Loop;

import java.util.Scanner;

public class MultiplicationTable2_0 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());
        int beginning = Integer.parseInt(scanner.nextLine());
        if (beginning > 10) {
            int sum1 = beginning * num;
            System.out.printf("%d X %d = %d%n", num, beginning, sum1);}
            for (int i = beginning; i <= 10; i++) {

                int sum = num * i;
                System.out.printf("%d X %d = %d%n", num, i, sum);

            }
        }
    }

