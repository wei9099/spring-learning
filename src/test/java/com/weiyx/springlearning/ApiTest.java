package com.weiyx.springlearning;

import com.weiyx.springlearning.bean.UserService;
import com.weiyx.springlearning.beans.factory.BeanFactory;
import com.weiyx.springlearning.beans.factory.config.BeanDefinition;
import com.weiyx.springlearning.beans.factory.support.DefaultListableBeanFactory;
import com.weiyx.springlearning.beans.factory.support.DefaultSingletonBeanRegistry;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class ApiTest {

    @Test
    public void test_BeanFactory(){
        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();
        BeanDefinition beanDefinition = new BeanDefinition(UserService.class);
        beanFactory.registerBeanDefinition("userService", beanDefinition);

        UserService userService1 = (UserService)beanFactory.getBean("userService", "zhangsan");
        userService1.queryUserInfo();

    }
}
