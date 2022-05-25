package offer;

public class OfferCriteria {
    private final int minDistance;
    private final int maxDistance;
    private final int minWeight;
    private final int maxWeight;

    public OfferCriteria(int minDistance, int maxDistance, int minWeight, int maxWeight) {
        this.minDistance = minDistance;
        this.maxDistance = maxDistance;
        this.minWeight = minWeight;
        this.maxWeight = maxWeight;
    }

    public int getMinDistance() {
        return minDistance;
    }

    public int getMaxDistance() {
        return maxDistance;
    }

    public int getMinWeight() {
        return minWeight;
    }

    public int getMaxWeight() {
        return maxWeight;
    }
}
