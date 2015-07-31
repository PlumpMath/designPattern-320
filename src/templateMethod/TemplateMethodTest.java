package templateMethod;

import org.junit.Test;

/**
 * Created by zhanyr
 * datetime: 15/7/17 下午4:36
 * introduction
 */
public class TemplateMethodTest {

    @Test
    public void testTemplateMethod(){
        AbstractClass concreteA = new ConcreteClassA();
        AbstractClass concreteB = new ConcreteClassB();
        concreteA.templateMethod();
        concreteB.templateMethod();
    }

}
