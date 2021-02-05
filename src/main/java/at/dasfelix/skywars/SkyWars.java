package at.dasfelix.skywars;

import org.bukkit.plugin.java.JavaPlugin;

public class SkyWars extends JavaPlugin {

    private static SkyWars instance;

    @Override
    public void onEnable() {
        instance = this;
    }

    @Override
    public void onDisable() {

    }

    public static SkyWars getInstance() {
        return instance;
    }
}
