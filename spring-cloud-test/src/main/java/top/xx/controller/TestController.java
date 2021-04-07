package top.xx.controller;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import top.xx.service.ITestService;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

@Controller
public class TestController {

    private final ITestService iTestService;

    // 锁对象
    private Lock lock = new ReentrantLock();

    public TestController(@Qualifier("ITestServiceImpl") ITestService iTestService) {
        this.iTestService = iTestService;
    }

    public void getTestService(){

    }

    public static void main(String[] args) {
        String str = new String();
        synchronized (str) {

        }
    }

    public synchronized void getTT(){
        String str = new String();
        lock.lock();
        try {

        }catch (Exception e){

        }finally {
            lock.unlock();
        }

    }
}
