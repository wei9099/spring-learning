package com.weiyx.springlearning.beans.factory.config;

public interface SingletonBeanRegistry {

    Object getSingleton(String beanName);
}
