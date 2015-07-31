package strategy.zhe800Promotion;

/**
 * Created by zhanyr
 * datetime: 15/7/19 上午1:05
 * introduction
 */
public class PrimaryMemberStrategy implements PromotionStategy {
    //初级会员满100-20
    @Override
    public double calcDiscountPrice(double totalPrice) {
        if(totalPrice >= 100)
            return totalPrice-20;
        return totalPrice;
    }
}
