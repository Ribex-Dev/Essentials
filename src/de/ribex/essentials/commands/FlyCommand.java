package de.ribex.essentials.commands;

import de.ribex.essentials.Main;
import org.bukkit.ChatColor;
import org.bukkit.Sound;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class FlyCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String s, String[] args) {
        if (sender instanceof Player){
            Player player=(Player)sender;
                if (!player.getAllowFlight()){
                    player.setAllowFlight(true);
                    player.setFlying(true);
                    player.playSound(player.getLocation(), Sound.ORB_PICKUP, 0.2f,1.2f);
                    player.sendMessage(Main.getPrefix() + ChatColor.GREEN + "Du kannst nun fliegen");
                }else {
                    player.setAllowFlight(false);
                    player.setFlying(false);
                    player.playSound(player.getLocation(), Sound.ORB_PICKUP, 0.2f,1.2f);
                    player.sendMessage(Main.getPrefix() + ChatColor.RED + "Du kannst nicht mehr fliegen!");
                }
        }else {
            sender.sendMessage(Main.getPrefix() + ChatColor.RED + "Du musst ein Spieler sein!");
        }
        return false;
    }
}
