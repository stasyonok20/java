package patterns.factory;

public class BuildingFactory {

    public Building createBuilding(String type) {
        if (type == null || type.isEmpty()) {
            return null;
        }

        if ("castle".equalsIgnoreCase(type)) {
            return new Castle();
        } else if ("barracks".equalsIgnoreCase(type)) {
            return new Barracks();
        }

        return null;
    }
}