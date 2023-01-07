package es.virtualhit.virtualmenu.menu;

import es.virtualhit.virtualmenu.item.MenuItem;
import es.virtualhit.virtualmenu.menu.type.MenuType;
import net.kyori.adventure.text.Component;
import org.bukkit.Material;

import java.util.HashMap;

public class Menu {

    private final String id;
    private final Component title;
    private final MenuType type;
    private final int size;
    private final HashMap<Integer, MenuItem> items;
    private final Material background;

    public Menu(String id, Component title, MenuType type, int size, HashMap<Integer, MenuItem> items, Material background) {
        this.id = id;
        this.title = title;
        this.type = type;
        this.size = size;
        this.items = items;
        this.background = background;
    }

    public String getId() {
        return id;
    }

    public Component getTitle() {
        return title;
    }

    public MenuType getType() {
        return type;
    }

    public int getSize() {
        return size;
    }

    public HashMap<Integer, MenuItem> getItems() {
        return items;
    }

    public Material getBackground() {
        return background;
    }
}
