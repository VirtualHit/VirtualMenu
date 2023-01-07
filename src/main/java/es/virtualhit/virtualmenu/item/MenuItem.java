package es.virtualhit.virtualmenu.item;

import es.virtualhit.virtualmenu.item.action.Action;
import org.bukkit.inventory.ItemStack;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class MenuItem {
    private final String id;
    private final ItemStack item;
    private final int slot;
    private final Action action;

    public MenuItem(String id, ItemStack item, int slot, @Nullable Action action) {
        this.id = id;
        this.item = item;
        this.slot = slot;
        this.action = action;
    }

    public String getId() {
        return id;
    }

    public ItemStack getItem() {
        return item;
    }

    public int getSlot() {
        return slot;
    }

    public Action getAction() {
        return action;
    }
}
