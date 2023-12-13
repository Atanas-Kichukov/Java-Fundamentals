package Lists_Lection_And_Exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AppendArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> result = new ArrayList<>();
        String[] input = scanner.nextLine().split("\\|");
        for (int i = input.length - 1; i >=0 ; i--) {
            String [] temp = input[i].split("\\s+");
            for (String s : temp) {
                if(!s.equals("")){
                    result.add(s);
                }
            }
        }
        for (String element : result) {
            System.out.print(element + " ");
        }
    }
}
