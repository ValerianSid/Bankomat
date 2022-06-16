package bankomate.services;

import bankomate.entity.Card;
import bankomate.exceptions.CardBlockException;
import bankomate.exceptions.LogInFailException;

public class AuthorizationServiceImpl implements AuthorizationService{

    private int triesCount = 3;

    public void logIn(Card card, int pin) throws LogInFailException {
        if (card.getPin() != pin){
            triesCount--;
            throw new LogInFailException(triesCount);
        }

    }

    public void logOut() {
        if (triesCount == 0){
            throw new CardBlockException();
        }
    }
}
