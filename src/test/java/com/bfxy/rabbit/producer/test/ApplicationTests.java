package com.bfxy.rabbit.producer.test;

import com.bfxy.rabbit.producer.component.RabbitSender;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName: ApplicationTests
 * @Description:
 * @Author 李泽波
 * @Date 2020/12/9
 * @Version 1.0
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class ApplicationTests {
    @Autowired
    private RabbitSender rabbitSender;

    @Test
    public void testSender() throws Exception{
        Map<String,Object> properties = new HashMap<String,Object>();
        properties.put("attr1","12345");
        properties.put("attr2","abcde");
        rabbitSender.send("hello rabbitmq!",properties);

        Thread.sleep(10000);
    }



}
