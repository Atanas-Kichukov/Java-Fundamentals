package Data_Types_And_Variables_Exercise;

import java.util.Scanner;

public class TriplesOfLatinLetters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i <num; i++) {
            char firstChar = (char) ('a' + i);
            for (int j = 0; j < num; j++) {
                char secondChar = (char)('a' + j);
                for (int k = 0; k < num; k++) {
                    char letter = (char) ('a' + k);
                    System.out.printf("%c%c%c%n",firstChar,secondChar,letter);
                }

            }

        }
    }
}
