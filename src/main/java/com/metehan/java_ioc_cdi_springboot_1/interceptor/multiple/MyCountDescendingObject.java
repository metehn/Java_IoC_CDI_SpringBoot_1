package com.metehan.java_ioc_cdi_springboot_1.interceptor.multiple;

import jakarta.enterprise.context.Dependent;

@MyCountBinding(ascending = false)
@Dependent
public class MyCountDescendingObject {

    public String myOperation(String str){

        return "Descending Çıktı " + str;
    }
}
