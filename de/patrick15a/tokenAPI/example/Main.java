package de.patrick15a.tokenAPI.example;

import org.bukkit.plugin.java.JavaPlugin;

import de.patrick15a.tokenAPI.TokenAPI;

public class Main extends JavaPlugin {
	
	private static TokenAPI tokenAPI;
	private static Main instance;
	
	@Override
	public void onEnable() {
		
		instance = this;
		tokenAPI = new TokenAPI();
		
	}
	
	public static Main getInstance() {
		return instance;
	}
	
	public static TokenAPI getTokenAPI() {
		return tokenAPI;
	}
	
}
