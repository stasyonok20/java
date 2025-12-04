package patterns.command;

public class Game {
    public static void main(String[] args) {
        MenuSystem menu = new MenuSystem();

        Command openCommand = new OpenMenuCommand(menu);
        Command closeCommand = new CloseMenuCommand(menu);
        Command selectPlayCommand = new SelectItemCommand(menu, "Start New Game");
        Command selectExitCommand = new SelectItemCommand(menu, "Exit to Desktop");

        MenuController controller = new MenuController();

        System.out.println(" Simulating user actions ");

        System.out.println("\nUser opens the menu ");
        controller.setCommand(openCommand);
        controller.pressButton();

        System.out.println("\nUser selects an item  ");
        controller.setCommand(selectPlayCommand);
        controller.pressButton();

        System.out.println("\nUser selects another item  ");
        controller.setCommand(selectExitCommand);
        controller.pressButton();

        System.out.println("\nUser closes the menu  ");
        controller.setCommand(closeCommand);
        controller.pressButton();
    }
}