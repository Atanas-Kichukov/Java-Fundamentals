package Data_Types_And_Variables;

import java.math.BigDecimal;
import java.util.Scanner;

public class ExactSumOfRealNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = Integer.parseInt(scanner.nextLine());
        BigDecimal sum = new BigDecimal(0);
        for (int i = 0; i <count ; i++) {
            BigDecimal next = new BigDecimal(scanner.nextLine());
            sum = sum.add(next);

        }
        System.out.println(sum);
    }
}
