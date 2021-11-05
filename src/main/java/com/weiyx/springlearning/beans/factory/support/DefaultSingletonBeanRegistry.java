package com.weiyx.springlearning.beans.factory.support;

import com.weiyx.springlearning.beans.factory.config.SingletonBeanRegistry;

import java.util.HashMap;

public class DefaultSingletonBeanRegistry implements SingletonBeanRegistry {

    private HashMap<String, Object> singletonObjects = new HashMap<>();

    @Override
    public Object getSingleton(String beanName) {
        return singletonObjects.get(beanName);
    }

    public void addSingleton(String beanName, Object singletonObject){
        singletonObjects.put(beanName, singletonObject);
    }
}
