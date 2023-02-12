package com.metehan.java_ioc_cdi_springboot_1.interceptor;

import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Inject;
import jakarta.inject.Named;

@Named
@RequestScoped
public class MyTraceBean {

    @Inject
    private  MyTraceObject myTraceObject;

    public String myOperation(){

        return "Bean " + myTraceObject.myOperation("Girdi");
    }

}
