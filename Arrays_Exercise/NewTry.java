package Arrays_Exercise;

import java.util.Scanner;

public class NewTry {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        for (int i = 1; i <=number ; i++) {
            topNumbre(number);
        }
    }

    private static void topNumbre(int number) {
        int sum = 0;
        int countOfOdds = 0;
        while (number > 0) {
            int digit = number % 10;
            sum += digit;

            if (digit % 2 != 0) {
                countOfOdds++;
            }
            number /= 10;
        }
      

    }
}
