package Data_Types_And_Variables_Exercise;

import java.util.Scanner;

public class SpiceMustFlow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int startingYield = Integer.parseInt(scanner.nextLine());
        int allSpice = 0;
        int days = 0;
        int storedSpice = 0;
        while (startingYield>=100) {

            allSpice = startingYield;
            storedSpice += allSpice - 26;
            days++;
            startingYield-=10;
        }
        System.out.println(days);
        System.out.println(storedSpice - 26);
    }

}
