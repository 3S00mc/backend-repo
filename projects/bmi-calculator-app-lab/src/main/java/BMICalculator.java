//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

public class BMICalculator {
    private double weightInPounds = 154.0;
    private double heightInInches = 69.0;
    private double weightInKilos = 70.0;
    private double heightInMeters = 1.75;

    public BMICalculator() {
    }

    public double calculateBmiImperial(double weightInPounds, double heightInInches) {
        return weightInPounds / (heightInInches * heightInInches) * 703.0;
    }

    public double calculateBmiMetric(double weightInKilos, double heightInMeters) {
        return weightInKilos / (heightInMeters * heightInMeters);
    }

    public String getBMICategory(double bmi) {
        if (bmi < 18.5) {
            return "Underweight";
        } else if (bmi < 25.0) {
            return "Normal weight";
        } else {
            return bmi < 30.0 ? "Overweight" : "Obese";
        }
    }
}
