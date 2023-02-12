package com.metehan.java_ioc_cdi_springboot_1.scope;

import jakarta.enterprise.context.Dependent;
import jakarta.inject.Named;

import java.io.Serializable;

@Named
@Dependent
public class MyDependentValue implements Serializable {


    public String getValue(){

        return "Dependent " + hashCode();
    }
}
