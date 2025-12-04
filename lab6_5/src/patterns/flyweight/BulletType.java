package patterns.flyweight;

public class BulletType {
    private final String color;
    private final String sprite;

    public BulletType(String color, String sprite) {
        this.color = color;
        this.sprite = sprite;
    }
    public void draw(int x, int y) {
        System.out.println(
            "Drawing a '" + color + "' bullet with sprite '" + sprite + "' at position (" + x + ", " + y + ")."
        );
    }
}