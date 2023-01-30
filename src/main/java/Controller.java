import java.util.Scanner;

public class Controller {
    public static void main(String[] args) {

//        new Dealer name
//        new Player name
//        Generate cardSet
        //Views


        Scanner scanner = new Scanner(System.in);


        int choice = 0;
        System.out.println("Enter choice: 1 - dealer name 2 - player name 3 - Deck of cards");

        while (choice != 4) {
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    View.view(1);
                    break;
                case 2:
                    View.view(2);
                    break;
                case 3:
                    View.view(3);
                    break;
                case 4:
                    System.out.println("Goodbye");
                default:
                    break;
            }
        }
    }
}

