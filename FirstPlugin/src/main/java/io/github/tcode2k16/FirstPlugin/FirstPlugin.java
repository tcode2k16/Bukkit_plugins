package io.github.tcode2k16.FirstPlugin;

import org.bukkit.entity.Player;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.HashMap;

import static org.bukkit.Bukkit.getPlayer;

/**
 * Created by alanc on 31/5/16.
 */
public class FirstPlugin extends JavaPlugin {
    private final SamplePlayerListener playerListener = new SamplePlayerListener(this);

    @Override
    public void onDisable() {

        getLogger().info("Goodbye world!");
    }

    @Override
    public void onEnable() {
        PluginManager pm = getServer().getPluginManager();
        pm.registerEvents(playerListener, this);
    }


}
