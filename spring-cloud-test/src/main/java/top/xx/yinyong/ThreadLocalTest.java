package top.xx.yinyong;

public class ThreadLocalTest {
    public static void main(String[] args) {
        ThreadLocal<M> tl = new ThreadLocal<>();
        tl.set(new M());
        tl.remove();
    }
}
