package bankomate.exceptions;

public class NotEnoughMoneyException extends Exception {

    public NotEnoughMoneyException() {
        super("Недостаточно средств на счете");
    }
}
