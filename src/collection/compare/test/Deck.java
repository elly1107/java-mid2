package collection.compare.test;

import java.util.ArrayList;
import java.util.List;

public class Deck {
    private List<Card> cards = new ArrayList<>();

    public Deck() {
        for (int i = 0; i < 13; i++) {
            cards.add(new Card(i, Suit.SPADE));
            cards.add(new Card(i, Suit.HEART));
            cards.add(new Card(i, Suit.DIAMOND));
            cards.add(new Card(i, Suit.CLUB));
        }
    }

}
