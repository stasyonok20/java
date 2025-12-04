package patterns.observer;

public class Game {

    public static void main(String[] args) {
        QuestManager questManager = new QuestManager();
        Player player1 = new Player("Gandalf");
        Player player2 = new Player("Frodo");
        Player questJournalUI = new Player("Quest Journal UI");
        
        System.out.println(" Subscribing players to quest updates ");
        questManager.addObserver(player1);
        questManager.addObserver(player2);
        questManager.addObserver(questJournalUI);
        questManager.addQuest("Carry the Ring to Rivendell");
        questManager.completeQuest("Carry the Ring to Rivendell");
        System.out.println("\n Frodo unsubscribes from notifications ");
        questManager.removeObserver(player2);
        questManager.addQuest("Form the Fellowship of the Ring");
    }
}