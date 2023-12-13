package Data_Types_And_Variables;

import java.util.Scanner;

public class MetersToKilometers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int m = Integer.parseInt(scanner.nextLine());
        double km = m / 1000.0;


        System.out.printf("%.2f",km);


    }

}
