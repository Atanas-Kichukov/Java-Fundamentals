package Data_Types_And_Variables_Exercise;

import java.util.Scanner;

public class AsciiTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());
        for (int i = a; i <= b ; i++) {
            char letter = (char) i;
            System.out.print(letter + " ");
        }
    }
}
