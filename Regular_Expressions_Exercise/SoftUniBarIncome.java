package Regular_Expressions_Exercise;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SoftUniBarIncome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String regex = "%(?<name>[A-Z][a-z]+)%[^|$%.]*<(?<product>\\w+)>[^|$%.]*\\|(?<count>\\d+)\\|[^|$%.]*?(?<price>\\d+\\.?\\d*)\\$";
        Pattern pattern = Pattern.compile(regex);
        String input = scanner.nextLine();
        double totalPrice = 0.0;
        while (!"end of shift".equals(input)) {
            Matcher matcher = pattern.matcher(input);
            if (matcher.find()) {
                String name = matcher.group("name");
                String product = matcher.group("product");
                int count = Integer.parseInt(matcher.group("count"));
                double price = Double.parseDouble(matcher.group("price")) * count;
                System.out.printf("%s: %s - %.2f%n", name, product, price);
                totalPrice = totalPrice + price;
            }
            input = scanner.nextLine();
        }
        System.out.printf("Total income: %.2f", totalPrice);
    }
}