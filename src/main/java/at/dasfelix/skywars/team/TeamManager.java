package at.dasfelix.skywars.team;

import at.dasfelix.skywars.manager.GameData;
import org.bukkit.entity.Player;

public class TeamManager {

    public void removePlayer(String name) {
        Teams.teams.forEach(team -> team.remove(name));
    }

    public String addPlayer(Player player, Team team) {
        if(!team.players.contains(player.getName())) {
            if(team.players.size() < GameData.teamSize) {
                removePlayer(player.getName());
                team.add(player.getName());
                return GameData.prefix + "§aDu bist dem Team " + team.colorCode + team.name + " §abeigetreten";
            } else return GameData.prefix + "§cDieses Team ist bereits voll!";
        } else return GameData.prefix + "§cDu bist bereits in diesem Team!";
    }
}
