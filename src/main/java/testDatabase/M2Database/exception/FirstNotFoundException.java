package testDatabase.M2Database.exception;

public class FirstNotFoundException extends RuntimeException{

    public FirstNotFoundException() {
    }

    public FirstNotFoundException(String message) {
        super(message);
    }

    public FirstNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }

    public FirstNotFoundException(Throwable cause) {
        super(cause);
    }

    public FirstNotFoundException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
