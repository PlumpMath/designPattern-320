package strategy.zhe800Promotion;

/**
 * Created by zhanyr
 * datetime: 15/7/19 上午1:10
 * introduction
 */
public class SeniorMemberStrategy implements PromotionStategy{
    //高级会员满200减20之后7折优惠,如果不满200则享受8折优惠
    @Override
    public double calcDiscountPrice(double totalPrice) {
        if (totalPrice >= 200){
            return (totalPrice-20)*0.7;
        }
        return totalPrice*0.8;
    }
}
