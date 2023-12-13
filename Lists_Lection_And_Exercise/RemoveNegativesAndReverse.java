package Lists_Lection_And_Exercise;

import java.util.*;

public class RemoveNegativesAndReverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String [] input = scanner.nextLine().split(" ");
        List<Integer> listOfIntegers = new ArrayList<>();

        for (String s : input) {
            int current = Integer.parseInt(s);
            listOfIntegers.add(current);
        }
           // listOfIntegers.removeIf(a -> a<0);
        for (int i = 0; i < listOfIntegers.size(); i++) {
            if(listOfIntegers.get(i)<0){
                listOfIntegers.remove(i--);
            }
        }
        Collections.reverse(listOfIntegers);
        if(listOfIntegers.size()==0){
            System.out.print("empty");
        }else {


            for (Integer number : listOfIntegers) {
                System.out.print(number + " ");
            }
        }
    }
}
