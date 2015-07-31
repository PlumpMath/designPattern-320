package proxy;

/**
 * Created by zhanyr
 * datetime: 15/7/31 上午11:42
 * introduction
 */
public class ProxyClass implements AbstractIntf{

    private AbstractIntf real;
    public ProxyClass(){
        this.real = new RealClass();
    }
    public ProxyClass(AbstractIntf real){
        this.real = real;
    }
    @Override
    public void method() {
        System.out.println("use proxy");
        real.method();
    }
}
