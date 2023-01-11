package es.virtualhit.virtualmenu.event;

import es.virtualhit.virtualmenu.item.MenuItem;
import es.virtualhit.virtualmenu.menu.Menu;
import org.bukkit.entity.Player;
import org.bukkit.event.Cancellable;
import org.bukkit.event.HandlerList;
import org.bukkit.event.player.PlayerEvent;
import org.jetbrains.annotations.NotNull;

/**
 * Event called when a player clicks on a MenuItem item.
 */
public class PlayerClickMenuItemEvent extends PlayerEvent implements Cancellable {

    private static final HandlerList HANDLERS = new HandlerList();

    private final Menu menu;
    private final MenuItem item;
    private boolean cancelled;

    public PlayerClickMenuItemEvent(Player player, Menu menu, MenuItem item) {
        super(player);
        this.menu = menu;
        this.item = item;
    }

    @Override
    public @NotNull HandlerList getHandlers() {
        return HANDLERS;
    }

    public static HandlerList getHandlerList() {
        return HANDLERS;
    }

    public Menu getMenu() {
        return menu;
    }

    public MenuItem getItem() {
        return item;
    }

    @Override
    public boolean isCancelled() {
        return cancelled;
    }

    @Override
    public void setCancelled(boolean cancelled) {
        this.cancelled = cancelled;
    }
}
