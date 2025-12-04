package patterns.factory;

public class Game {

    public static void main(String[] args) {
        BuildingFactory factory = new BuildingFactory();

        System.out.println("--- Player wants to build a Castle ---");
        Building castle = factory.createBuilding("castle");

        if (castle != null) {
            castle.build();
        }

        System.out.println("\n--- Player wants to build Barracks ---");
        Building barracks = factory.createBuilding("barracks");
        if (barracks != null) {
            barracks.build();
        }

        System.out.println("\n--- Player tries to build something unknown ---");
        Building unknown = factory.createBuilding("tower");
        if (unknown == null) {
            System.out.println("The factory doesn't know how to build a 'tower'.");
        }
    }
}