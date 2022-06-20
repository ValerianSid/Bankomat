package bankomate.entity;

import bankomate.services.*;

public class Bankomate {

    private Card card;
    private AuthorizationService authorizationService;
    private CardService cardService;
    private IOService ioService;

    public Bankomate(Card card, AuthorizationService authorizationService, CardService cardService, IOService ioService) {
        this.card = card;
        this.authorizationService = new AuthorizationServiceImpl();
        this.cardService = new CardServiceImpl(this.authorizationService, this.card);
        this.ioService = new IOServiceImpl();
    }

}
