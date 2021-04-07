package top.xx.service.impl;

import org.springframework.stereotype.Service;
import top.xx.service.ITestService;

/**
 * @author Administrator
 */
@Service
public class I2TestServiceImpl implements ITestService {

    @Override
    public void getTest() {
        System.out.println("I2TestServiceImpl");
    }
}
