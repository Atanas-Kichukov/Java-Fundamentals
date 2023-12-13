package Lists_Lection_And_Exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CardsGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> handPlayerOne = arrayToList(scanner);
        List<Integer> handPlayerTwo = arrayToList(scanner);

        while (handPlayerOne.size() > 0 && handPlayerTwo.size() > 0) {
            //20 30 40 50
            //10 20 30 40
            for (int i = handPlayerOne.size() - 1; i >= 0; i--) {
                int playerOneCard = handPlayerOne.get(i);
                int playerTwoCard = handPlayerTwo.get(i);
                if (playerOneCard > playerTwoCard) {
                    handPlayerTwo.remove(i);
                    handPlayerOne.add(playerTwoCard);
                } else if (playerTwoCard > playerOneCard) {
                    handPlayerOne.remove(i);
                    handPlayerTwo.add(playerOneCard);
                } else {
                    handPlayerTwo.remove(i);
                    handPlayerOne.remove(i);
                }
            }
        }


        if (handPlayerOne.size() > handPlayerTwo.size()) {
            int sum = 0;
            for (Integer cards : handPlayerOne) {
                sum += cards;
            }
            System.out.printf("First player wins! Sum: %d", sum);
        } else  {
            int sum = 0;
            for (Integer cards : handPlayerTwo) {
                sum += cards;
            }
            System.out.printf("Second player wins! Sum: %d", sum);
        }

    }


    private static List<Integer> arrayToList(Scanner scanner) {
        String[] input = scanner.nextLine().split(" ");
        List<Integer> cards = new ArrayList<>();
        for (String s : input) {
            int current = Integer.parseInt(s);
            cards.add(current);
        }
        return cards;
    }
}
