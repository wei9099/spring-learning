package com.weiyx.springlearning.beans.factory;

/**
 * 获取bean实例
 */
public interface BeanFactory {

    Object getBean(String beanName);

    Object getBean(String beanName, Object... args);
}
