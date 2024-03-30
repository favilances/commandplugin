package me.favilances.commandplugin.Commands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.World;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class TimeCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if(sender instanceof Player){
            Player player = (Player) sender;
            if(args.length==1 && args[0].equalsIgnoreCase("morning")){
                player.sendMessage(ChatColor.AQUA+"Time Set to Morning.");
                for (World world : Bukkit.getWorlds()) {
                    world.setTime(1000);
                }
            } else if (args.length==1 && args[0].equalsIgnoreCase("night")) {
                player.sendMessage(ChatColor.AQUA+"Time Set to Night.");
                for (World world : Bukkit.getWorlds()) {
                    world.setTime(13000);
                }
            }
            else {
                player.sendMessage(ChatColor.RED+"Correct usage: /time <morning/night>");
            }

        }
        return false;
    }
}
