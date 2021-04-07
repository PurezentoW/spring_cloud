package top.xx.yinyong;

import java.io.IOException;

/**
 * @author Administrator
 */
public class 强引用 {
    public static void main(String[] args) throws IOException {
        M m = new M();
        m=null;
//        System.gc();
        System.in.read();
    }

}
