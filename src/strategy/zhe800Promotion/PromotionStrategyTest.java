package strategy.zhe800Promotion;

import org.junit.Test;

/**
 * Created by zhanyr
 * datetime: 15/7/19 上午1:18
 * introduction
 */
public class PromotionStrategyTest {
    @Test
    public void testPromotionStrategy(){
        System.out.print("某初级用户花了150，总价是：");
        PromotionStategy stategyA = new PrimaryMemberStrategy();
        CalcDiscountPrice calcDiscountPriceA = new CalcDiscountPrice(stategyA);
        System.out.println(calcDiscountPriceA.CalcTotal(150));

        System.out.print("某中级用户花了80，总价是：");
        PromotionStategy stategyB = new IntermediateMemberStrategy();
        CalcDiscountPrice calcDiscountPriceB = new CalcDiscountPrice(stategyB);
        System.out.println(calcDiscountPriceB.CalcTotal(80));

        System.out.print("某高级用户花了220，总价是：");
        PromotionStategy stategyC = new SeniorMemberStrategy();
        CalcDiscountPrice calcDiscountPriceC = new CalcDiscountPrice(stategyC);
        System.out.println(calcDiscountPriceC.CalcTotal(220));

    }
}
