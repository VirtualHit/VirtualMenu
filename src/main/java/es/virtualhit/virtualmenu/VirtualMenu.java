package es.virtualhit.virtualmenu;

import es.virtualhit.virtualmenu.listener.InventoryClickListener;
import es.virtualhit.virtualmenu.listener.InventoryCloseListener;
import es.virtualhit.virtualmenu.menu.Menu;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.plugin.Plugin;

import java.util.HashMap;

public class VirtualMenu {

    private static HashMap<Player, Menu> playerMenu = new HashMap<>();

    public static void addPlayer(Player player, Menu menu) {
        playerMenu.put(player, menu);
    }

    public static boolean containsPlayer(Player player) {
        return playerMenu.containsKey(player);
    }

    public static void removePlayer(Player player) {
        playerMenu.remove(player);
    }

    public static Menu getPlayerMenu(Player player) {
        return playerMenu.get(player);
    }

    public static void registerListeners(Plugin plugin) {
        Bukkit.getPluginManager().registerEvents(new InventoryClickListener(), plugin);
        Bukkit.getPluginManager().registerEvents(new InventoryCloseListener(), plugin);
    }
}