package com.stinkymonkey.modules;

import org.bukkit.plugin.java.JavaPlugin;

import com.stinkymonkey.modules.commands.whereAmICmd;

public class main extends JavaPlugin{
	//Registery
	private static configManager cM;
	
	// Commands
	private static whereAmICmd wAICmd;
	@Override
	public void onEnable() {
		//Register
		commandManager coM = new commandManager(this);
		cM = new configManager(this);
		
		//Register Commands To Executor
		getCommand("whereami").setExecutor(coM);
		
		// COMMANDS
		wAICmd = new whereAmICmd(this);
	}
	
	@Override
	public void onDisable() {
		
	}
	
	// Getters
	public configManager getConfigManager() {
		return cM;
	}
	
	// Command Getters
	public whereAmICmd getWhereAmICmd() {
		return wAICmd;
	}
}
