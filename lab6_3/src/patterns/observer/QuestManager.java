package patterns.observer;

import java.util.ArrayList;
import java.util.List;

public class QuestManager {
    private List<Observer> observers = new ArrayList<>();
    private List<String> activeQuests = new ArrayList<>();

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public void notifyObservers(String message) {
        for (Observer observer : observers) {
            observer.update(message);
        }
    }

    public void addQuest(String questName) {
        System.out.println("\n[QuestManager] Adding new quest: " + questName);
        this.activeQuests.add(questName);
        String notificationMessage = "New quest available: '" + questName + "'";
        notifyObservers(notificationMessage);
    }

    public void completeQuest(String questName) {
        System.out.println("\n[QuestManager] Completing quest: " + questName);
        this.activeQuests.remove(questName);
        String notificationMessage = "Quest completed: '" + questName + "'";
        notifyObservers(notificationMessage);
    }
}