package command;

/**
 * Created by zhanyr
 * datetime: 15/7/24 下午4:14
 * introduction
 */
public class ConcreteCommand2 implements Command{
    private Reciever reciever;

    public ConcreteCommand2(Reciever reciever) {
        this.reciever = reciever;
    }

    @Override
    public void execute() {
        System.out.println("this is Command2");
        reciever.action();
    }
}
