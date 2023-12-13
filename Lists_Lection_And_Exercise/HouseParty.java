package Lists_Lection_And_Exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HouseParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int commandCount = Integer.parseInt(scanner.nextLine());
        List<String> guests = new ArrayList<>();
        for (int i = 0; i < commandCount; i++) {

            String[] input = scanner.nextLine().split(" ");
            String name = input[0];
            if (input[2].equals("not")) {
                if (!guests.contains(name)) {
                    System.out.printf("%s is not in the list!", name);
                    System.out.println();

                } else {
                    guests.remove(name);

                }
            } else {
                if (!guests.contains(name)) {
                    guests.add(name);
                } else {
                    System.out.printf("%s is already in the list!", name);
                    System.out.println();
                }
            }
        }

        for (String names : guests) {
            System.out.println(names);
        }

    }
}
