package MidExam;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Numers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");

        List<Integer> allNumbers = new ArrayList<>();
        int sum = 0;
        int count = 0;
        for (String s : input) {
            int current = Integer.parseInt(s);
            sum += current;
            count++;
            allNumbers.add(current);
        }

        double average = 1.0 * sum / count;

        List<Integer> newNumbers = new ArrayList<>();
        for (Integer number : allNumbers) {
            if (number > average) {
                newNumbers.add(number);
            }
        }
        if(newNumbers.size()<1){
            System.out.println("No");
            return;
        }
        Collections.sort(newNumbers, Collections.reverseOrder());
        int stopper = 0;
        for (Integer newNumber : newNumbers) {
            System.out.print(newNumber + " ");
            stopper++;
            if(stopper==5){
                break;
            }
        }

    }
}
