package es.virtualhit.virtualmenu.menu;

import es.virtualhit.virtualmenu.VirtualMenu;
import es.virtualhit.virtualmenu.menu.item.MenuItem;
import es.virtualhit.virtualmenu.menu.type.MenuType;
import net.kyori.adventure.text.Component;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.inventory.InventoryType;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

import java.util.HashMap;

public abstract class Menu {

    private final Player player;
    private Inventory inventory;
    private HashMap<Integer, MenuItem> items;
    private ItemStack background;

    public Menu(Player player) {
        this.player = player;
        this.items = new HashMap<>();
    }

    public void createInventory(MenuType type, int size, Component title) {
        switch (type) {
            case CHEST -> inventory = Bukkit.createInventory(null, size, title);
            case HOPPER -> inventory = Bukkit.createInventory(null, InventoryType.HOPPER, title);
        }
    }

    public void addItem(MenuItem item) {
        items.put(item.getSlot(), item);
    }

    public void removeItem(int slot) {
        items.remove(slot);
    }

    public void updateItems() {
        for (MenuItem item : items.values()) {
            inventory.setItem(item.getSlot(), item.getItemStack());
        }
    }

    public void setBackground(ItemStack background) {
        this.background = background;
    }

    public void updateBackground() {
        for (int i = 0; i < inventory.getSize(); i++) {
            if (inventory.getItem(i) == null || inventory.getItem(i).getType().equals(Material.AIR)) {
                inventory.setItem(i, background);
            }
        }
    }

    public void clearItems() {
        items.clear();
    }

    public Player getPlayer() {
        return player;
    }

    public Inventory getInventory() {
        return inventory;
    }

    public HashMap<Integer, MenuItem> getItems() {
        return items;
    }

    public ItemStack getBackground() {
        return background;
    }

    public void open() {
        player.openInventory(inventory);
        VirtualMenu.addPlayer(player, this);
    }
}
