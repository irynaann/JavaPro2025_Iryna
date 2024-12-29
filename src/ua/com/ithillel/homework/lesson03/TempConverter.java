package ua.com.ithillel.homework.lesson03;

public class TempConverter {
    public static void main(String[] args) {
        System.out.println("Temperature Converter");
        double fahrenheit = 30.2;
        double celsius = convertFtoC(fahrenheit);
        System.out.println("----Fahrenheit to Celsius Conversion----");
        System.out.printf("%.1f °F = %.1f °C %n", fahrenheit, celsius);
        System.out.println("----Celsius to Fahrenheit Conversion----");
        double celsius2 = 25;
        double fahrenheit2 = convertCtoF(celsius2);
        System.out.printf("%.1f °C = %.1f °F", celsius2, fahrenheit2);
    }

    public static double convertFtoC(double fahrenheit) {
        return (fahrenheit - 32) / 1.8;
    }

    public static double convertCtoF(double celsius) {
        return celsius * 1.8 + 32;
    }
}