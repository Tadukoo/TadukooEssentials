package com.github.tadukoo.bukkit.essentials.commands.moderator;

import com.github.tadukoo.bukkit.essentials.TE;
import com.github.tadukoo.bukkit.essentials.commands.CommandExec;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.World;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;


public class Sun extends CommandExec {
	public Sun(TE plugin) {
		super(plugin);
	}
	
	public static boolean Run(CommandSender sender, String[] args, String playerType, TE plugin)
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