package com.weiyx.springlearning.beans.factory.support;

import com.weiyx.springlearning.beans.BeansException;
import com.weiyx.springlearning.beans.factory.config.BeanDefinition;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class SimpleInstantiationStrategy implements InstantiationStrategy{

    @Override
    public Object instantiate(BeanDefinition beanDefinition, String beanName, Constructor ctor, Object... args) throws BeansException {
        Object bean = null;
        Class beanClass = beanDefinition.getBeanClass();
        try {
            if (ctor != null){
                bean = beanClass.getDeclaredConstructor(ctor.getParameterTypes()).newInstance(args);
            } else {
                bean = beanClass.getDeclaredConstructor().newInstance();
            }
        } catch (InstantiationException | IllegalAccessException | InvocationTargetException | NoSuchMethodException e) {
            throw new BeansException("Failed to instantiate [" + beanClass.getName() + "]", e);
        }
        return bean;
    }
}
