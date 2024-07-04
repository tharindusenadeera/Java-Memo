import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to BMI Calculator!");

        Scanner input  = new Scanner(System.in);

        System.out.println("Enter your weight:");
        double weight = input.nextDouble();

        System.out.println("Enter your height in feet's:");
        int heightInFeets = input.nextInt();

        System.out.println("Enter remaining inches");
        int heightInInches = input.nextInt();

        int totalHeightInInches = (heightInFeets * 12) + heightInInches;

        input.close();

        double bmi = weight / Math.pow(totalHeightInInches, 2) * 703;

        DecimalFormat df = new DecimalFormat("0.0");
        System.out.println("Your BMI is:" + df.format(bmi));
    }
}