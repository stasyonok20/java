package patterns.command;

public class OpenMenuCommand implements Command {
private MenuSystem menuSystem;
public OpenMenuCommand(MenuSystem menuSystem) {
this.menuSystem = menuSystem;
}
@Override
public void execute() {
menuSystem.openMenu();
}
}