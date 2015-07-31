package templateMethod.writePaper;

/**
 * Created by zhanyr
 * datetime: 15/7/17 下午5:13
 * introduction
 */
public class YangxyPaper extends AbstractPaper {
    @Override
    public void writeTitle() {
        System.out.println("论设计模式重要性");
    }

    @Override
    public void writeAbstract() {
        System.out.println("设计模式是一套被反复使用、多数人知晓的、" +
                "经过分类编目的、代码设计经验的总结");
    }

    @Override
    public void writeIntroduction() {
        System.out.println("很多框架都用到了设计模式");
    }

    @Override
    public void writeResearch() {
        System.out.println("设计模式很重要");
    }

    @Override
    public void writeSummary() {
        System.out.println("设计模式确实很重要");
    }

    @Override
    public void writeReference() {
        System.out.println("设计模式");
    }
}
