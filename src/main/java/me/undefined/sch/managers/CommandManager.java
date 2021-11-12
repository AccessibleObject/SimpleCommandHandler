package me.undefined.sch.managers;


import me.undefined.sch.base.CommandBase;
import me.undefined.sch.handlers.CommandHandler;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.ArrayList;

public class CommandManager {
    private static CommandHandler handler;
    public static ArrayList<CommandBase> komendy;
    public static JavaPlugin plugin;

    public CommandManager(JavaPlugin plugin) {
        CommandManager.handler = new CommandHandler();
        CommandManager.plugin = plugin;
    }

    public void addCommand(CommandBase polecenie) {
        CommandManager.komendy.add(polecenie);
        CommandManager.handler.add(polecenie);
    }

    static {
        CommandManager.komendy = new ArrayList<CommandBase>();
    }
}
