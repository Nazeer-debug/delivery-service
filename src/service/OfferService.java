package service;

import offer.OfferCode;
import offer.OfferCriteria;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class OfferService {
    private final List<OfferCode> offerCodes = new ArrayList<>();
    private final Map<String, OfferCode> offerCriteriaMap = new HashMap<>();

    public OfferService() {
        offerCodes.add(new OfferCode("OFR001", 10, new OfferCriteria(0, 200, 70, 200)));
        offerCodes.add(new OfferCode("OFR002", 7, new OfferCriteria(50, 150, 100, 250)));
        offerCodes.add(new OfferCode("OFR003", 5, new OfferCriteria(50, 250, 10, 15)));
        init();
    }

    public void init() {
        for (OfferCode offerCode : offerCodes) {
            offerCriteriaMap.put(offerCode.getCode(), offerCode);
        }
    }


    public int getOfferDiscount(String appliedOfferCode, int distance, int weight) {
        if (offerCriteriaMap.containsKey(appliedOfferCode)) {
            OfferCode offerCode = offerCriteriaMap.get(appliedOfferCode);
            if (isValidOfferCode(offerCode, distance, weight)) return offerCode.getDiscount();
            else return 0;
        }
        return 0;
    }

    private boolean isValidOfferCode(OfferCode offerCode, int distance, int weight) {
        OfferCriteria criteria = offerCode.getCriteria();
        return isValidOfferDistance(criteria, distance) && isValidOfferWeight(criteria, weight);
    }

    private boolean isValidOfferDistance(OfferCriteria criteria, int distance) {
        return criteria.getMinDistance() <= distance && distance <= criteria.getMaxDistance();
    }

    private boolean isValidOfferWeight(OfferCriteria criteria, int distance) {
        return criteria.getMinWeight() <= distance && distance <= criteria.getMaxWeight();
    }

}
