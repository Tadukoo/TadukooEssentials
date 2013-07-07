package com.gmail.lucario77777777.tadukooplugin.commands;

import com.gmail.lucario77777777.tadukooplugin.commands.MainCommandExecutor;

import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import com.gmail.lucario77777777.tadukooplugin.Main;

public class Tport extends MainCommandExecutor {
	public Tport(Main plugin) {
		super(plugin);
	}
	
	public static boolean TportRun(CommandSender sender, String[] args, String playerType)
	{

		if(playerType == "player"){
			if(args.length == 0){
				sender.sendMessage(ChatColor.DARK_RED + "TOO LITTLE ARGUMENTS!");
				return true;
		}else if(args.length == 1){
			Player targetPlayer = sender.getServer().getPlayer(args[0]);
			if(targetPlayer != null){
				Location targetPlayerLocation = targetPlayer.getLocation();
				((Player) sender).teleport(targetPlayerLocation);
				sender.sendMessage("You have teleported yourself to " + targetPlayer.getDisplayName());
				return true;
			}else{
				sender.sendMessage(ChatColor.DARK_RED + "PLAYER NOT ONLINE!");
				return true;
			}
		}else if(args.length == 2){
			Player targetPlayer = sender.getServer().getPlayer(args[0]);
			Player targetPlayer1 = sender.getServer().getPlayer(args[1]);
			Location targetPlayer1Location = targetPlayer1.getLocation();
			if(targetPlayer1Location != null){
				targetPlayer.teleport(targetPlayer1Location);
				targetPlayer.sendMessage("You have been teleported to " + targetPlayer1.getDisplayName());
				return true;
			}else{
				targetPlayer.sendMessage(ChatColor.DARK_RED + "PLAYER IS OFFLINE!");
				return true;
			}
			}
		}else{
			sender.sendMessage(ChatColor.RED + "You must be a player!");
			return true;
		}
		return false;
}
}
