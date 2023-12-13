package MidExam;

import java.util.Scanner;

public class SoftUniReception {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstEmployee = Integer.parseInt(scanner.nextLine());
        int secondEmployee = Integer.parseInt(scanner.nextLine());
        int thirdEmployee = Integer.parseInt(scanner.nextLine());
        int studentCount = Integer.parseInt(scanner.nextLine());

        int allCapability = firstEmployee + secondEmployee + thirdEmployee;
        int hour = 0;
        while(studentCount>0){

            hour++;
            if(hour % 4 == 0){
                hour++;
            }
            studentCount -=allCapability;
        }
        System.out.printf("Time needed: %dh.", hour);
    }
}
