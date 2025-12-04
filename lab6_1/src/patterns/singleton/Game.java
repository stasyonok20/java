package patterns.singleton;

public class Game {

    public static void main(String[] args) {
        System.out.println("--- Starting Game Simulation ---");

        System.out.println("Requesting AudioManager from the main menu...");
        AudioManager menuAudio = AudioManager.getInstance();

        System.out.println("Requesting AudioManager from the settings screen...");
        AudioManager settingsAudio = AudioManager.getInstance();

        if (menuAudio == settingsAudio) {
            System.out.println("Success: Both variables point to the same AudioManager instance.");
        } else {
            System.out.println("Error: Singleton pattern failed!");
        }

        System.out.println("\n--- Gameplay ---");

        menuAudio.playSound("menu_background_music.mp3");
        settingsAudio.setVolume(50);
        menuAudio.playSound("player_jump.wav");

        System.out.println("\n--- Game Over ---");
        System.out.println("Please check the 'sound_log.txt' file in the project's root directory.");
    }
}