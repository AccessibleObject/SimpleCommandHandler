package me.undefined.sch.handlers;

import me.undefined.sch.base.CommandBase;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandMap;

import java.lang.reflect.Field;

public class CommandHandler {
    public void add(CommandBase komenda) {
        try {
            Field bukkitCommandMap = Bukkit.getServer().getClass().getDeclaredField("commandMap");
            bukkitCommandMap.setAccessible(true);
            final CommandMap commandMap = (CommandMap) bukkitCommandMap.get(Bukkit.getServer());
            commandMap.register(komenda.getName(), (Command) komenda);
        }
        catch (IllegalAccessException | NoSuchFieldException ex2) {
            final ReflectiveOperationException ex = null;
            final ReflectiveOperationException e = ex;
            e.printStackTrace();
        }
    }
}
