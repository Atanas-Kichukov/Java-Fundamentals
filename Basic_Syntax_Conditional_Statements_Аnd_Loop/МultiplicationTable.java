package Basic_Syntax_Conditional_Statements_Аnd_Loop;

import java.util.Scanner;

public class МultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <=10 ; i++) {
            int sum = num * i;
            System.out.printf("%d X %d = %d%n",num, i,sum);

        }
    }
}
