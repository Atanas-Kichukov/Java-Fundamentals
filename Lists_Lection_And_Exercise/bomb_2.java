package Lists_Lection_And_Exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class bomb_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String [] input = scanner.nextLine().split(" ");

        List<Integer> bombNumbers = new ArrayList<>();
        for (String element : input) {
            int current = Integer.parseInt(element);
            bombNumbers.add(current);
        }

        String[] bombInfo = scanner.nextLine().split(" ");
        int bomb = Integer.parseInt(bombInfo[0]);
        int bombPower = Integer.parseInt(bombInfo[1]);

        while(bombNumbers.contains(bomb)){
            int index = bombNumbers.indexOf(bomb);
            int leftBound = Math.max(index - bombPower, 0);
            int rightBound = Math.min(index + bombPower, bombNumbers.size() - 1);
            for (int i = rightBound; i >= leftBound ; i--) {
                bombNumbers.remove(i);
            }
        }
        int sum = 0;
        for (Integer bombNumber : bombNumbers) {
            sum+=bombNumber;
        }
        System.out.println(sum);
    }
}
