package Basic_Syntax_Conditional_Statements_Аnd_Loop_Exercise;

import java.util.Scanner;

public class TriangleOfNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i<= input ; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(i +" ");

            }
            System.out.println();
        }
    }
}
