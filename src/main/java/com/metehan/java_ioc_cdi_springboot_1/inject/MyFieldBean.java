package com.metehan.java_ioc_cdi_springboot_1.inject;

import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Inject;
import jakarta.inject.Named;


@Named
@RequestScoped
public class MyFieldBean {


    @Inject
    private MyTool myTool;
    //private MyTool myTool = new MyTool();

    public String getValue() {

        return "Field " + myTool.myOperation("Girdi");
    }

}
