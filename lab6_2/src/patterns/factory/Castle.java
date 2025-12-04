package patterns.factory;

public class Castle implements Building {

    @Override
    public void build() {
        System.out.println("Building a majestic Castle with high towers and strong walls.");
    }
}