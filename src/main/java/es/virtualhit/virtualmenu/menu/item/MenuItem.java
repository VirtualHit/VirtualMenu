package es.virtualhit.virtualmenu.menu.item;

import org.bukkit.inventory.ItemStack;

public class MenuItem {

    private ItemStack itemStack;
    private int slot;
    private Clickable clickable;

    public MenuItem(ItemStack itemStack, int slot) {
        this.itemStack = itemStack;
        this.slot = slot;
    }

    public ItemStack getItemStack() {
        return itemStack;
    }

    public void setItemStack(ItemStack itemStack) {
        this.itemStack = itemStack;
    }

    public int getSlot() {
        return slot;
    }

    public void setSlot(int slot) {
        this.slot = slot;
    }

    public Clickable getClickable() {
        return clickable;
    }

    public void setClickable(Clickable clickable) {
        this.clickable = clickable;
    }
}
