package Methods;

import java.util.Scanner;

public class CalculatedRectangleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());

        double area = rectangleArea(a, b);
        System.out.printf("%.0f",area);
    }

    private static double rectangleArea(int width, int length) {

        return  width * length;

    }
}
