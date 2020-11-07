package de.ribex.essentials.commands;

import de.ribex.essentials.Main;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;

public class AdminItemsCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String s, String[] args) {
       if (sender instanceof Player){
           Player player = (Player) sender;
           player.sendMessage(Main.getPrefix() + ChatColor.GREEN + "Du hast des Menü der " + ChatColor.RED + "Admin Items " + ChatColor.GREEN + "geöffnet.");
           Inventory inventory = Bukkit.createInventory(null , 9*1 , "§cAdminItems");

           ItemStack stack_wood_sword = new ItemStack(Material.WOOD_SWORD);
           ArrayList<String> lore_wood_sword = new ArrayList<>();
                lore_wood_sword.add("   ");
                lore_wood_sword.add(ChatColor.WHITE + ">> Dieses Schwert tötet jeden und alles");
                lore_wood_sword.add("    ");
           ItemMeta meta_wood_sword = stack_wood_sword.getItemMeta();
                meta_wood_sword.setLore(lore_wood_sword);
                meta_wood_sword.setDisplayName(ChatColor.RED + "OP Schwert");
                meta_wood_sword.spigot().setUnbreakable(true);
                meta_wood_sword.addEnchant(Enchantment.DAMAGE_ALL , 10000 , true);
                meta_wood_sword.addEnchant(Enchantment.FIRE_ASPECT , 10000, true);
                meta_wood_sword.addEnchant(Enchantment.LOOT_BONUS_MOBS , 10000 , true);
           stack_wood_sword.setItemMeta(meta_wood_sword);
           inventory.setItem(0 , stack_wood_sword);

           ItemStack stack_wood_spade = new ItemStack(Material.WOOD_SPADE);
       }else {
           sender.sendMessage(Main.getPrefix() + ChatColor.RED + "Du musst ein Spieler sein!");
       }
        return false;
    }
}
