package es.virtualhit.virtualmenu.listener;

import es.virtualhit.virtualmenu.VirtualMenu;
import es.virtualhit.virtualmenu.event.PlayerClickMenuItemEvent;
import es.virtualhit.virtualmenu.item.MenuItem;
import es.virtualhit.virtualmenu.menu.Menu;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;

public class InventoryClickListener implements Listener {

    @EventHandler
    public void onClick(InventoryClickEvent event) {
        if (!(event.getWhoClicked() instanceof Player player)) return;

        if (!VirtualMenu.getPlayerMenu().containsKey(player)) return;

        Menu menu = VirtualMenu.getPlayerMenu().get(player);
        MenuItem item = menu.getItems().get(event.getSlot());

        PlayerClickMenuItemEvent clickEvent = new PlayerClickMenuItemEvent(player, menu, item, event);
        Bukkit.getPluginManager().callEvent(clickEvent);

        event.setCancelled(clickEvent.isCancelled());
    }
}
