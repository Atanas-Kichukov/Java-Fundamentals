package Data_Types_And_Variables_Exercise;

import java.util.Scanner;

public class IntegerOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());
        int c = Integer.parseInt(scanner.nextLine());
        int d = Integer.parseInt(scanner.nextLine());
        int sum = a + b;
        int delimo = sum / c;
        int finalResult = delimo * d;
        System.out.println(finalResult);
    }
}
