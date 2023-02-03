package es.virtualhit.virtualmenu.item;

import es.virtualhit.virtualmenu.item.action.ItemAction;
import org.bukkit.inventory.ItemStack;
import org.jetbrains.annotations.NotNull;

import java.util.List;

public class MenuItem {
    private String id;
    private ItemStack item;
    private List<ItemAction> action;

    public MenuItem(String id, ItemStack item, @NotNull List<ItemAction> action) {
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

    public List<ItemAction> getAction() {
        return action;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setItem(ItemStack item) {
        this.item = item;
    }

    public void setAction(List<ItemAction> action) {
        this.action = action;
    }
}
