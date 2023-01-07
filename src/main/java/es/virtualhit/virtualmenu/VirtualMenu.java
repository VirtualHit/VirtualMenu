package es.virtualhit.virtualmenu;

import es.virtualhit.virtualmenu.inventory.InventoryBuilder;
import es.virtualhit.virtualmenu.menu.Menu;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;

import java.util.HashMap;

public class VirtualMenu {

    private static HashMap<Player, Menu> playerMenu = new HashMap<>();

    public static void openMenu(Player player, Menu menu) {
        Inventory inventory = InventoryBuilder.build(menu);
        playerMenu.put(player, menu);
        player.openInventory(inventory);
    }

    public static void removePlayer(Player player) {
        playerMenu.remove(player);
    }
}
