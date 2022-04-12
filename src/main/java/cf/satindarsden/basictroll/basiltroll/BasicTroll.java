package cf.satindarsden.basictroll.basiltroll;

import org.bukkit.plugin.java.JavaPlugin;

public final class BasicTroll extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        //Check if the plugin is starting or started
        //If it has started, print a message
        //if it is starting, print another message
        getServer().getPluginManager().registerEvents(new DiaBreak(), this);
        getServer().getPluginManager().registerEvents(new pack(),this);
        getLogger().info("BasicTroll has started");

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        //Check if the plugin is starting or started
        //If it has started, print a message
        //if it is starting, print another message

        getLogger().warning("BasicTroll has stopped");
    }
}
