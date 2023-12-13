package Data_Types_And_Variables_Exercise;

import java.util.Scanner;

public class BeerKegs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int interval = Integer.parseInt(scanner.nextLine());
        int kegs = 0;
        double biggestKeg = 0;
        String bigKeg = "";
        while(kegs!=interval){
            String model = scanner.nextLine();
            double radius = Double.parseDouble(scanner.nextLine());
            int heigh = Integer.parseInt(scanner.nextLine());
            double volume = Math.PI * Math.pow(radius,2) * heigh;
            if(volume>biggestKeg){
                bigKeg = model;
                biggestKeg = volume;
            }
            kegs++;
        }
        System.out.println(bigKeg);
    }
}
