package patterns.factory;

public class Barracks implements Building {

    @Override
    public void build() {
        System.out.println("Constructing Barracks for training valiant warriors.");
    }
}