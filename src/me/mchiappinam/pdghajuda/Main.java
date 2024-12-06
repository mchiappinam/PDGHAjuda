package me.mchiappinam.pdghajuda;

import me.mchiappinam.pdghajuda.Comando;

import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {
	
	public void onEnable() {
		getServer().getPluginCommand("comandos").setExecutor(new Comando(this));
		getServer().getPluginCommand("ajuda").setExecutor(new Comando(this));
		getServer().getConsoleSender().sendMessage("§3[PDGHAjuda] §2ativado - Plugin by: mchiappinam");
		getServer().getConsoleSender().sendMessage("§3[PDGHAjuda] §2Acesse: http://pdgh.com.br/");
	}

	public void onDisable() {
		getServer().getConsoleSender().sendMessage("§3[PDGHAjuda] §2desativado - Plugin by: mchiappinam");
		getServer().getConsoleSender().sendMessage("§3[PDGHAjuda] §2Acesse: http://pdgh.com.br/");
	}
}