package es.virtualhit.virtualmenu.menu;

import org.bukkit.entity.Player;

public abstract class PaginatedMenu extends Menu {

    private int currentPage;

    public PaginatedMenu(Player player) {
        super(player);
    }

    public int getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(int currentPage) {
        this.currentPage = currentPage;
    }
}
