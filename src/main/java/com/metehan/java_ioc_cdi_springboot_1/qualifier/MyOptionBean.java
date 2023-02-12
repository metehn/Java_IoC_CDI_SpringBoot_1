package com.metehan.java_ioc_cdi_springboot_1.qualifier;

import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Inject;
import jakarta.inject.Named;

@Named
@RequestScoped
public class MyOptionBean {

    @Inject
    private MyOptionSpec myOptionSpec;

    public String getMyvalue(){
        return "Çıktı " + myOptionSpec.myOperation("Girdi");
    }

}
