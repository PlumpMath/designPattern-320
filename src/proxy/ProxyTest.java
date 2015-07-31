package proxy;

import org.junit.Test;


/**
 * Created by zhanyr
 * datetime: 15/7/31 上午11:46
 * introduction
 */
public class ProxyTest {
    @Test
    public void testProxy(){
        AbstractIntf obj = new ProxyClass(new RealClass());
        obj.method();
    }
}
