import java.util.Scanner;

public class View {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        GameEngine ge = new GameEngine();
        Deck deck = new Deck();
        int choice = 0;
        System.out.println("Enter choice: 1 - dealer name 2 - player name 3 - Deck of cards");

        while (choice != 4) {
            choice = scanner.nextInt();
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
                default: break;
            }
        }

    }
}
