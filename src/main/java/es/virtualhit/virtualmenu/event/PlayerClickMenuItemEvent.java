package es.virtualhit.virtualmenu.event;

import es.virtualhit.virtualmenu.menu.Menu;
import es.virtualhit.virtualmenu.menu.item.MenuItem;
import org.bukkit.event.inventory.ClickType;

/**
 * Event called provided to Clickable interface when a player clicks a menu item.
 * Not a Bukkit event.
 */
public class PlayerClickMenuItemEvent {

    private final Menu menu;
    private final MenuItem item;
    private final ClickType clickType;
    private boolean cancelled;

    public PlayerClickMenuItemEvent(Menu menu, MenuItem item, ClickType clickType) {
        this.menu = menu;
        this.item = item;
        this.clickType = clickType;
    }

    public Menu getMenu() {
        return menu;
    }

    public MenuItem getItem() {
        return item;
    }

    public ClickType getClickType() {
        return clickType;
    }

    public boolean isCancelled() {
        return cancelled;
    }

    public void setCancelled(boolean cancelled) {
        this.cancelled = cancelled;
    }
}
