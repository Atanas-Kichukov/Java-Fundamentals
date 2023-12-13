package Basic_Syntax_Conditional_Statements_Аnd_Loop_Exercise;

import java.util.Scanner;

public class VendingMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        double sum = 0.0;
        while(!input.equals("Start")){
            double coins = Double.parseDouble(input);
            if(coins!=0.1 && coins!=0.2 && coins!=0.5 && coins!=1 && coins!=2){
                System.out.printf("Cannot accept %.2f%n", coins);
            }
            else {
                sum += coins;
            }
            input = scanner.nextLine();
        }
        String purchase = scanner.nextLine();
        while (!purchase.equals("End")){
            switch (purchase){
                case "Nuts":
                    if(sum >= 2.0){
                        System.out.println("Purchased Nuts");
                        sum = sum - 2.0;
                    }
                    else{
                        System.out.println("Sorry, not enough money");
                    }
                    break;
                case "Water":
                    if(sum>=0.70){
                        System.out.println("Purchased Water");
                        sum = sum - 0.70;
                    }
                    else{
                        System.out.println("Sorry, not enough money");
                    }
                    break;
                    case "Crisps":
                    if(sum>=1.5){
                        System.out.println("Purchased Crisps");
                        sum = sum - 1.50;
                    }
                    else{
                        System.out.println("Sorry, not enough money");
                    }
                    break;
                case "Soda":
                    if(sum>=0.80){
                        System.out.println("Purchased Soda");
                        sum = sum - 0.80;
                    }
                    else{
                        System.out.println("Sorry, not enough money");
                    }
                    break;
                case "Coke":
                    if(sum>=1.0){
                        System.out.println("Purchased Coke");
                        sum = sum - 1.0;
                    }
                    else{
                        System.out.println("Sorry, not enough money");
                    }
                    break;
                default:
                    System.out.println("Invalid product");

            }
            purchase = scanner.nextLine();

        }
        System.out.printf("Change: %.2f",Math.abs(sum));
    }
}
