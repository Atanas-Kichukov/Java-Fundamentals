package Arrays_Exercise;

import java.util.Scanner;

public class Train {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        int [] wagons = new int[count];
        for (int i = 0; i < wagons.length ; i++) {
            wagons[i] = Integer.parseInt(scanner.nextLine());

        }
        for (int wagon : wagons) {
            sum += wagon;
            System.out.print(wagon + " ");
        }
        System.out.println();
        System.out.println(sum);
    }
}
