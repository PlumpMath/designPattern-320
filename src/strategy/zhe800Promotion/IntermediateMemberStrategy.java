package strategy.zhe800Promotion;

/**
 * Created by zhanyr
 * datetime: 15/7/19 上午1:07
 * introduction
 */
public class IntermediateMemberStrategy implements PromotionStategy {
    //中级会员8折
    @Override
    public double calcDiscountPrice(double totalPrice) {
        return totalPrice*0.8;
    }
}
