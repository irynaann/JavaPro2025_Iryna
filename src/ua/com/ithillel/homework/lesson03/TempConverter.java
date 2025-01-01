package ua.com.ithillel.homework.lesson03;

public class TempConverter {
    public static void main(String[] args) {
        System.out.println("Temperature Converter");
        double fahrenheit = 30.2;
        double celsius = convertFtoC(fahrenheit);
        System.out.println("----Fahrenheit to Celsius Conversion----");
        System.out.printf("%.1f °F = %.1f °C",fahrenheit, celsius);
    }
        public static double convertFtoC (double fahrenheit){
            return (fahrenheit - 32) / 1.8;
        }
    }