package com.metehan.java_ioc_cdi_springboot_1.alternative;

import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Named;

@Named
@RequestScoped
public class MyAlternativeBean {

/*
    @Inject
    private MyAlternativeSpec myAlternativeSpec;

    bean.xml e bunu yaz
    <!--<class>com.metehan.java_ioc_cdi_springboot_1.alternative.MyAlternativeImpOne</class>-->
*/
private MyAlternativeSpec myAlternativeSpec = new MyAlternativeImpOne();
    public String getMyvalue(){
        return "Çıktı " + myAlternativeSpec.myOperation("Girdi");
    }

}
