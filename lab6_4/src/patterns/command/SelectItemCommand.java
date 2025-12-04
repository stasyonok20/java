package patterns.command;

public class SelectItemCommand implements Command {
    private MenuSystem menuSystem;
    private String itemToSelect;

    public SelectItemCommand(MenuSystem menuSystem, String item) {
        this.menuSystem = menuSystem;
        this.itemToSelect = item;
    }
    @Override
    public void execute() {
        menuSystem.selectItem(itemToSelect);
    }
}