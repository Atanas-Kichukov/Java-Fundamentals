package FundamentalsExams;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WorldTour {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        StringBuilder sb = new StringBuilder(input);
        String commandInfo = scanner.nextLine();
        while (!commandInfo.equals("Travel")) {
            String[] tokens = commandInfo.split(":");
            String command = tokens[0];
            switch (command) {
                case "Add Stop":
                    int index = Integer.parseInt(tokens[1]);
                    String destination = tokens[2];
                    if (isValidIndex(index, sb.length())) {
                        sb.insert(index, destination);
                    }

                    break;
                case "Remove Stop":
                    int start = Integer.parseInt(tokens[1]);
                    int end = Integer.parseInt(tokens[2]);
                    if ((isValidIndex(start, sb.length()) && isValidIndex(end,sb.length()))) {
                        sb.delete(start, end + 1);
                    }
                    break;
                case "Switch":
                    String oldString = tokens[1];
                    String newString = tokens[2];
                    sb = new StringBuilder(sb.toString().replace(oldString,newString));
                    break;

            }
            System.out.println(sb);
            commandInfo = scanner.nextLine();
        }
        System.out.println(String.format("Ready for world tour! Planned stops: %s",sb));
    }

    private static boolean isValidIndex(int index, int length) {
        return index >= 0 && index < length;
    }
}
