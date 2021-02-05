package at.dasfelix.skywars.manager;

import org.bukkit.Bukkit;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;

import java.io.File;

public class GameData {
    public static int teamSize;
    public static String prefix;

    public static void loadGameData() {
        File file = new File("/plugins/SkyWars", "gamedata.yml");
        if(!file.exists()) {
            Bukkit.getConsoleSender().sendMessage("§cThere was an error when loading the GameData!");
            Bukkit.getConsoleSender().sendMessage("§cThe file 'gamedata.yml' does not exist!");
            Bukkit.getServer().shutdown();
        }
        FileConfiguration cfg = YamlConfiguration.loadConfiguration(file);
        prefix = cfg.getString("gamedata.prefix");
        teamSize = cfg.getInt("gamedata.teamsize");
    }
}
