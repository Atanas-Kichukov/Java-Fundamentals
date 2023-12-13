package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class SumEven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] numbers = scanner.nextLine().split(" ");
       int[] parsed = Arrays.stream(numbers).mapToInt(i -> Integer.parseInt(i)).toArray();
        int sum = 0;
        for (int current : parsed) {
            if (current % 2 == 0) {
                sum += current;
            }
            System.out.println(sum);
        }
    }
}
//package Fundamentals_06;
//
//import java.util.Arrays;
//import java.util.Scanner;
//
//public class sumEven {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        String[] numbers = scanner.nextLine().split(" ");
//       int[] parsed = Arrays.stream(numbers).mapToInt(i -> Integer.parseInt(i)).toArray();
//        int sum = 0;
//        for (int current : parsed) {
//            if (current % 2 == 0) {
//                sum += current;
//            }
//            System.out.println(sum);
//        }
//    }
//}
