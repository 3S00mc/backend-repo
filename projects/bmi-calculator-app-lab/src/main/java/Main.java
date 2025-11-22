//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        double bmi = 0.0;
        UserInput userInput = new UserInput();
        BMICalculator bmiCalculator = new BMICalculator();
        String bmiSystem = userInput.obtainBMISystem();
        double weight;
        double height;
        switch (bmiSystem.toUpperCase()) {
            case "IMPERIAL":
                weight = userInput.obtainWeight(bmiSystem);
                height = userInput.obtainHeight(bmiSystem);
                bmi = bmiCalculator.calculateBmiImperial(weight, height);
                break;
            case "METRIC":
                weight = userInput.obtainWeight(bmiSystem);
                height = userInput.obtainHeight(bmiSystem);
                bmi = bmiCalculator.calculateBmiMetric(weight, height);
                break;
            case "":
                System.out.println("Please Enter a valid BMI System as input");
        }

        System.out.println("Your BMI is: " + bmi);
        String bmiCategory = bmiCalculator.getBMICategory(bmi);
        System.out.println("Your BMI category is: " + bmiCategory);
    }
}
