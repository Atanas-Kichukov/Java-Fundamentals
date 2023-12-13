package Data_Types_And_Variables;

import java.util.Scanner;

public class PoundsToDollars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int pound = Integer.parseInt(scanner.nextLine());
        double dollar = pound * 1.31;
        System.out.printf("%.3f",dollar);


    }
}
