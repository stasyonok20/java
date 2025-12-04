package patterns.command;

public class MenuSystem {
    public void openMenu() {
        System.out.println("[MenuSystem] Menu is now OPEN.");
    }

    public void closeMenu() {
        System.out.println("[MenuSystem] Menu is now CLOSED.");
    }

    public void selectItem(String item) {
        System.out.println("[MenuSystem] Selected item: '" + item + "'");
    }
}