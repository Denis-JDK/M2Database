package testDatabase.M2Database.exception;

public class FirstNotCreateException extends RuntimeException{
    public FirstNotCreateException() {
    }

    public FirstNotCreateException(String message) {
        super(message);
    }

    public FirstNotCreateException(String message, Throwable cause) {
        super(message, cause);
    }

    public FirstNotCreateException(Throwable cause) {
        super(cause);
    }

    public FirstNotCreateException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
