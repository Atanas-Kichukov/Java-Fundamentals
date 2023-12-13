package Data_Types_And_Variables_Exercise;

import java.util.Scanner;

public class Snowballs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfSnowballs = Integer.parseInt(scanner.nextLine());
        int bestsnowballSnow = Integer.parseInt(scanner.nextLine());
        int bestsnowballTime = Integer.parseInt(scanner.nextLine());
        int bestsnowballQuality = Integer.parseInt(scanner.nextLine());
        int snowballValue = (int) (Math.pow((bestsnowballSnow / bestsnowballTime), bestsnowballQuality));
        for (int i = 1; i < numberOfSnowballs; i++) {
             int snowballSnow = Integer.parseInt(scanner.nextLine());
             int snowballTime = Integer.parseInt(scanner.nextLine());
             int snowballQuality = Integer.parseInt(scanner.nextLine());

            int curentValue = (int) (Math.pow((snowballSnow / snowballTime), snowballQuality));
            if(curentValue>snowballValue){
                snowballValue = curentValue;
                bestsnowballTime =snowballTime;
                bestsnowballSnow = snowballSnow;
                bestsnowballQuality = snowballQuality;

            }
        }

        System.out.printf("%d : %d = %d (%d)",bestsnowballSnow, bestsnowballTime, snowballValue, bestsnowballQuality);
    }
}
