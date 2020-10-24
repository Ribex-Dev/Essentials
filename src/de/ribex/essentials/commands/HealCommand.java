package de.ribex.essentials.commands;

import de.ribex.essentials.Main;
import org.bukkit.ChatColor;
import org.bukkit.Sound;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import static org.bukkit.Effect.Type.SOUND;

public class HealCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player){
            Player player = (Player)sender;

            player.setHealth(20);
            player.setFoodLevel(20);
            player.playSound(player.getLocation(), Sound.ORB_PICKUP, 0.2f,1.2f);
            player.sendMessage(Main.getPrefix() + ChatColor.GREEN + "Du wurdest geheilt");

        }else {
            sender.sendMessage(Main.getPrefix() + ChatColor.RED + "Du musst ein Spieler sein!");
        }
        return false;
    }
}
