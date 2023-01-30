import java.util.Arrays;
import java.util.HashSet;

import java.util.Set;

public class Deck {
    private Set<Integer> cardSet = new HashSet();

    public Deck() {
        Set<Integer> cardRank = new HashSet<>();


        for (int i = 0; i < 12; i++) {
            cardRank.add((int) (Math.random() * 10 + 2));
        }

        setCardSet(cardRank);
    }




    public void setCardSet(Set<Integer> cardSet) {

        this.cardSet = Set.copyOf(cardSet);

    }

    public Set<Integer> getCardSet() {
        return cardSet;
    }
}
