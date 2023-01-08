package es.virtualhit.virtualmenu.item;

import es.virtualhit.virtualmenu.item.action.ItemAction;
import org.bukkit.inventory.ItemStack;
import org.jetbrains.annotations.Nullable;

public class MenuItem {
    private String id;
    private ItemStack item;
    private ItemAction action;

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

    public void setId(String id) {
        this.id = id;
    }

    public void setItem(ItemStack item) {
        this.item = item;
    }

    public void setAction(ItemAction action) {
        this.action = action;
    }
}
