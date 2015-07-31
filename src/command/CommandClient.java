package command;

import org.junit.Test;

/**
 * Created by zhanyr
 * datetime: 15/7/24 下午4:20
 * introduction
 */
public class CommandClient {

    @Test
    public void testCommand(){
        Command command1 = new ConcreteCommand1(new Reciever("zhanyr"));
        Invoker invoker1 = new Invoker();
        invoker1.setCommand(command1);
        invoker1.executeCommand();

        Command command2 = new ConcreteCommand2(new Reciever("zhanyaru"));
        Invoker invoker2 = new Invoker();
        invoker2.setCommand(command2);
        invoker2.executeCommand();
    }
}
