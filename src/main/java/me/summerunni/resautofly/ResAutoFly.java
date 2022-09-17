package me.summerunni.resautofly;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public final class ResAutoFly extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getLogger().info("ResAutoFly enabled..");
        Bukkit.getPluginManager().registerEvents(new EventHandler(), this);
    }

    @Override
    public void onLoad() {

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
