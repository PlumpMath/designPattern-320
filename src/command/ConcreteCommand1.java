package command;

/**
 * Created by zhanyr
 * datetime: 15/7/24 下午4:10
 * introduction
 */
public class ConcreteCommand1 implements Command {
    private Reciever reciever;

    public ConcreteCommand1(Reciever reciever) {
        this.reciever = reciever;
    }

    @Override
    public void execute() {
        System.out.println("this is Command1");
        reciever.action();
    }
}
