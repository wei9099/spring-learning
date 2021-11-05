package com.weiyx.springlearning.beans.factory.config;

public class BeanDefinition {
    private Class beanClass;

    public BeanDefinition(Class beanClass) {
        this.beanClass = beanClass;
    }

    public Class getBeanClass(){
        return beanClass;
    }
}