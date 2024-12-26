package ua.com.ithillel.homework.lesson02;

public class Converter {
    public static void main(String[] args) {
        System.out.println("----Functionality for converting miles to kilometers, kilometers to miles----");
        double mile = 4.0;
        double kilometers = mile * 1.61;
        System.out.println("Converting " + mile + " miles to kilometers: " + kilometers);
        double kilometers2 = 2.0;
        double mile2 = kilometers2 / 1.61;
        System.out.println("Converting " + kilometers2 + " kilometers to miles: " + mile2);
    }
}