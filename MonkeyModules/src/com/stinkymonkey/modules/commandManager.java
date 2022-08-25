package com.stinkymonkey.modules;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class commandManager implements CommandExecutor{
	private main Main;
	public commandManager(main Main) {
		this.Main = Main;
	}
	
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		Player p;
		if (label.equalsIgnoreCase("whereami")) {
			Main.getWhereAmICmd().runCmd(sender);
		}
		return false;
	}

}
