package me.libraryaddict.gearwars.commands;

import me.libraryaddict.gearwars.GearApi;
import me.libraryaddict.gearwars.managers.GameManager;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class CommandTime implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        GameManager gm = GearApi.getGameManager();
        if (gm.getTime() < 0) {
            sender.sendMessage(ChatColor.GOLD + "The game will start in " + gm.getTime(gm.getTime()));
        } else {
            sender.sendMessage(ChatColor.GOLD + "The game has been going on for " + gm.getTime(gm.getTime()));
        }
        return true;
    }
}
