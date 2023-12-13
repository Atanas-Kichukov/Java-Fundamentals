package Lists_Lection_And_Exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = arrayToList(scanner);
        String input = scanner.nextLine();
        while (!"End".equals(input)) {
            String[] token = input.split("\\s+");
            String command = token[0];


            switch (command) {
                case "Add":
                    int number = Integer.parseInt(token[1]);
                    numbers.add(number);
                    break;
                case "Insert":
                    int numberToInsert = Integer.parseInt(token[1]);
                    int index = Integer.parseInt(token[2]);
                    if (isValid(numbers, index)) {
                        numbers.add(index, numberToInsert);
                    } else {
                        System.out.println("Invalid index");

                    }
                    break;
                case "Remove":
                    index = Integer.parseInt(token[1]);
                    if (isValid(numbers, index)) {
                        numbers.remove(index);
                    }
                    else {
                        System.out.println("Invalid index");

                    }
                    break;
                case "Shift":
                    int count = Integer.parseInt(token[2]);
                    if ("left".equals(token[1])) {
                        for (int i = 0; i < count; i++) {
                            int temp = numbers.remove(0);//едновременно махаме първия и го запзваме в променлива
                                                                //и всички елементи се преместват автоматично с едно наляво
                            numbers.add(temp);
                        }
                    } else if ("right".equals(token[1])) {
                        for (int i = 0; i < count; i++) {
                            int temp = numbers.remove(numbers.size() - 1);
                            numbers.add(0, temp);
                        }
                    }
                    break;
            }


            input = scanner.nextLine();
        }
        for (Integer number : numbers) {
            System.out.print(number + " ");
        }
    }

    private static boolean isValid(List<Integer> numbers, int index) {
        boolean result = index >= 0 && index < numbers.size();
        return result;
    }

    private static List<Integer> arrayToList(Scanner scanner) {
        String[] input = scanner.nextLine().split(" ");
        List<Integer> listForOperations = new ArrayList<>();
        for (String s : input) {
            int current = Integer.parseInt(s);
            listForOperations.add(current);
        }
        return listForOperations;
    }
}

