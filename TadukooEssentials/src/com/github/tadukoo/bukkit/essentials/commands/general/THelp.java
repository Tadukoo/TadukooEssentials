package com.github.tadukoo.bukkit.essentials.commands.general;

import com.github.tadukoo.bukkit.essentials.TE;
import com.github.tadukoo.bukkit.essentials.commands.CommandExec;

import org.bukkit.ChatColor;
import org.bukkit.command.CommandSender;


public class THelp extends CommandExec {
	public THelp(TE plugin) {
		super(plugin);
	}
	
	public static boolean Run(CommandSender sender, String[] args)
	{
		if(args.length == 0){
			sender.sendMessage("----" + ChatColor.GREEN + "Tadukoo Plugin Help" + ChatColor.WHITE + "----");
			sender.sendMessage(ChatColor.AQUA + "/ping" + ChatColor.WHITE + " | " + ChatColor.GREEN + "A testing command.");
			sender.sendMessage(ChatColor.AQUA + "/tport" + ChatColor.WHITE + " | " + ChatColor.GREEN + "Teleports players to other players.");
			sender.sendMessage(ChatColor.AQUA + "/heal" + ChatColor.WHITE + " | " + ChatColor.GREEN + "Heals a player.");
			sender.sendMessage(ChatColor.AQUA + "/kill" + ChatColor.WHITE + " | " + ChatColor.GREEN + "Kills a player.");
			sender.sendMessage(ChatColor.AQUA + "/feed" + ChatColor.WHITE + " | " + ChatColor.GREEN + "Feeds a player.");
			sender.sendMessage(ChatColor.AQUA + "/starve" + ChatColor.WHITE + " | " + ChatColor.GREEN + "Starves a player.");
			sender.sendMessage(ChatColor.AQUA + "/suicide" + ChatColor.WHITE + " | " + ChatColor.GREEN + "Commit suicide.");
			sender.sendMessage(ChatColor.AQUA + "/gamemode, /gm, or /gmt" + ChatColor.WHITE + " | " + ChatColor.GREEN + "Change a player's gamemode.");
			sender.sendMessage(ChatColor.AQUA + "/thelp" + ChatColor.WHITE + " | " + ChatColor.GREEN + "Shows this help.");
			return true;
		}else{
			sender.sendMessage(ChatColor.RED + "Sorry, we don't have search functionality yet.");
			return true;
		}
		}
}