package es.virtualhit.virtualmenu.item;

import es.virtualhit.virtualmenu.item.action.ItemAction;
import org.bukkit.inventory.ItemStack;
import org.jetbrains.annotations.Nullable;

public class MenuItem {
    private final String id;
    private final ItemStack item;
    private final ItemAction action;

    public MenuItem(String id, ItemStack item, @Nullable ItemAction action) {
        this.id = id;
        this.item = item;
        this.action = action;
    }

    public String getId() {
        return id;
    }

    public ItemStack getItem() {
        return item;
    }

    public ItemAction getAction() {
        return action;
    }
}
