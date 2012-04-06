package poker;


public class Card {

    public Integer number;
    public Suit suit;

    private Card() {
        super();
    }

    public static Card getInstance(Integer number, Suit suit) {
        if (number < 1 || number > 13) {
            throw new IllegalArgumentException();
        }
        Card card = new Card();
        card.number = number;
        card.suit = suit;
        return card;
    }
}
