package com.metehan.java_ioc_cdi_springboot_1.inject;


import jakarta.enterprise.context.Dependent;

@Dependent
public class MyTool {

    public String myOperation(String str){

        return "Çıktı " + str;
    }
}
