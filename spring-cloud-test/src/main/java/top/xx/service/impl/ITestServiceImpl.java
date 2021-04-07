package top.xx.service.impl;

import org.springframework.stereotype.Service;
import top.xx.service.ITestService;

/**
 * @author Administrator
 */
@Service
public class ITestServiceImpl implements ITestService {
    @Override
    public void getTest() {
        System.out.println("ITestServiceImpl");
    }
}
