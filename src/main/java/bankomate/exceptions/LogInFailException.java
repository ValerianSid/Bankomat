package bankomate.exceptions;

public class LogInFailException extends Exception{

    public LogInFailException(int triesCount) {
        super("Неверный пин-код. Осталось попыток: " + triesCount);

    }
}
