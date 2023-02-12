package com.metehan.java_ioc_cdi_springboot_1.interceptor.multiple;

import jakarta.enterprise.context.Dependent;
@Dependent
@MyCountBinding(ascending = true)
public class MyCountAscendingObject {

    public String myOperation(String str){

        return "Ascending Çıktı " + str;
    }
}
