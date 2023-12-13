package Lists_Lection_And_Exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ChangeList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");

        List<Integer> ListForManipulation = new ArrayList<>();
        for (String elements : input) {
            int current = Integer.parseInt(elements);
            ListForManipulation.add(current);
        }

        String[] commandInput = scanner.nextLine().split(" ");
        String command = commandInput[0];
        while(!command.equals("end")){
            if(command.equals("Delete")){
                int elementToDelete = Integer.parseInt(commandInput[1]);
                for (int i = 0; i < ListForManipulation.size(); i++) {
                    if(ListForManipulation.get(i)==elementToDelete){
                        ListForManipulation.remove(Integer.valueOf(elementToDelete));
                    }
                }

            }
            else if(command.equals("Insert")){
            int elementToInsert = Integer.parseInt(commandInput[1]);
            int positionToInsert = Integer.parseInt(commandInput[2]);
            ListForManipulation.add(positionToInsert, elementToInsert);

            }
            commandInput = scanner.nextLine().split(" ");
            command = commandInput[0];
        }

        for (Integer elements : ListForManipulation) {
            System.out.print(elements + " ");
        }


    }
}
