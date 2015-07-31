package strategy.zhe800Promotion;

/**
 * Created by zhanyr
 * datetime: 15/7/19 上午1:16
 * introduction
 */
public class CalcDiscountPrice {
    private PromotionStategy promotionStategy;
    public CalcDiscountPrice(){
    }
    public  CalcDiscountPrice(PromotionStategy promotionStategy){
        this.promotionStategy = promotionStategy;
    }
    public double CalcTotal(double price){
        return promotionStategy.calcDiscountPrice(price);
    }
}
