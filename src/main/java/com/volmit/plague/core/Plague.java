package com.volmit.plague.core;

import org.bukkit.command.PluginCommand;
import org.bukkit.event.HandlerList;
import org.bukkit.event.Listener;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;

import com.volmit.plague.api.PlagueSender;
import com.volmit.plague.api.command.KickCommand;
import com.volmit.plague.api.command.PlagueCommand;



public class Plague extends JavaPlugin implements Listener
{
	public void onEnable()
	{
		PluginCommand cmd = getCommand("plague");
		if (cmd == null){
			System.out.println("Yeet plague out the window!");
			return;
		}
		getServer().getPluginManager().registerEvents(this, this);
		cmd.setExecutor((s, arg1, arg2, arg3) -> {
			PlagueSender sender = new PlagueSender(s);
			KickCommand kc = new KickCommand();
			kc.handle(sender, PlagueCommand.enhanceArgs(arg3));
			return true;
		});
	}

	public void onDisable()
	{
		HandlerList.unregisterAll((Plugin) this);
	}
}
