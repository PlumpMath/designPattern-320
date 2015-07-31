package strategy;

/**
 * Created by zhanyr
 * datetime: 15/7/19 上午12:29
 * introduction
 */
public class Context {
    private Strategy strategy;
    //默认构造方法
    public Context(){

    }
    //使用strategy构造
    public Context(Strategy strategy){
        this.strategy = strategy;
    }

    //策略方法
    public void strategyMethod(){
        strategy.algorithmMethod();
    }
}
