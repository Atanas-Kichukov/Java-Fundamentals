package Lists_Lection_And_Exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Train {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> train = arrayToList(scanner);
        int maxCapacity = Integer.parseInt(scanner.nextLine());

        String[] input = scanner.nextLine().split(" ");

        while (!input[0].equals("end")) {
            if (input[0].equals("Add")) {
                int waggon = Integer.parseInt(input[1]);
                train.add(waggon);

            } else {
                int number = Integer.parseInt(input[0]);
                for (int i = 0; i < train.size(); i++) {
                    if (train.get(i) + number <= maxCapacity) {
                        int newNum = train.get(i) + number;
                        train.remove(i);
                        train.add(i, newNum);
                        break;
                    }
                }
            }

            input = scanner.nextLine().split(" ");

        }
        for (Integer waggon : train) {
            System.out.print(waggon + " ");
        }
    }


    private static List<Integer> arrayToList(Scanner scanner) {

        String[] input = scanner.nextLine().split(" ");
        List<Integer> train = new ArrayList<>();

        for (String s : input) {
            int current = Integer.parseInt(s);
            train.add(current);
        }
        return train;
    }
}
