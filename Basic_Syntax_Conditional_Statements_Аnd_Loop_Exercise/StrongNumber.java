package Basic_Syntax_Conditional_Statements_Аnd_Loop_Exercise;

import java.util.Scanner;

public class StrongNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());

        int currentNum = number;
        double sum = 0;
        double factoriel = 1;
        while(currentNum>0){
            int lastNum = currentNum % 10;
            for (int i = 1; i <= lastNum; i++) {
                factoriel *= i;


            }

            sum +=factoriel;
            currentNum = currentNum/10;
            factoriel =1;
        }
        if (number == sum) {
            System.out.println("yes");
        }
        else{
            System.out.println("no");
        }

    }
}
