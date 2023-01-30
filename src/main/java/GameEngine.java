import com.sun.tools.javac.Main;

import java.util.ArrayList;
import java.util.List;

public class GameEngine extends Model {



       String [] Cards = new String[12];
public String Cards(int i) {
    Cards[0] = "Tuz";
    Cards[1] = "Pic";
    Cards[2]="10";
    Cards[3]="10";
    Cards[4]="9";
    Cards[5]="8";
    Cards[6]="7";
    Cards[7]="6";
    Cards[8]="5";
    Cards[9]="4";
    Cards[10]="3";
    Cards[11]="2";

    return Cards[i];
}


    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public String getDealerName() {
        return dealerName;
    }

    public void setDealerName(String dealerName) {
        this.dealerName = dealerName;
    }

    private String playerName;
    private String dealerName;

}
