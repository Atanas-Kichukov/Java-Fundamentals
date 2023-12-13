package FundamentalsExams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class PasswordReset {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String encryptedMessage = scanner.nextLine();
        StringBuilder password = new StringBuilder(encryptedMessage);
        String instructions = scanner.nextLine();
        while (!instructions.equals("Decode")) {
            String[] tokens = instructions.split("\\|");
            String command = tokens[0];
            switch (command) {
                case "Move":
                    int numberOfLetters = Integer.parseInt(tokens[1]);
                    for (int i = 0; i < numberOfLetters; i++) {
                        char letter = password.charAt(0);
                        password.deleteCharAt(0);
                        password.append(letter);

                        //System.out.println(encryptedMessage);
                    }

                    break;
                case "Insert":
                    int index = Integer.parseInt(tokens[1]);
                    String value = tokens[2];
                    password.insert(index, value);

                    //System.out.println(encryptedMessage);
                    break;
                case "ChangeAll":
                    String symbol = tokens[1];
                    char replacement = tokens[2].charAt(0);
                    for (int i = 0; i < password.length(); i++) {
                        String element = String.valueOf(password.charAt(i));
                        if (symbol.equals(element)) {
                            password.setCharAt(i, replacement);
                        }
                    }

                    // System.out.println(encryptedMessage);
                    break;
            }
            instructions = scanner.nextLine();
        }
        System.out.println(String.format("The decrypted message is: %s", password));
    }


}

