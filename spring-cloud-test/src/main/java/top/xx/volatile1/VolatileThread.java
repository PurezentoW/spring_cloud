package top.xx.volatile1;

/**
 * @author Administrator
 */
public class VolatileThread extends Thread{
    private volatile static int count = 1;



    @Override
    public void run() {
        for (int i=0;i<10000 ;i++){
            count ++ ;
            //count.incrementAndGet() ;
        }
    }

    public static void main(String[] args) {
        VolatileThread volatileThread1 = new VolatileThread();
        volatileThread1.start();
        VolatileThread volatileThread2 = new VolatileThread();
        volatileThread2.start();
        System.out.println(count);
    }
}
