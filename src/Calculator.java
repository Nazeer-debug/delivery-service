import model.Package;
import service.OfferService;

import java.util.List;

public class Calculator {
    private static final int COST_FOR_DISTANCE = 5;
    private static final int COST_FOR_WEIGHT = 10;
    private final OfferService offerService;

    public Calculator(OfferService offerService) {
        this.offerService = offerService;
    }

    public void result(int baseDeliveryCost, List<Package> packages) {
        for (Package p : packages) {
            int totalCost = getCost(baseDeliveryCost, p.getDistance(), p.getWeight());
            int discount = getDiscount(totalCost, p.getOfferCode(), p.getDistance(), p.getWeight());
            System.out.printf("%s %d %d%n", p.getId(), discount, totalCost - discount);
        }
    }

    private int getDiscount(int totalCost, String offerCode, int distance, int weight) {
        int offerDiscount = offerService.getOfferDiscount(offerCode, distance, weight);
        return totalCost * offerDiscount / 100;

    }

    private int getCost(int baseDeliveryCost, int distance, int weight) {
        int totalCost = 0;
        totalCost += baseDeliveryCost;
        totalCost += distance * COST_FOR_DISTANCE;
        totalCost += weight * COST_FOR_WEIGHT;
        return totalCost;
    }
}
