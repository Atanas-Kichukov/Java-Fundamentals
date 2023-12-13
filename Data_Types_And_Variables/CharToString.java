package Data_Types_And_Variables;

import java.util.Scanner;

public class CharToString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char a = scanner.nextLine().charAt(0);
        char b = scanner.nextLine().charAt(0);
        char c = scanner.nextLine().charAt(0);
        System.out.println("" + c + " "+ b + " "+ a);
    }
}
