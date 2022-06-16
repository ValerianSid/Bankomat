package bankomate.exceptions;

public class CardBlockException extends RuntimeException {

    public CardBlockException() {
        super("Попыток не осталось. Обратитесь в ближайшее отделение банка");
    }
}
