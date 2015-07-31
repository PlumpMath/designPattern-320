package command;

/**
 * Created by zhanyr
 * datetime: 15/7/24 下午4:10
 * introduction
 */
public class Reciever {
    String name = "";
    public Reciever(String name){
        this.name = name;
    }
    public void action(){
        System.out.println("Reciever "+name+" action");
    }
}
