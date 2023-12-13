package Data_Types_And_Variables_Exercise;

        import java.util.Scanner;

public class WaterOverflow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int capacity = 255;
        int filledTank = 0;
        int fillTimes = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < fillTimes; i++) {
            int wateraValue = Integer.parseInt(scanner.nextLine());

            if (capacity < wateraValue) {
                System.out.printf("Insufficient capacity!%n");
            }
            else {
                filledTank += wateraValue;
                capacity -= wateraValue;
            }
        }
        System.out.println(filledTank);
    }
}
