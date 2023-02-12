package com.metehan.java_ioc_cdi_springboot_1.interceptor;

import jakarta.enterprise.context.Dependent;

@MyTraceBinding
@Dependent
public class MyTraceObject {

    public String myOperation(String str){

        return  "Çıktı " + str;
    }
}
