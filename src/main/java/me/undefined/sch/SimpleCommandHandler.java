package me.undefined.sch;

import me.undefined.sch.commands.Przyklad;
import me.undefined.sch.managers.CommandManager;
import org.bukkit.plugin.java.JavaPlugin;

public class SimpleCommandHandler extends JavaPlugin {
    private static SimpleCommandHandler plugin;
    private static CommandManager manager;

    @Override
    public void onEnable() {
        plugin.manager = new CommandManager(this);
        manager.addCommand(new Przyklad());
    }

    @Override
    public void onDisable() {

    }
}
