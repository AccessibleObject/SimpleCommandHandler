package me.undefined.sch.base;

import org.bukkit.command.defaults.BukkitCommand;

public abstract class CommandBase extends BukkitCommand
{
    protected CommandBase(final String nazwaPolecenia) {
        super(nazwaPolecenia);
    }
}
