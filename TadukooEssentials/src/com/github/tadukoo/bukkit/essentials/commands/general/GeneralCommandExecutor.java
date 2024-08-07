package com.github.tadukoo.bukkit.essentials.commands.general;

import java.util.logging.Level;

import com.github.tadukoo.bukkit.essentials.TE;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;

import com.github.tadukoo.bukkit.essentials.commands.CommandExec;

public class GeneralCommandExecutor{

	public GeneralCommandExecutor(TE plugin) {
		super();
	}
	public static boolean Run(CommandSender sender, Command cmd, String[] args, String playerType, TE plugin){
		if(plugin.getCommandsConfig().getString("general") == "true"){
			if(cmd.getName().equalsIgnoreCase("motd")){
				if(plugin.getCommandsConfig().getString("motd") == "true"){
					MOTD.Run(sender, plugin);
					return true;
				}else if(plugin.getCommandsConfig().getString("motd") == "false"){
					CommandExec.Disabled("motd", sender);
					return true;
				}else{
					CommandExec.Error("motd", sender, plugin);
					return true;
				}
			}else if(cmd.getName().equalsIgnoreCase("suicide")){
				if(plugin.getCommandsConfig().getString("suicide") == "true"){
					Suicide.Run(sender, args, playerType);
					return true;
				}else if(plugin.getCommandsConfig().getString("suicide") == "false"){
					CommandExec.Disabled("suicide", sender);
					return true;
				}else{
					CommandExec.Error("suicide", sender, plugin);
					return true;
				}
			}else if(cmd.getName().equalsIgnoreCase("thelp")){
				if(plugin.getCommandsConfig().getString("thelp") == "true"){
					THelp.Run(sender, args);
					return true;
				}else if(plugin.getCommandsConfig().getString("thelp") == "false"){
					CommandExec.Disabled("thelp", sender);
					return true;
				}else{
					CommandExec.Error("thelp", sender, plugin);
					return true;
				}
			}
			return true;
		}else if(plugin.getCommandsConfig().getString("general") == "false"){
			Disabled("general", sender);
			return true;
		}else{
			Error("general", sender, plugin);
			return true;
		}
	}
	public static void Disabled(String cmd, CommandSender sender){
		sender.sendMessage(ChatColor.RED + "An admin has set " + cmd + " commands to false in the commands.yml " +
				"file.");
	}
		
	public static void Error(String cmd, CommandSender sender, TE plugin){
		sender.sendMessage(ChatColor.RED + "Please inform an admin that they don't have " + cmd + " set " +
				"correctly in the commands.yml file.");
		plugin.logger.log(Level.WARNING, "You don't have " + cmd + " set correctly in the commands.yml file.");
	}
}
