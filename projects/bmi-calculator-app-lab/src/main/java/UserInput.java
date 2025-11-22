//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.util.Scanner;

public class UserInput {
    public UserInput() {
    }

    public String obtainBMISystem() {
        System.out.println("Welcome to the BMI calculator app!");
        System.out.print("Please select the preferred BMI calculation system (Imperial/Metric):");
        Scanner input = new Scanner(System.in);
        String bmiSystem = input.next();
        return !bmiSystem.equalsIgnoreCase("Imperial") && !bmiSystem.equalsIgnoreCase("Metric") ? "" : bmiSystem;
    }

    public double obtainWeight(String bmiSystem) {
        double weight = 0.0;
        boolean isInvalidInput = true;

        while(isInvalidInput) {
            Scanner input = new Scanner(System.in);
            switch (bmiSystem.toUpperCase()) {
                case "IMPERIAL" -> System.out.print("Enter weight in Pounds:");
                case "METRIC" -> System.out.print("Enter weight in Kilos:");
                case "" -> System.out.println("Please Enter a valid BMI System as input");
            }

            if (input.hasNextDouble()) {
                weight = input.nextDouble();
                isInvalidInput = false;
            } else {
                System.out.println("Please enter a valid weight");
                weight = 0.0;
            }
        }

        return weight;
    }

    public double obtainHeight(String bmiSystem) {
        double height = 0.0;
        boolean isInvalidInput = true;

        while(isInvalidInput) {
            Scanner input = new Scanner(System.in);
            switch (bmiSystem.toUpperCase()) {
                case "IMPERIAL" -> System.out.print("Enter height in Inches:");
                case "METRIC" -> System.out.print("Enter weight in Meters:");
                case "" -> System.out.println("Please Enter a valid BMI System as input");
            }

            if (input.hasNextDouble()) {
                height = input.nextDouble();
                isInvalidInput = false;
            } else {
                System.out.println("Please enter a valid height");
                height = 0.0;
            }
        }

        return height;
    }
}
