package com.metehan.java_ioc_cdi_springboot_1.scope;

import jakarta.enterprise.context.SessionScoped;
import jakarta.inject.Inject;
import jakarta.inject.Named;

import java.io.Serializable;


@Named
@SessionScoped
public class MySessionBean implements Serializable {

    @Inject
    private MyDependentValue myDependentValue;
    public String myValue(){

        return "Session "+ hashCode();
    }


    public String getDependentValue(){

        return "Session " + myDependentValue.getValue();
    }

}
