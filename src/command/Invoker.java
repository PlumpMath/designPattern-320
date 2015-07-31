package command;

/**
 * Created by zhanyr
 * datetime: 15/7/24 下午4:17
 * introduction
 */
public class Invoker {
    private Command command;

    public void setCommand(Command command){
        this.command = command;
    }

    public void executeCommand(){
        this.command.execute();
    }
}
