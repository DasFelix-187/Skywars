package at.dasfelix.skywars.team;

import java.util.ArrayList;
import java.util.Arrays;

public class Teams {

    public static Team TEAM_GREEN = new Team("§a", "Grün");
    public static Team TEAM_RED = new Team("§c", "Rot");
    public static Team TEAM_BLUE = new Team("§9", "Blau");
    public static Team TEAM_YELLOW = new Team("§e", "Gelb");

    public static ArrayList<Team> teams = new ArrayList<>(Arrays.asList(TEAM_GREEN, TEAM_RED, TEAM_BLUE, TEAM_YELLOW));
}
