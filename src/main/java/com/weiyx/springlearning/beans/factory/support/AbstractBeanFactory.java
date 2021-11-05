package com.weiyx.springlearning.beans.factory.support;

import com.weiyx.springlearning.beans.BeansException;
import com.weiyx.springlearning.beans.factory.BeanFactory;
import com.weiyx.springlearning.beans.factory.config.BeanDefinition;

public abstract class AbstractBeanFactory extends DefaultSingletonBeanRegistry implements BeanFactory {


    @Override
    public Object getBean(String beanName) {
        return doGetBean(beanName, null);
    }

    @Override
    public Object getBean(String beanName, Object... args) {
        return doGetBean(beanName, args);
    }

    private Object doGetBean(String beanName, Object... args) {
        Object singleton = getSingleton(beanName);
        if (singleton != null){
            return singleton;
        }
        BeanDefinition beanDefinition = getBeanDefinition(beanName);
        return createBean(beanName, beanDefinition, args);
    }


    protected abstract BeanDefinition getBeanDefinition(String beanName) throws BeansException;

    protected abstract Object createBean(String beanName, BeanDefinition beanDefinition, Object[] args) throws BeansException;
}
