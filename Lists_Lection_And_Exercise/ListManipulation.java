package Lists_Lection_And_Exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class ListManipulation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        List<Integer> listForManipulation = new ArrayList<>();

        for (String element : input) {
            int current = Integer.parseInt(element);
            listForManipulation.add(current);
        }
        String[] newArray = scanner.nextLine().split(" ");

        String command = newArray[0];

        while (!command.equals("end")) {
            switch (command) {

                case "Add":
                    int numberToAdd = Integer.parseInt(newArray[1]);
                    listForManipulation.add(numberToAdd);
                    break;

                case "Remove":
                    int numberToRemove = Integer.parseInt(newArray[1]);
                    listForManipulation.remove(Integer.valueOf(numberToRemove));
                    break;

                case "RemoveAt":
                    int numberRemoveAt = Integer.parseInt(newArray[1]);
                    listForManipulation.remove(numberRemoveAt);
                    break;

                case "Insert":
                    int number = Integer.parseInt(newArray[1]);
                    int index = Integer.parseInt(newArray[2]);
                    listForManipulation.add(index, number);
                    break;
                case"Contains":
                    int numberToCheck = Integer.parseInt(newArray[1]);
                    if(listForManipulation.contains(numberToCheck)){
                        System.out.println("Yes");
                    }
                    else{
                        System.out.println("No such number");
                    }
                    break;
                case "Print":
                    String evenOrOdd = newArray[1];
                    if(evenOrOdd.equals("even")){
                        for (Integer elements : listForManipulation) {
                            if(elements % 2 == 0){
                                System.out.print(elements + " ");
                            }
                        }
                        System.out.println();
                    }
                    else if (evenOrOdd.equals("odd")){
                        for (Integer elements : listForManipulation) {
                            if(elements % 2 != 0){
                                System.out.print(elements + " ");
                            }
                        }
                        System.out.println();
                    }
                        break;
                case"Get":
                    String token = newArray[1];
                    int sum = 0;
                    if(token.equals("sum")){
                        for (Integer elements : listForManipulation) {
                            sum +=elements;
                        }
                        System.out.println(sum);

                    }

                    else{
                        break;
                    }

                    break;

                case"Filter":
                    String condition = newArray[1];
                    int numberFilter = Integer.parseInt(newArray[2]);
                    if(condition.equals("<")){
                        for (Integer elements : listForManipulation) {
                            if(elements<numberFilter){
                                System.out.print(elements + " ");
                            }
                        }
                        System.out.println();
                    }
                    else if(condition.equals(">")){
                        for (Integer elements : listForManipulation) {
                            if(elements>numberFilter){
                                System.out.print(elements + " ");
                            }
                        }
                        System.out.println();
                    }
                    else if (condition.equals("<=")) {
                        for (Integer elements : listForManipulation) {
                            if (elements <= numberFilter) {
                                System.out.print(elements + " ");
                            }
                        }
                        System.out.println();
                    }
                    else if(condition.equals(">=")){
                        for (Integer elements : listForManipulation) {
                            if(elements>=numberFilter){
                                System.out.print(elements + " ");
                            }
                        }
                        System.out.println();
                    }
                    break;
            }
            newArray = scanner.nextLine().split(" ");
            command = newArray[0];
        }
    }
}