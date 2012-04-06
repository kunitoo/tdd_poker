package poker;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Player {

    public List<Card> cards = new ArrayList<Card>();

    public boolean isOnePair() {
        Set<Integer> numberSet = new HashSet<Integer>();
        for (Card card : cards) {
            numberSet.add(card.number);
        }
        return numberSet.size() == 4;
    }
}
