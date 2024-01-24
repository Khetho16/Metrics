package com.khethokuhle;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the unit to convert from (Feet, Pounds, Fahrenheit): ");
        String fromUnit = scanner.nextLine().toLowerCase();

        System.out.print("Enter the unit to convert to (Meters, Kgs, Celsius): ");
        String toUnit = scanner.nextLine().toLowerCase();

        System.out.print("Enter the quantity to be converted: ");
        double quantity = scanner.nextDouble();

        double result = conversion(fromUnit, toUnit, quantity);
        System.out.println("The results after conversion: " + result + " " + toUnit);
    }

    public static double conversion(String fromUnit, String toUnit, double quantity) {

        if ("feet".equals(fromUnit)) {
            return convertFeetToMeters(quantity);
        }
        else if ("pounds".equals(fromUnit)) {
            return convertPoundsToKgs(quantity);
        }
        else if ("fahrenheit".equals(fromUnit)) {
            return convertFahrenheitToCelsius(quantity);
        }

        return quantity;
    }

    public static double convertFeetToMeters(double feet){
        return feet * 0.3048;
    }
    public static double convertPoundsToKgs(double pounds){
        return pounds * 0.453592;
    }
    public static double convertFahrenheitToCelsius(double fahrenheit){
        return (fahrenheit - 32) * 5/9;
    }

}

