package model;

public class Package {
    private final String id;
    private final int weight;
    private final int distance;
    private final String offerCode;

    public Package(String id, int weight, int distance, String offerCode) {
        this.id = id;
        this.weight = weight;
        this.distance = distance;
        this.offerCode = offerCode;
    }

    public String getId() {
        return id;
    }

    public int getWeight() {
        return weight;
    }

    public int getDistance() {
        return distance;
    }

    public String getOfferCode() {
        return offerCode;
    }
}
