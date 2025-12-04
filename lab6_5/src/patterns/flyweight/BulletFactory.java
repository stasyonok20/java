package patterns.flyweight;

import java.util.HashMap;
import java.util.Map;
public class BulletFactory {
    private static final Map<String, BulletType> bulletTypes = new HashMap<>();

    public static BulletType getBulletType(String color, String sprite) {
        String key = color + "_" + sprite;

        if (!bulletTypes.containsKey(key)) {
            System.out.println(" Factory: Creating a new flyweight for '" + key + "'. Expensive operation. ");
            bulletTypes.put(key, new BulletType(color, sprite));
        }
        return bulletTypes.get(key);
    }
}