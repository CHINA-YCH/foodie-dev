package com.test;

import com.imooc.Application;
import com.imooc.service.StuService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author :Administrator
 * @path :TransTest
 * @date :2023-06-11 18:29:58
 * @describe :class
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class)
public class TransTest {

    @Autowired
    private StuService stuService;


    @Test
    public void myTest() {

    }


}
