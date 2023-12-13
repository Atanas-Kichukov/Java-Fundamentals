package MidExam;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ManOwar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input1 = scanner.nextLine().split(">");
        String[] input2 = scanner.nextLine().split(">");
        int maxHealth = Integer.parseInt(scanner.nextLine());
        String commandInformation = scanner.nextLine();

        List<Integer> pirateShip = new ArrayList<>();
        for (String s : input1) {
            int current = Integer.parseInt(s);
            pirateShip.add(current);
        }


        List<Integer> warShip = new ArrayList<>();
        for (String s : input2) {
            int current = Integer.parseInt(s);
            warShip.add(current);
        }

        String[] commandData = commandInformation.split(" ");
        String command = commandData[0];
        while (!command.equals("Retire")) {
            switch (command) {
                case "Fire":
                    int index = Integer.parseInt(commandData[1]);
                    int dmg = Integer.parseInt(commandData[2]);
                    if (index < 0 || index > warShip.size() -1 ) {
                        break;
                    }
                    int sectionHealth = warShip.get(index);
                    sectionHealth -= dmg;
                    warShip.set(index, sectionHealth);
                    if (sectionHealth <= 0) {
                        System.out.println("You won! The enemy ship has sunken");
                        return;
                    }
                    break;
                case "Defend":
                    int startIndex = Integer.parseInt(commandData[1]);
                    int endIndex = Integer.parseInt(commandData[2]);
                    if (startIndex < 0 || endIndex > pirateShip.size()-1) {
                        break;
                    }
                    int damage = Integer.parseInt(commandData[3]);
                    for (int i = startIndex; i <= endIndex; i++) {
                        int healthPirateShip = pirateShip.get(i);
                        healthPirateShip -= damage;


                        if (healthPirateShip <= 0) {
                            System.out.println("You lost! The pirate ship has sunken.");
                            return;
                        }
                        else {
                            pirateShip.set(i, healthPirateShip);
                        }
                    }
                    break;
                case "Repair":
                    int indexToRepair = Integer.parseInt(commandData[1]);
                    if(indexToRepair<0 || indexToRepair> pirateShip.size()-1){
                        break;
                    }
                    int healthToAdd = Integer.parseInt(commandData[2]);
                    int newHealth = pirateShip.get(indexToRepair) + healthToAdd;
                    pirateShip.set(indexToRepair,newHealth);
                    if(newHealth>70){
                        newHealth = 70;
                        pirateShip.set(indexToRepair, newHealth);
                    }
                    break;
                case "Status":
                    double lowerHealthPercent = maxHealth * 0.20;
                    int damagedParts = 0;
                    for (Integer integer : pirateShip) {
                        if(integer<lowerHealthPercent){
                            damagedParts++;
                        }
                    }
                    System.out.printf("%d sections need repair.%n", damagedParts);


                    break;
            }



        commandInformation = scanner.nextLine();
        commandData = commandInformation.split(" ");
        command = commandData[0];
        }
        int pirateShipSum = 0;
        int warShipSum = 0;
        for (Integer parts : pirateShip) {
            pirateShipSum+=parts;
        }
        for (Integer parts : warShip) {
            warShipSum +=parts;
        }
        System.out.printf("Pirate ship status: %d%n",pirateShipSum);
        System.out.printf("Warship status: %d%n",warShipSum);

    }
}


