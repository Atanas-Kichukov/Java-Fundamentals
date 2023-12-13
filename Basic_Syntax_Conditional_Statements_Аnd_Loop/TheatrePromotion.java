package Basic_Syntax_Conditional_Statements_Аnd_Loop;

import java.util.Scanner;

public class TheatrePromotion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String day = scanner.nextLine();
        int age = Integer.parseInt(scanner.nextLine());
        int price = 0;

        if (age >= 0 && age <=18){
            if (day.equals("Weekday")){
                price = 12;
                System.out.printf("%d$",price);
            }
            else if(day.equals("Weekend")){
                price = 15;
                System.out.printf("%d$",price);
            }
            else if (day.equals("Holiday")){
                price = 5;
                System.out.printf("%d$",price);
            }
        }
        else if (age>18 && age<=64){
            if (day.equals("Weekday")){
                price = 18;
                System.out.printf("%d$",price);
            }
            else if(day.equals("Weekend")){
                price = 20;
                System.out.printf("%d$",price);
            }
            else if (day.equals("Holiday")){
                price = 12;
                System.out.printf("%d$",price);
            }
        }
        else if (age>64 && age<=122){
            if (day.equals("Weekday")){
                price = 12;
                System.out.printf("%d$",price);
            }
            else if(day.equals("Weekend")){
                price = 15;
                System.out.printf("%d$",price);
            }
            else if (day.equals("Holiday")){
                price = 10;
                System.out.printf("%d$",price);
            }
        }
        else{
            System.out.println("Error!");
        }
    }
}
