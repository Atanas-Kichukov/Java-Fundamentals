package Basic_Syntax_Conditional_Statements_Аnd_Loop;

import java.util.Scanner;

public class BackIn30Minutes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hours = Integer.parseInt(scanner.nextLine());
        int minutes = Integer.parseInt(scanner.nextLine());
        int newMinutes = minutes +30;
        if (newMinutes > 59) {
            hours++;
            newMinutes = Math.abs(60 - newMinutes);
        }
        if (hours > 23) {
            hours = 0;
        }
        if (newMinutes < 10) {
            System.out.printf("%d:0%d",hours, newMinutes);
        }
        else{
            System.out.printf("%d:%d",hours,newMinutes);
        }
    }
}
