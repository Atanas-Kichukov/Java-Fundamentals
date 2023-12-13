package Data_Types_And_Variables_Exercise;

import java.util.Scanner;

public class SumOfChars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numbers = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        for (int i = 0; i <numbers ; i++) {
            char input = scanner.nextLine().charAt(0);


            sum += input;
        }

        System.out.printf("The sum equals: %d",sum);
    }
}
