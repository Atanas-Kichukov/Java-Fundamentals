package MidExam;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayModifier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] array = scanner.nextLine().split(" ");
        String[] commandData = scanner.nextLine().split(" ");
        String command = commandData[0];

        List<Integer> modifiedArray = new ArrayList<>();
        for (String s : array) {
            int num = Integer.parseInt(s);
            modifiedArray.add(num);
        }

        while (!command.equals("end")) {
            switch (command) {
                case "swap":
                    int firstIndex = Integer.parseInt(commandData[1]);
                    int secondIndex = Integer.parseInt(commandData[2]);
                    int firstTemp = modifiedArray.get(firstIndex);
                    int secondTemp = modifiedArray.get(secondIndex);

                    modifiedArray.set(firstIndex, secondTemp);
                    modifiedArray.set(secondIndex,firstTemp );

                    break;
                case "multiply":
                    firstIndex = Integer.parseInt(commandData[1]);
                    secondIndex = Integer.parseInt(commandData[2]);
                    firstTemp = modifiedArray.get(firstIndex);
                    secondTemp = modifiedArray.get(secondIndex);
                    int newElement = firstTemp*secondTemp;
                    modifiedArray.set(firstIndex,newElement);
                    break;
                case "decrease":
                    for (int i = 0; i < modifiedArray.size(); i++) {
                        int current = modifiedArray.get(i);
                        current --;
                        modifiedArray.set(i,current);
                    }
                    break;


            }
            commandData = scanner.nextLine().split(" ");
            command = commandData[0];
        }
        List<String> result = new ArrayList<>();
        for (Integer number : modifiedArray) {
            String element = number.toString();
            result.add(element);
        }
        String output = "";
        output = String.join(", ", result);
        System.out.println(output);
    }

}
