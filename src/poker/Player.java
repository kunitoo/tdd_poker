package poker;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
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

    public boolean isTwoPair() {
        Map<Integer, Integer> numberMap = new HashMap<Integer, Integer>();
        for (Card card : cards) {
            if (!numberMap.containsKey(card.number)) numberMap.put(card.number, 1);
            else {
                numberMap.put(card.number, numberMap.get(card.number) +1);
            }
        }
        if (numberMap.size() != 3) return false;
        for (Integer count : numberMap.values()) {
            if (count == 3) return false;
        }
        return true;
    }
}
