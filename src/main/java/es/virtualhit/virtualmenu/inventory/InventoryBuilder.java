package es.virtualhit.virtualmenu.inventory;

import es.virtualhit.virtualmenu.item.MenuItem;
import es.virtualhit.virtualmenu.menu.Menu;
import org.bukkit.Bukkit;
import org.bukkit.event.inventory.InventoryType;
import org.bukkit.inventory.Inventory;

public class InventoryBuilder {

    public static Inventory build(Menu menu) {
        Inventory inventory = null;

        switch (menu.getType()) {
            case CHEST -> {
                inventory = Bukkit.createInventory(null, menu.getSize(), menu.getTitle());
            }

            case HOPPER -> {
                inventory = Bukkit.createInventory(null, InventoryType.HOPPER, menu.getTitle());
            }
        }

        for (int i = 0; i < menu.getSize(); i++) {
            MenuItem menuItem = menu.getItems().get(i);

            if (menuItem != null) {
                inventory.setItem(i, menuItem.getItem());
            } else {
                inventory.setItem(i, menu.getBackground());
            }
        }

        return inventory;
    }
}
