package com.gmail.lucario77777777.TE.commands.cheat;

import com.gmail.lucario77777777.TE.TE;
import com.gmail.lucario77777777.TE.commands.CommandExec;

import org.bukkit.ChatColor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;


public class Heal extends CommandExec {
	public Heal(TE plugin) {
		super(plugin);
	}
	
	@SuppressWarnings("deprecation")
	public static boolean Run(CommandSender sender, String[] args, String playerType)
	{
		if(args.length == 0){
			if(playerType == "player"){
			((Player) sender).setHealth(20);
			((Player) sender).setFireTicks(0);
			sender.sendMessage(ChatColor.GREEN + "Healed!");
			return true;
			}else{
				sender.sendMessage(ChatColor.RED + "You're the console, you can't heal yourself!");
				return true;
			}
		}else if(args.length == 1){
			if(sender.getServer().getPlayer(args[0]) != null);
				Player targetPlayer = sender.getServer().getPlayer(args [0]);
				targetPlayer.setHealth(20);
				targetPlayer.setFireTicks(0);
				sender.sendMessage(ChatColor.GREEN + "Healed " + targetPlayer.getDisplayName() + "!");
				if(playerType == "player"){
					targetPlayer.sendMessage(ChatColor.GREEN + "You have been healed by" + ((Player) sender).getDisplayName()+ "!");
					return true;
				}else{
					targetPlayer.sendMessage(ChatColor.GREEN + "You have been healed.");
					return true;
				}
			}else{
				sender.sendMessage(ChatColor.RED + "PLAYER NOT ONLINE!");
				return true;
			}
}
}