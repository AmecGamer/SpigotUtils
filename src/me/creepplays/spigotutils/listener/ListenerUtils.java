package me.creepplays.spigotutils.listener;

import org.bukkit.Bukkit;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

public class ListenerUtils {

	public static ListenerUtils plugin(JavaPlugin plugin) {
		return new ListenerUtils(plugin);
	}
	
	private JavaPlugin plugin;
	private ListenerUtils(JavaPlugin plugin) {
		this.plugin = plugin;
	}
	
	public void register(Listener listener) {
		Bukkit.getPluginManager().registerEvents(listener, plugin);
	}
	
}
