package com.metehan.java_ioc_cdi_springboot_1.scope;

import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Inject;
import jakarta.inject.Named;

@Named
@RequestScoped
public class MyRequestBean {

    @Inject
    private MyDependentValue myDependentValue;
    public String myValue(){

        return "Request "+ hashCode();
    }

    public String getDependentValue(){

        return "Request " + myDependentValue.getValue();
    }

}
