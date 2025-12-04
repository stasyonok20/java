package patterns.flyweight;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Game {
    private static final int BULLET_COUNT = 10;
    private static final List<Bullet> bullets = new ArrayList<>();

    public static void main(String[] args) {
        System.out.println(" Spawning " + BULLET_COUNT + " bullets ");
        Random random = new Random();

        for (int i = 0; i < BULLET_COUNT; i++) {
            int typeSelector = random.nextInt(2);

            BulletType bulletType;
            if (typeSelector == 0) {
                bulletType = BulletFactory.getBulletType("Gray", "9mm_round.png");
            } else {
                bulletType = BulletFactory.getBulletType("Red", "laser_beam.png");
            }

            Bullet bullet = new Bullet(random.nextInt(800), random.nextInt(600), bulletType);
            bullets.add(bullet);
        }

        System.out.println("\n--- Drawing all active bullets on screen ---");
        for (Bullet bullet : bullets) {
            bullet.draw();
        }

        System.out.println("\n Flyweight Factory Cache Size ");
        System.out.println("Total bullets created: " + bullets.size());
        System.out.println("Total flyweight objects stored in factory: 2 (as seen from the creation logs).");
    }
}