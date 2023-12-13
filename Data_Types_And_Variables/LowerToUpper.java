package Data_Types_And_Variables;

import java.util.Scanner;

public class LowerToUpper {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char letter = scanner.nextLine().charAt(0);
        if(Character.isLowerCase(letter)){
            System.out.printf("lower-case");
        }
        else{
            System.out.printf("upper-case");
        }
    }

}
