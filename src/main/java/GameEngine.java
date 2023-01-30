import com.sun.tools.javac.Main;

import java.util.ArrayList;
import java.util.List;

public class GameEngine extends Model {




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
