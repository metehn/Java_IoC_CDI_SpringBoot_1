package com.metehan.java_ioc_cdi_springboot_1.interceptor.multiple.combined;

import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Inject;
import jakarta.inject.Named;

@Named
@RequestScoped
public class MyCombinedBean {

    @Inject
    private MyCombinedObject myCombinedObject;

    public String getMyValue(){

        return "MyCombinedBean " + myCombinedObject.myOperation("Girdi");
    }
}
