import java.util.ArrayList;
import java.util.function.IntFunction;

public class Model extends ArrayList<Model> {

    private String value;
    private String suit;
    private int cardValue;

    public Model(String value, String suit) {
        this.value = value;
        this.suit = suit;
        switch (value) {
            case "Ace":
                this.cardValue = 11;
                break;
            case "Jack":
            case "Queen":
            case "King":
                this.cardValue = 10;
                break;
            default:
                this.cardValue = Integer.parseInt(value);
                break;
        }
    }

    public int getCardValue() {
        return cardValue;
    }
    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value + " " + suit;
    }

    @Override
    public <T> T[] toArray(IntFunction<T[]> generator) {
        return super.toArray(generator);
    }


}
