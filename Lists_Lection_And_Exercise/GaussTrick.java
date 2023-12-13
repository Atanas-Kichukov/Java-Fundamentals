package Lists_Lection_And_Exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GaussTrick {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        List<Integer> numbers = new ArrayList<>();
        for (String number : input) {
            int current = Integer.parseInt(number);
            numbers.add(current);
        }
        for (int i = 0; i < numbers.size() - 1 ; i++) {
            int first = numbers.get(i);
            int last = numbers.get(numbers.size()- 1 );
            int sum = first +  last;
            numbers.set(i, sum);
            numbers.remove(numbers.size() - 1);

        }
        for (Integer number : numbers) {
            System.out.print(number + " ");
        }

    }
}
