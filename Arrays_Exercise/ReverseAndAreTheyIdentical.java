package Arrays_Exercise;

import java.util.Scanner;

public class ReverseAndAreTheyIdentical {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       String [] firstArray = scanner.nextLine().split(" ");
       String [] secondArray = scanner.nextLine().split(" ");
       int count = 0 ;
        for (int i = 0; i < firstArray.length / 2  ; i++) {
            String temp = firstArray[i];
            firstArray[i] = firstArray[firstArray.length - i - 1];
            firstArray[firstArray.length - i - 1] = temp;
        // a b c d e f
        // f e d c b a
        }
        for (int i = 0; i < firstArray.length; i++) {
            String firstElement = firstArray[i];
            String secondElement = secondArray[i];
            if (firstElement.equals(secondElement)) {
                count++;
            } else {
                System.out.println("arrays are different!");
                return;
            }
            if (count == firstArray.length) {
                System.out.println("arrays are the same");
            }


        }
    }
}
