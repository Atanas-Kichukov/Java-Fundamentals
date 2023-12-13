package FundamentalsExams;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DestinationMapper {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String message = scanner.nextLine();
        int points = 0;
        List<String> destinations = new ArrayList<>();
        String regex = "([=\\/])([A-Z][A-Za-z]{2,})\\1";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(message);
        while (matcher.find()) {
            String result = matcher.group(2);
            destinations.add(result);
            points += result.length();
        }
        System.out.println(String.format("Destinations: ") + String.join(", ",destinations));
        System.out.println(String.format("Travel Points: ") + points);
    }
}
