package bankomate.services;

import bankomate.entity.Card;
import bankomate.exceptions.LogInFailException;

public interface AuthorizationService {

    void logIn(Card card, int pin) throws LogInFailException;

    void logOut();
}
