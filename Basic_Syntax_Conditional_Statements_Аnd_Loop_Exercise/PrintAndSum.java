package Basic_Syntax_Conditional_Statements_Аnd_Loop_Exercise;

import java.util.Scanner;

public class PrintAndSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int beginning = Integer.parseInt(scanner.nextLine());
        int end = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        for (int i = beginning; i <=end ; i++) {
            sum +=i;
            System.out.printf("%d ",i);

        }
        System.out.printf("Sum: %d",sum);
    }
}
