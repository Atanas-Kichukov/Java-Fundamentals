package FundamentalsExams;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MirrorWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        List<String> finalResult = new ArrayList<>();
        String regex = "(([@#])(?<firstWord>[A-Za-z]{3,})\\2)\\2((?<secondWord>[A-Za-z]{3,})\\2)";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);
        int mirrorWordsCount = 0;
        int wordPairsCount = 0;
        while (matcher.find()) {
            wordPairsCount++;
            String firstWord = matcher.group("firstWord");
            String secondWord = matcher.group("secondWord");
            String reversedWord = "";
            for (int i = firstWord.length() - 1; i >= 0; i--) {
                char letter = firstWord.charAt(i);
                reversedWord += letter;
            }
            if (reversedWord.equals(secondWord)) {
                mirrorWordsCount++;
                String mirrorWords = firstWord + " <=> " + secondWord;
                finalResult.add(mirrorWords);
            }
        }
        if (wordPairsCount == 0) {
            System.out.println("No word pairs found!");
            System.out.println("No mirror words!");
        } else {
            System.out.printf("%d word pairs found!%n",wordPairsCount);
            if (mirrorWordsCount == 0) {
                System.out.println("No mirror words!");
            } else {
                System.out.print("The mirror words are:");
                System.out.println();
                System.out.println(finalResult.toString().replaceAll("[\\]\\[]",""));
            }
        }
    }
}

