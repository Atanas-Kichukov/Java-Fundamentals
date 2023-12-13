package Basic_Syntax_Conditional_Statements_Аnd_Loop_Exercise;

import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String username = scanner.nextLine();
        String password ="";
        boolean isLogged = false;
        for (int i = username.length() - 1; i >=0 ; i--) {
            password += username.charAt(i);
        }
        for (int i = 0; i < 4; i++) {

            String input = scanner.nextLine();
            if(input.equals(password)){
                isLogged = true;
                System.out.printf("User %s logged in.",username);
                break;
            }
            System.out.println("Incorrect password. Try again.");
        }
        if (!isLogged) {
            System.out.printf("User %s blocked!",username);}
        }
    }

