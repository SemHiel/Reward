package me.sequos.reward;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.java.JavaPlugin;

public final class Reward extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        System.out.println("Reward Plugin has been loaded");
        Bukkit.getPluginManager().registerEvents(this, this);
    }
    ItemStack goldenapple = new ItemStack(Material.GOLDEN_APPLE);

    @EventHandler
    public void onPlayerDeath(PlayerDeathEvent e) {
        if (e.getEntity() instanceof Player) {
            Player killer = e.getEntity().getKiller();
            killer.getInventory().addItem(goldenapple);
        }
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
