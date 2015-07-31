package templateMethod;

/**
 * Created by zhanyr
 * datetime: 15/7/17 下午4:25
 * introduction
 */
public abstract class AbstractClass {
    public abstract void method1();
    public abstract void method2();
    public void templateMethod(){
        System.out.println("templateMethod");
        method1();
        method2();
    }
}
