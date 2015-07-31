package dependency;

import com.sun.org.apache.xerces.internal.util.SynchronizedSymbolTable;

/**
 * Created by zhanyr
 * datetime: 15/7/17 下午12:40
 * introduction
 */
public class Person {
    public void crossRiver(){
        Boat boat = new Boat();
        boat.crossRiver();
    }
}
