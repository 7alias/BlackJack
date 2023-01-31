import java.util.*;

public class Deck {
    private static List<Model> deck;

    Deck(){
        this.deck = new ArrayList<>();
    }




    public static Deck newGame() {

        Deck cardSet = new Deck();

        String[] cardSuit = {"♠", "♥", "♦", "♣"};
        String[] cardRank = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
        for (int i = 0; i < cardRank.length; i++) {

            for (String rank : cardRank) {
                for (String suit : cardSuit) {
                    deck.add(new Model(rank, suit));
                }
            }
            Collections.shuffle(deck);
        }
        return cardSet;

    }

    public Model getCard() {
        Model card = deck.get(0);
        deck.remove(0);
        return card;
    }

    public Model draw() {
        return deck.remove(0);
    }

    public int getDeckSize() {
        return deck.size();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Model card : deck) {
            sb.append(card.toString()).append("\n");
        }
        return sb.toString();
    }
}







