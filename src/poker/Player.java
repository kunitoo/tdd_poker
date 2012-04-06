package poker;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Player {

    public List<Integer> numbers = new ArrayList<Integer>();

    public boolean isOnePair() {
        Set<Integer> numberSet = new HashSet<Integer>(numbers);
        return numberSet.size() == 4;
    }
}
