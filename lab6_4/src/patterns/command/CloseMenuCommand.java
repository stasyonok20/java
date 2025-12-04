package patterns.command;

public class CloseMenuCommand implements Command {
    private MenuSystem menuSystem;

    public CloseMenuCommand(MenuSystem menuSystem) {
        this.menuSystem = menuSystem;
    }
    @Override
    public void execute() {
        menuSystem.closeMenu();
    }
}