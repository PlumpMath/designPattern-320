package templateMethod.writePaper;

import org.junit.Test;

/**
 * Created by zhanyr
 * datetime: 15/7/17 下午5:18
 * introduction
 */
public class WriterPaperTest {

    @Test
    public void test(){
        System.out.println("Yxy的paper:");
        AbstractPaper yangxyPaper = new YangxyPaper();
        yangxyPaper.writePaper();
        System.out.println("Zhanyr的paper:");
        AbstractPaper zhanyrPaper = new ZhanyrPaper();
        zhanyrPaper.writePaper();
    }
}
