package templateMethod.writePaper;

/**
 * Created by zhanyr
 * datetime: 15/7/17 下午5:07
 * introduction
 */
public class ZhanyrPaper extends AbstractPaper {
    @Override
    public void writeTitle() {
        System.out.println("论吃的重要性");
    }

    @Override
    public void writeAbstract() {
        System.out.println("活着就是要吃");
    }

    @Override
    public void writeIntroduction() {
        System.out.println("不吃会饿啊");
    }

    @Override
    public void writeResearch() {
        System.out.println("吃是为了活着，活着不是为了吃");
    }

    @Override
    public void writeSummary() {
        System.out.println("吃确实很重要");
    }

    @Override
    public void writeReference() {
        System.out.println("十二道锋味");
    }
}
