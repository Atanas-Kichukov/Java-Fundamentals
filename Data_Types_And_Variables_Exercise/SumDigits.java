package Data_Types_And_Variables_Exercise;

import java.util.Scanner;

public class SumDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int currentNum = n;
        int sum = 0;
        while (currentNum > 0) {
            int lastNum = currentNum %10;
            sum+=lastNum;
            currentNum = currentNum / 10;
        }
        System.out.println(sum);
    }
}
