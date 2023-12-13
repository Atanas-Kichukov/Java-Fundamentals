package MidExam;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class TresureHunt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split("\\|");
        List<String> treasure = new ArrayList<>();
        for (String s : input) {
            treasure.add(s);
        }

        String[] commandInformation = scanner.nextLine().split(" ");
        String command = commandInformation[0];
        while (!command.equals("Yohoho!")) {
            switch (command) {
                case "Loot":
                    for (int i = 1; i < commandInformation.length; i++) {
                        String item = commandInformation[i];
                        if(treasure.contains(item)){
                            continue;
                        }
                        else{

                        treasure.add(0, item);
                        }
                    }
                    break;
                case"Drop":
                    int index = Integer.parseInt(commandInformation[1]);
                    if(index<0 || index > treasure.size()){
                        break;
                    }
                    else{

                    String temp = treasure.get(index);
                    treasure.remove(index);
                    treasure.add(treasure.size(), temp);
                    }
                    break;
                case"Steal":
                    int count = Integer.parseInt(commandInformation[1]);
                    if(count> treasure.size()){
                        treasure.removeAll(treasure);
                    }
                    else {

                        List<String> stolenItems = new ArrayList<>();
                        String output = "";
                        for (int i = 0; i < count; i++) {
                            int indexStolen = treasure.size() - 1;
                            stolenItems.add(treasure.remove(indexStolen));
                        }
                        Collections.reverse(stolenItems);
                       output = String.join(", ", stolenItems );
                        System.out.println(output);
                    }

                    break;

            }
            commandInformation =scanner.nextLine().split(" ");
            command = commandInformation[0];
        }
        double sum =0;
        int count = 0;
        for (String element : treasure) {
            sum +=element.length();
            count++;
        }
        double result = sum/count;
        if(treasure.size()==0){
            System.out.println("Failed treasure hunt.");
        }
        else {
            System.out.printf("Average treasure gain: %.2f pirate credits.", result);
        }
    }
}
