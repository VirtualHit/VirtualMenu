package es.virtualhit.virtualmenu.menu;

import es.virtualhit.virtualmenu.item.MenuItem;
import es.virtualhit.virtualmenu.menu.type.MenuType;
import net.kyori.adventure.text.Component;
import org.bukkit.Material;

import java.util.HashMap;

public class Menu {

    private String id;
    private Component title;
    private MenuType type;
    private int size;
    private HashMap<Integer, MenuItem> items;
    private Material background;

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

    public void setId(String id) {
        this.id = id;
    }

    public void setTitle(Component title) {
        this.title = title;
    }

    public void setType(MenuType type) {
        this.type = type;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void setItems(HashMap<Integer, MenuItem> items) {
        this.items = items;
    }

    public void setBackground(Material background) {
        this.background = background;
    }
}
