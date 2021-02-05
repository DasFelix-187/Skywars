package at.dasfelix.skywars.team;

import at.dasfelix.skywars.manager.GameData;
import javafx.print.PageLayout;
import org.bukkit.entity.Player;

import java.util.ArrayList;

public class Team {

    String colorCode;
    String name;

    ArrayList<String> players = new ArrayList<>();

    public Team(String colorCode, String name) {
        this.colorCode = colorCode;
        this.name = name;
    }

    public void add(String name) {
        players.add(name);
    }

    public void remove(String name) {
        players.remove(name);
    }

}
