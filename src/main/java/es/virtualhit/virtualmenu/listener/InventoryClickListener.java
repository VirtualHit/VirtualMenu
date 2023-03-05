package es.virtualhit.virtualmenu.listener;

import es.virtualhit.virtualmenu.VirtualMenu;
import es.virtualhit.virtualmenu.event.PlayerClickMenuItemEvent;
import es.virtualhit.virtualmenu.menu.Menu;
import es.virtualhit.virtualmenu.menu.item.MenuItem;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;

public class InventoryClickListener implements Listener {

    @EventHandler
    public void onClick(InventoryClickEvent event) {
        if (!(event.getWhoClicked() instanceof Player player)) return;
        if (!VirtualMenu.containsPlayer(player)) return;

        Menu menu = VirtualMenu.getPlayerMenu(player);
        MenuItem item = menu.getItems().get(event.getSlot());

        if (item == null) {
            event.setCancelled(true);
            return;
        }

        try {
            PlayerClickMenuItemEvent clickEvent = new PlayerClickMenuItemEvent(menu, item);
            item.getClickable().onClick(clickEvent);
            event.setCancelled(clickEvent.isCancelled());
        } catch (Exception e) {
            event.setCancelled(true);
            Bukkit.getLogger().warning("Un plugin que usa VirtualMenu ha causado un error al ejecutar el evento de click.");
        }
    }
}
