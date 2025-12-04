package patterns.singleton;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class AudioManager {

    private static volatile AudioManager instance;
    private int soundVolume;
    private static final String LOG_FILE = "sound_log.txt";

    private AudioManager() {
        this.soundVolume = 80;
    }

    public static synchronized AudioManager getInstance() {
        if (instance == null) {
            instance = new AudioManager();
        }
        return instance;
    }

    public void setVolume(int volume) {
        if (volume >= 0 && volume <= 100) {
            this.soundVolume = volume;
        } else {
            System.err.println("Error: Volume must be between 0 and 100.");
        }
    }

    public int getVolume() {
        return this.soundVolume;
    }

    public void playSound(String soundName) {
        System.out.println("Playing: '" + soundName + "' | Volume: " + this.soundVolume + "%");
        logAction("Sound played: " + soundName);
    }

    private void logAction(String message) {
        try (PrintWriter writer = new PrintWriter(new BufferedWriter(new FileWriter(LOG_FILE, true)))) {
            String timestamp = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
            writer.println("[" + timestamp + "] " + message);
        } catch (IOException e) {
            System.err.println("Failed to write to log file: " + e.getMessage());
        }
    }
}