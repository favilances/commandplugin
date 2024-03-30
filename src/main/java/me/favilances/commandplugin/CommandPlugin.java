package me.favilances.commandplugin;

import me.favilances.commandplugin.Commands.GameModeCommand;
import me.favilances.commandplugin.Commands.TimeCommand;
import org.bukkit.plugin.java.JavaPlugin;

public final class CommandPlugin extends JavaPlugin {

    @Override
    public void onEnable() {
        getCommand("gm").setExecutor(new GameModeCommand());
        getCommand("time").setExecutor(new TimeCommand());
        System.out.println("Favilances Command Plugin is starting...");
    }
}
