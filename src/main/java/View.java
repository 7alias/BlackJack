import java.util.Scanner;

public class View {
    public static void main(String[] args) {

    }

    public static void view(int choice) {

        GameEngine ge = new GameEngine();
        Deck deck = new Deck();

        System.out.println("Enter choice: 1 - dealer name 2 - player name 3 - Deck of cards");

        switch (choice) {
            case 1:
                System.out.println("DealerName: " + ge.getDealerName());
                break;
            case 2:
                System.out.println("Player1 name: " + ge.getPlayerName());
                break;
            case 3:
                System.out.println(deck.getCardSet());
                break;
            case 4:
                System.out.println("Goodbye");
            default:
                break;
        }
    }

}
