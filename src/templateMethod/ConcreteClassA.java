package templateMethod;

/**
 * Created by zhanyr
 * datetime: 15/7/17 下午4:28
 * introduction
 */
public class ConcreteClassA extends AbstractClass{
    @Override
    public void method1() {
        System.out.println("A_method1");
    }

    @Override
    public void method2() {
        System.out.println("A_method2");
    }
}
