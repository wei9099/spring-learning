package com.weiyx.springlearning.beans.factory.support;

import com.weiyx.springlearning.beans.BeansException;
import com.weiyx.springlearning.beans.factory.config.BeanDefinition;

import java.lang.reflect.Constructor;

public interface InstantiationStrategy {
    Object instantiate(BeanDefinition beanDefinition, String beanName, Constructor ctor, Object... args) throws BeansException;
}
