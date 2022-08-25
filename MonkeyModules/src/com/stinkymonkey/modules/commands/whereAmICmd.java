package com.stinkymonkey.modules.commands;

import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import com.stinkymonkey.modules.main;

import net.md_5.bungee.api.ChatColor;

public class whereAmICmd {
	private main Main;
	public whereAmICmd(main Main) {
		this.Main = Main;
	}
	
	public void runCmd(CommandSender sender) {
		if (sender instanceof Player) {
			Player p = (Player) sender;
			if (p.hasPermission("MonkeyModules.whereami")) {
				for (String s : Main.getConfigManager().getStringList("whereAmI")) {
					String str = s.replaceAll("%world%", p.getWorld().getName()).replaceAll("%xpos%", Integer.toString(p.getLocation().getBlockX())).replaceAll("%ypos%", Integer.toString(p.getLocation().getBlockY())).replaceAll("%zpos%", Integer.toString(p.getLocation().getBlockZ()))
					.replaceAll("%yaw%", Float.toString(p.getLocation().getYaw())).replaceAll("%pitch%", Float.toString(p.getLocation().getPitch()));
					p.sendMessage(ChatColor.translateAlternateColorCodes('&', str));
				}
			} else {
				Main.getConfigManager().getString("basic.noPermission");
			}
		} else {
			Main.getConfigManager().sendConsole("Bruh Are You Good **whereAmI");
		}
	}
}
