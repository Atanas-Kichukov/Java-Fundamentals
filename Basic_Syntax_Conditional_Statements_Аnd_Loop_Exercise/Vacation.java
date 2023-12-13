package Basic_Syntax_Conditional_Statements_Аnd_Loop_Exercise;

import java.util.Scanner;

public class Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int group = Integer.parseInt(scanner.nextLine());
        String type = scanner.nextLine();
        String day = scanner.nextLine();
        double price =0.0;
        if(day.equals("Friday")){
            switch (type){
                case "Students":
                    price = 8.45;
                    if(group>=30){
                        price = price - (price *0.15);
                    }
                break;
                case "Business":
                    price = 10.90;
                    if(group>=100){
                        price = price * 90;
                    }
                    break;
                case "Regular":
                    price = 15;
                    if(group>=10 && group<=20){
                        price = price - (price *0.05);
                    }
                    break;
            }
        }
        else if(day.equals("Saturday")){
            switch (type){
                case "Students":
                    price = 9.80;
                    if(group>=30){
                        price = price - (price *0.15);
                    }
                    break;
                case "Business":
                    price = 15.60;
                    if(group>=100){
                        price = price * 90;
                    }
                    break;
                case "Regular":
                    price = 20;
                    if(group>=10 && group<=20){
                        price = price - (price *0.05);
                    }
                    break;
        }
    }
        else if(day.equals("Sunday")){
            switch (type){
                case "Students":
                    price = 10.46;
                    if(group>=30){
                        price = price - (price *0.15);
                    }
                    break;
                case "Business":
                    price = 16;
                    if(group>=100){
                        price = price * 90;
                    }
                    break;
                case "Regular":
                    price = 20.50;
                    if(group>=10 && group<=20){
                        price = price - (price *0.05);
                    }
                    break;
            }

        }
        double finalSum= price * group;
        System.out.printf("Total price: %.02f",finalSum);
    }
}

