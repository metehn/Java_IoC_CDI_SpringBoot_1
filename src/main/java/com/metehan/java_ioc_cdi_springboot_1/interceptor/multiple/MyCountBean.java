package com.metehan.java_ioc_cdi_springboot_1.interceptor.multiple;

import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Inject;
import jakarta.inject.Named;

@Named
@RequestScoped
public class MyCountBean {

    @Inject
    private MyCountAscendingObject myCountAscendingObject;

    @Inject
    private MyCountDescendingObject myCountDescendingObject;


    public String getAscendingValue(){

        myCountAscendingObject.myOperation("Girdi");
        myCountAscendingObject.myOperation("Girdi");
        myCountAscendingObject.myOperation("Girdi");

        return "MyCountBean " + myCountAscendingObject.myOperation("Girdi");
    }

    public String getDescendingValue(){

        myCountDescendingObject.myOperation("Girdi");
        myCountDescendingObject.myOperation("Girdi");
        myCountDescendingObject.myOperation("Girdi");

        return "MyCountBean " + myCountDescendingObject.myOperation("Girdi");
    }

}


