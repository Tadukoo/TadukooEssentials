package com.gmail.lucario77777777.tadukooplugin.commands.moderator;

import com.gmail.lucario77777777.tadukooplugin.commands.MainCommandExecutor;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.World;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import com.gmail.lucario77777777.tadukooplugin.Main;

public class Sun extends MainCommandExecutor {
	public Sun(Main plugin) {
		super(plugin);
	}
	
	public static boolean Run(CommandSender sender, String[] args, String playerType, Main plugin)
	{
		if(args.length == 0){
			if(playerType == "player"){
				World world = ((Player) sender).getWorld();
				world.setStorm(false);
				world.setThundering(false);
				Bukkit.broadcastMessage("Weather set to sun in " + world.getName() + "!");
				return true;
			}else{
				sender.sendMessage(ChatColor.RED + "You must be a player!");
				return true;
			}
		}else if(args.length == 1){
			World world = plugin.getServer().getWorld(args[0]);
			world.setStorm(false);
			world.setThundering(false);
			Bukkit.broadcastMessage("Weather set to sun in " + world.getName() + "!");
			return true;
		}else{
			sender.sendMessage(ChatColor.RED + "TOO MANY ARGUMENTS!");
			return false;
		}
	}
}