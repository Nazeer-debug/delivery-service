package offer;

public class OfferCode {
    private final String code;
    private final int discount;
    private final OfferCriteria criteria;

    public OfferCode(String code, int discount, OfferCriteria criteria) {
        this.code = code;
        this.discount = discount;
        this.criteria = criteria;
    }

    public String getCode() {
        return code;
    }

    public int getDiscount() {
        return discount;
    }

    public OfferCriteria getCriteria() {
        return criteria;
    }
}
