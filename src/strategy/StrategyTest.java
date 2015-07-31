package strategy;

import org.junit.Test;

/**
 * Created by zhanyr
 * datetime: 15/7/19 上午12:35
 * introduction
 */
public class StrategyTest {

    @Test
    public void testStrategy(){
        System.out.print("使用A算法:");
        Strategy strategyA = new ConcreteStrategyA();
        Context contextA = new Context(strategyA);
        contextA.strategyMethod();

        System.out.print("使用B算法:");
        Strategy strategyB = new ConcreteStrategyB();
        Context contextB = new Context(strategyB);
        contextB.strategyMethod();

        System.out.print("使用C算法:");
        Strategy strategyC = new ConcreteStrategyC();
        Context contextC= new Context(strategyC);
        contextC.strategyMethod();

    }

}
