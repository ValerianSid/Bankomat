package bankomate.services;

import bankomate.entity.Card;
import bankomate.exceptions.LogInFailException;
import bankomate.exceptions.NotEnoughMoneyException;

public interface CardService {

    void cashIssue(int ammount) throws NotEnoughMoneyException;
    String viewCashAmount();
    String pinChange(int oldPin, int newPin) throws LogInFailException;
    String addCash(int ammount);
}
