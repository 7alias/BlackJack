import java.util.ArrayList;
import java.util.Scanner;

public class Controller {

    static Scanner scanner = new Scanner(System.in);

    static ArrayList<Model> dealerCards = new ArrayList<>();
    static ArrayList<Model> playerCards = new ArrayList<>();
    public static int getPoints(Model model) {
        int points = 0;
        int aceCount = 0;

        if (model.getValue().equals("Ace")) {
            points += 1;
            aceCount++;
        } else {
            points += model.getCardValue();
        }

        while (points + 10 <= 21 && aceCount > 0) {
            points += 10;
            aceCount--;
        }
        return points;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        Generate cardSet
        System.out.println("Welcome to the BlackJack game");
        System.out.println("Enter player name:");
        String playerName = scanner.nextLine();
        while (true) {
            dealerCards.clear();
            playerCards.clear();
            Deck deck = Deck.newGame();


            dealerCards.add(deck.getCard());
            Model dealerSecondCard = deck.getCard();

            View.printCards(dealerCards);


            if (getPoints(dealerCards) == 11) {

                if (dealerSecondCard.getCardValue() == 10) {

                    dealerCards.add(dealerSecondCard);
                    View.printGameStatus(dealerCards);

                    if (startNewGame(false)) continue;
                    else break;
                }
            }


            Boolean startNewGame = null;
            while (true) {
                playerCards.add(deck.getCard());
                View.printGameStatus(playerCards);
                if (getPoints(playerCards) > 21) {
                    if (!(getPoints(playerCards) == 22
                            && playerCards.size() == 2
                            && playerCards.get(0).getValue().equals("Ace")
                            && playerCards.get(1).getValue().equals("Ace"))) {
                        startNewGame = startNewGame(false);
                        break;
                    }
                }

                System.out.println("Будете брать еще карту? (y/n)");
                String playerAnswer = "";

                while (!(playerAnswer.equals("y") || playerAnswer.equals("n"))) {
                    playerAnswer = scanner.nextLine();
                }

                if (playerAnswer.equals("n")) {
                    break;
                }
            }

            if (startNewGame != null) {
                if (startNewGame) continue;
                else break;
            }

            while (getPoints(dealerCards) < 17) {
                View.printGameStatus(dealerCards);
                dealerCards.add(deck.getCard());

                if (getPoints(dealerCards) > 21) {
                    if (!(getPoints(dealerCards) == 22
                            && dealerCards.size() == 2
                            && dealerCards.get(0).getValue().equals("Ace")
                            && dealerCards.get(1).getValue().equals("Ace"))) {
                        View.printGameStatus(dealerCards);
                        startNewGame = startNewGame(true);
                        break;
                    }
                }
            }

            if (startNewGame != null) {
                if (startNewGame) continue;
                else break;
            }

            View.printGameStatus(playerCards);

            boolean playerAnswer;
            if (getPoints(dealerCards) > getPoints(playerCards)) {
                playerAnswer = startNewGame(false);
            } else if (getPoints(dealerCards) < getPoints(playerCards)) {
                playerAnswer = startNewGame(true);
            } else {
                playerAnswer = startNewGame();
            }

            if (playerAnswer) continue;
            else break;
        }
    }


    public static boolean startNewGame(boolean win) {
        if (win) {
            System.out.println("Ты победил. Начать новую игру? (y/n)");
        } else {
            System.out.println("Ты проиграл. Начать новую игру? (y/n)");
        }

        String playerAnswer = scanner.nextLine();
        while (!(playerAnswer.equals("y") || playerAnswer.equals("n"))) {
            System.out.println("Некорректное значение. Нужно ввести y или n");
            playerAnswer = scanner.nextLine();
        }
        return playerAnswer.equals("y");
    }

    public static boolean startNewGame() {
        System.out.println("Ничья. Начать новую игру? (y/n)");

        String playerAnswer = scanner.nextLine();
        while (!(playerAnswer.equals("y") || playerAnswer.equals("n"))) {
            System.out.println("Некорректное значение. Нужно ответить y или n");
            playerAnswer = scanner.nextLine();
        }
        return playerAnswer.equals("y");
    }


}

