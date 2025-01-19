package ua.com.ithillel.homework.lesson08.fundsvalidator.app;

// Кастомний виняток
public class FundsException extends RuntimeException {

    public FundsException(String message) {
        super(message);
    }
}
