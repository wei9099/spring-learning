package com.weiyx.springlearning.beans.factory.support;

import com.weiyx.springlearning.beans.factory.config.BeanDefinition;

public interface BeanDefinitionRegistry{
    void registerBeanDefinition(String beanName, BeanDefinition beanDefinition);
}
