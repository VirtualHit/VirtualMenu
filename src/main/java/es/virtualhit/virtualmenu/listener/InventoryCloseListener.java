package es.virtualhit.virtualmenu.listener;

import es.virtualhit.virtualmenu.VirtualMenu;
import es.virtualhit.virtualmenu.menu.Menu;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryCloseEvent;

public class InventoryCloseListener implements Listener {

    @EventHandler
    public void onClose(InventoryCloseEvent event) {
        if (!(event.getPlayer() instanceof Player player)) return;
        if (!VirtualMenu.containsPlayer(player)) return;

        Menu menu = VirtualMenu.getPlayerMenu(player);
        menu.onClose(event);

        VirtualMenu.removePlayer(player);
    }
}
