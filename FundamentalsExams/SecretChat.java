package FundamentalsExams;

import java.util.Scanner;

public class SecretChat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String concealedMessage = scanner.nextLine();
        StringBuilder message = new StringBuilder(concealedMessage);
        String input = scanner.nextLine();
        while (!input.equals("Reveal")) {
            String[] tokens = input.split(":\\|:");
            String command = tokens[0];
            switch (command) {
                case "InsertSpace":
                    int index = Integer.parseInt(tokens[1]);
                    String firstHalf = concealedMessage.substring(0, index);
                    String secondHalf = concealedMessage.substring(index);
                    concealedMessage = firstHalf + " " + secondHalf;
                    System.out.println(concealedMessage);
                    break;
                case "Reverse":
                    String substring = tokens[1];
                    String newString = "";
                    if(concealedMessage.contains(substring)){
                        for (int i = 0 ; i < substring.length(); i++) {
                            char symbol = substring.charAt(i);
                            newString = symbol + newString;
                        }
                        concealedMessage = concealedMessage.replace(substring,newString);
                        System.out.println(concealedMessage);
                    }
                    else{
                        System.out.println("error");
                    }
                    break;
                case "ChangeAll":
                    String letter = tokens[1];
                    String replacement = tokens[2];
                    concealedMessage = concealedMessage.replace(letter,replacement);
                    System.out.println(concealedMessage);
                    break;
            }
            input = scanner.nextLine();
        }
        System.out.println(String.format("You have a new text message: %s",concealedMessage));
    }
}
