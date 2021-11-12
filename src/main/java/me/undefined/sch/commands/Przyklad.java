package me.undefined.sch.commands;

import me.undefined.sch.base.CommandBase;
import org.bukkit.command.CommandSender;

import java.util.Arrays;

public class Przyklad extends CommandBase {
    public Przyklad() {
        super("name");
        setAliases(Arrays.asList("alias1", "alias2"));
    }

    @Override
    public boolean execute(CommandSender sender, String commandLabel, String[] args) {
        sender.sendMessage("Działa!");
        return false;
    }
}
