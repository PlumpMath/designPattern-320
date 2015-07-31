package templateMethod.writePaper;

/**
 * Created by zhanyr
 * datetime: 15/7/17 下午4:59
 * introduction
 */
public abstract class AbstractPaper {
    public abstract void writeTitle();
    public abstract void writeAbstract();
    public abstract void writeIntroduction();
    public abstract void writeResearch();
    public abstract void writeSummary();
    public abstract void writeReference();

    public void writePaper(){
        System.out.print("题目：");
        writeTitle();
        System.out.print("摘要：");
        writeAbstract();
        System.out.print("引言：");
        writeIntroduction();
        System.out.print("研究内容：");
        writeResearch();
        System.out.print("总结：");
        writeSummary();
        System.out.print("参考文献：");
        writeReference();
    }
}
