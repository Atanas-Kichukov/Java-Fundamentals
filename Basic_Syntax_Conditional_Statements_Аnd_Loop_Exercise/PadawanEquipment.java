package Basic_Syntax_Conditional_Statements_Аnd_Loop_Exercise;

import java.util.Scanner;

public class PadawanEquipment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double money = Double.parseDouble(scanner.nextLine());
        int allStudents = Integer.parseInt(scanner.nextLine());
        double priceForLightsaber = Double.parseDouble(scanner.nextLine());
        double priceForRobes = Double.parseDouble(scanner.nextLine());
        double priceForBelts = Double.parseDouble(scanner.nextLine());
        int students = allStudents;
        int count = 0;

        while(students-6>=0){
            count ++;
            students -=6;
            }

        double moneySaber = Math.ceil(allStudents+(allStudents*0.10)) * priceForLightsaber;
        double moneyRobes = allStudents * priceForRobes;
        double moneyBelts = (allStudents-count) * priceForBelts;
        double neededMoney = moneyBelts + moneySaber + moneyRobes;
        if(money<neededMoney){
            System.out.printf("George Lucas will need %.2flv more.",Math.abs(money - neededMoney));
        }
        else{
            System.out.printf("The money is enough - it would cost %.2flv.",neededMoney);
        }

    }
}
