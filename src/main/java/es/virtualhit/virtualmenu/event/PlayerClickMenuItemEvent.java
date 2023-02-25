package es.virtualhit.virtualmenu.event;

import es.virtualhit.virtualmenu.menu.Menu;
import es.virtualhit.virtualmenu.menu.item.MenuItem;

/**
 * Event called provided to Clickable interface when a player clicks a menu item.
 * Not a Bukkit event.
 */
public class PlayerClickMenuItemEvent {

    private final Menu menu;
    private final MenuItem item;
    private boolean cancelled;

    public PlayerClickMenuItemEvent(Menu menu, MenuItem item) {
        this.menu = menu;
        this.item = item;
    }

    public Menu getMenu() {
        return menu;
    }

    public MenuItem getItem() {
        return item;
    }

    public boolean isCancelled() {
        return cancelled;
    }

    public void setCancelled(boolean cancelled) {
        this.cancelled = cancelled;
    }
}
