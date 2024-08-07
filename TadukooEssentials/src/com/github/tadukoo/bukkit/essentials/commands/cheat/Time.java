package com.github.tadukoo.bukkit.essentials.commands.cheat;

import com.github.tadukoo.bukkit.essentials.TE;
import com.github.tadukoo.bukkit.essentials.commands.CommandExec;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.World;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;


public class Time extends CommandExec {
	public Time(TE plugin) {
		super(plugin);
	}
	
	public static boolean Run(CommandSender sender, String[] args, String playerType)
	{
		if(playerType == "player"){
			if(args.length == 0){
				sender.sendMessage(ChatColor.RED + "NOT ENOUGH ARGUMENTS!");
				return true;
			}
		if(args.length == 1){
			World world = ((Player) sender).getWorld();
			if(args[0].equalsIgnoreCase("day")){
				world.setTime(0);
				Bukkit.broadcastMessage("Time Set to Day!");
				return true;
			}else if(args[0].equalsIgnoreCase("night")){
				world.setTime(13000);
				Bukkit.broadcastMessage("Time Set to Night!");
				return true;
			}else{
				sender.sendMessage(ChatColor.RED + "Available Times: Day and Night");
				return true;
			}
			}else{
				sender.sendMessage(ChatColor.RED + "Too many arguments!");
				return true;
		}
		}else{
			sender.sendMessage(ChatColor.RED + "You must be a player!");
			return true;
		}
}
}