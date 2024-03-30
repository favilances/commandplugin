package me.favilances.commandplugin.Commands;

import org.bukkit.Bukkit;
import org.bukkit.World;
import org.bukkit.ChatColor;
import org.bukkit.GameMode;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class GameModeCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if(sender instanceof Player){
            Player player = (Player) sender;
            if(args.length==1 && args[0].equalsIgnoreCase("0")){
                player.setGameMode(GameMode.SURVIVAL);
                player.sendTitle(ChatColor.RED+"Survival","Your game mode has been changed.");
                player.sendMessage(ChatColor.RED+"Game Mode Changed to"+ChatColor.BOLD+" Survival");
            } else if (args.length==1 && args[0].equalsIgnoreCase("1")) {
                player.setGameMode(GameMode.CREATIVE);
                player.sendTitle(ChatColor.GREEN+"Creative","Your game mode has been changed.");
                player.sendMessage(ChatColor.GREEN+"Game Mode Changed to"+ChatColor.BOLD+" Creative");
            } else if (args.length==1 && args[0].equalsIgnoreCase("2")) {
                player.setGameMode(GameMode.ADVENTURE);
                player.sendTitle(ChatColor.AQUA+"Adventure","Your game mode has been changed.");
                player.sendMessage(ChatColor.AQUA+"Game Mode Changed to"+ChatColor.BOLD+" Adventure");
            }
            else if (args.length==1 && args[0].equalsIgnoreCase("3")) {
                player.setGameMode(GameMode.SPECTATOR);
                player.sendTitle(ChatColor.GOLD+"Spectator","Your game mode has been changed.");
                player.sendMessage(ChatColor.GOLD+"Game Mode Changed to "+ChatColor.BOLD+" Spectator");
            }
            else {
                player.sendMessage(ChatColor.RED+"Correct usage: /gm <0/1/2/3>");
            }

        }


        return false;
    }
}
