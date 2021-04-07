package top.xx.volatile1;

public class VolatileTest {
    private volatile int  count = 1;

    Runnable runnable = new Runnable() {
        @Override
        public void run() {
            count = 2;
            System.out.println(count);
        }
    };

    public static void main(String[] args) {

    }

}
