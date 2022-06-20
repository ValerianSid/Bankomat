package bankomate.services;

import bankomate.entity.Card;
import bankomate.exceptions.LogInFailException;
import bankomate.exceptions.NotEnoughMoneyException;

public class CardServiceImpl implements CardService{

    private AuthorizationService authorizationService;
    private Card card;

    public CardServiceImpl(AuthorizationService authorizationService, Card card) {
        this.authorizationService = authorizationService;
        this.card = card;
    }

    public void cashIssue(int ammount) throws NotEnoughMoneyException {
        if (card.getCashAmount() < ammount){
            throw new NotEnoughMoneyException();
        }
        card.setCashAmount(card.getCashAmount() - ammount);
    }

    public String viewCashAmount() {
        return String.valueOf(card.getCashAmount());
    }

    public String pinChange(int oldPin, int newPin) throws LogInFailException {
       authorizationService.logIn(card, oldPin);
       card.setPin(newPin);
       return "Пин-код успешно изменен";
    }

    public String addCash(int ammount) {
        authorizationService.logIn(card, Pin);
        card.setCashAmount(card.getCashAmount() + ammount);
        return "Сумма добавлена на счет";
    }
}
