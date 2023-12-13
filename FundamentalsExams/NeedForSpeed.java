package FundamentalsExams;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class NeedForSpeed {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfCars = Integer.parseInt(scanner.nextLine());
        Map<String, Map<String, Integer>> cars = new LinkedHashMap<>();

        for (int i = 0; i < numberOfCars; i++) {
            String[] carData = scanner.nextLine().split("\\|");
            String carType = carData[0];
            Integer mileage = Integer.parseInt(carData[1]);
            Integer fuel = Integer.parseInt(carData[2]);
            cars.put(carType,new LinkedHashMap<>());
            cars.get(carType).put("mileage",mileage);
            cars.get(carType).put("fuel", fuel);

        }

        String input = scanner.nextLine();

        while (!input.equals("Stop")) {
            String[] tokens = input.split(" : ");
            String command = tokens[0];
            String car = tokens[1];
            int currentFuel = cars.get(car).get("fuel");
            int mileage = cars.get(car).get("mileage");
            switch (command) {
                case "Drive":
                    int distance = Integer.parseInt(tokens[2]);
                    int neededFuel = Integer.parseInt(tokens[3]);
                    if(neededFuel>currentFuel){
                        System.out.println("Not enough fuel to make that ride");
                    }
                    else{
                        currentFuel-=neededFuel;
                        mileage += distance;
                        cars.get(car).put("fuel",currentFuel);
                        cars.get(car).put("mileage",mileage);
                        System.out.printf("%s driven for %d kilometers. %d liters of fuel consumed.%n"
                                , car,distance,neededFuel);
                        if(mileage>100000){
                            System.out.printf("Time to sell the %s!%n",car);
                            cars.remove(car);
                        }
                    }
                        break;
                case "Refuel":
                    int fuelToRefill = Integer.parseInt(tokens[2]);
                    int difference = Math.min(75 - currentFuel, fuelToRefill);
                    currentFuel+=difference;
                    cars.get(car).put("fuel",currentFuel);
                    System.out.printf("%s refueled with %d liters%n",car,difference);
                    break;
                case "Revert":
                    int kmToRevert = Integer.parseInt(tokens[2]);
                    mileage -=kmToRevert;
                    if (mileage > 10000) {
                        System.out.printf("%s mileage decreased by %d kilometers%n",car,kmToRevert);
                    }
                    else{
                        mileage = 10000;
                    }
                    cars.get(car).put("mileage",mileage);
                    break;
            }
            input = scanner.nextLine();
        }
        cars.entrySet().forEach(element ->{
            System.out.printf("%s -> Mileage: %d kms, Fuel in the tank: %d lt.%n",
                    element.getKey(), element.getValue().get("mileage"), element.getValue().get("fuel"));
        });
    }
}

