package FundamentalsExams;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AdAstra {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        List<String> products =new ArrayList<>();
        int days = 0;
        String regex = "([#\\|])(?<product>[A-Za-z\\s]+)\\1(?<days>[0-9]{2})\\/" +
                "(?<months>[0-9]{2})\\/(?<years>[0-9]{2})\\1(?<calories>[0-9]+)\\1";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);
        int calories = 0;
        int count =0;
        while (matcher.find()) {
            calories+=Integer.parseInt(matcher.group("calories"));
            count++;
            String item = matcher.group("product");
            String date = matcher.group("days") +'/' + matcher.group("months") +'/' + matcher.group("years");
            String nutrition = matcher.group("calories");
            String finalList = "Item: " + item + ", Best before: " + date + ", Nutrition: " + nutrition;
            products.add(finalList);
        }
        days = calories/2000;

        System.out.println(String.format("You have food to last you for: %d days!",days));
        for (String product : products) {
            System.out.println(product);
        }

    }
}
