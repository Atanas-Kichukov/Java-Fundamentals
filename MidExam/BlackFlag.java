package MidExam;

import java.util.Scanner;

public class BlackFlag {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int days = Integer.parseInt(scanner.nextLine());
        int dailyPlunder = Integer.parseInt(scanner.nextLine());
        double goal = Double.parseDouble(scanner.nextLine());

        double currentPlunder = 0;
        for (int i = 1; i <=days ; i++) {
            currentPlunder +=dailyPlunder;

            if (i % 3 == 0) {
                currentPlunder = currentPlunder + (dailyPlunder * 0.5);
            }
            else if(i % 5 == 0){
                currentPlunder = currentPlunder - (currentPlunder * 0.3);
            }
        }
        double percent = (currentPlunder/goal) * 100;
        if (currentPlunder >= goal) {
            System.out.printf("Ahoy! %.2f plunder gained.",currentPlunder);
        }
        else{
            System.out.printf("Collected only %.2f%% of the plunder",percent);
        }
    }
}
