package Data_Types_And_Variables_Exercise;

import java.util.Scanner;

public class Pokemon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int power = Integer.parseInt(scanner.nextLine());
        int distance = Integer.parseInt(scanner.nextLine());
        int Y = Integer.parseInt(scanner.nextLine());
        int currentPower = power;
        int count = 0;
        while (currentPower >= distance) {
            double half = power/2.0;
            currentPower = currentPower - distance;

            if(currentPower==(int)(half) && Y>0 ){
                currentPower = currentPower /Y;
            }

            count ++;
        }
        System.out.println(currentPower);
        System.out.println(count);
    }
}
