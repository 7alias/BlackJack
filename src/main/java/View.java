import java.util.ArrayList;

public class View extends Deck {

    public static void printCards(Model cards) {

        System.out.println("Карты дилера:");
        //for (Model card : cards) {
            System.out.println(cards);
        //}
    }

    public static void printGameStatus(Model cards) {
        System.out.print("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");

        printCards(cards);
        System.out.println("Очки дилера: " + Controller.getPoints(cards) + "\n");
        System.out.println("Ваши карты:");
        printCards(cards);
        System.out.println("Ваши очки: " + Controller.getPoints(cards));
    }




}





