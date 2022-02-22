package com.weiyx.springlearning;

import com.weiyx.springlearning.bean.UserDao;
import com.weiyx.springlearning.bean.UserService;
import com.weiyx.springlearning.beans.PropertyValue;
import com.weiyx.springlearning.beans.factory.config.BeanReference;
import com.weiyx.springlearning.beans.factory.PropertyValues;
import com.weiyx.springlearning.beans.factory.config.BeanDefinition;
import com.weiyx.springlearning.beans.factory.support.DefaultListableBeanFactory;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class ApiTest {

    @Test
    public void test_BeanFactory(){
        //初始化bean容器
        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();
        //注册 bean
        beanFactory.registerBeanDefinition("userDao", new BeanDefinition(UserDao.class));
        //设置属性
        PropertyValues propertyValues = new PropertyValues();
        propertyValues.addPropertyValue(new PropertyValue("uId", "10001"));
        propertyValues.addPropertyValue(new PropertyValue("userDao", new BeanReference("userDao")));
        //注册 bean
        beanFactory.registerBeanDefinition("userService", new BeanDefinition(UserService.class, propertyValues));
        //获取bean
        UserService userService1 = (UserService)beanFactory.getBean("userService");
        userService1.queryUserInfo();
    }
}
