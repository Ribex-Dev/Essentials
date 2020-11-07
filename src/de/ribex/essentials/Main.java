package de.ribex.essentials;

import de.ribex.essentials.commands.AdminItemsCommand;
import de.ribex.essentials.commands.FlyCommand;
import de.ribex.essentials.commands.HealCommand;
import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        getLogger().info("Plugin enabled");
        //Initialisieren der Commands
        getCommand("heal").setExecutor(new HealCommand());
        getCommand("adminitems").setExecutor(new AdminItemsCommand());
        getCommand("fly").setExecutor(new FlyCommand());


    }

    @Override
    public void onDisable() {
        getLogger().info("Plugin disabled");
    }

    public static String getPrefix(){
        return ChatColor.GRAY + "[" + ChatColor.GOLD + "Essentials" + ChatColor.GRAY + "] > ";
    }
}
