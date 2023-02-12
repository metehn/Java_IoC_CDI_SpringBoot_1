package com.metehan.java_ioc_cdi_springboot_1.scope;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.inject.Named;


@Named
@ApplicationScoped
public class MyApplicationBean {

    @Inject
    private MyDependentValue myDependentValue;
    public String myValue(){

        return "Application "+ hashCode();
    }

    public String getDependentValue(){

        return "Application " + myDependentValue.getValue();
    }

}
