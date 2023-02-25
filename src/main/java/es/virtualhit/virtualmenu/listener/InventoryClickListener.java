package es.virtualhit.virtualmenu.listener;

import es.virtualhit.virtualmenu.VirtualMenu;
import es.virtualhit.virtualmenu.event.PlayerClickMenuItemEvent;
import es.virtualhit.virtualmenu.menu.Menu;
import es.virtualhit.virtualmenu.menu.item.MenuItem;
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

        PlayerClickMenuItemEvent clickEvent = new PlayerClickMenuItemEvent(menu, item);
        item.getClickable().onClick(clickEvent);
        event.setCancelled(clickEvent.isCancelled());
    }
}
