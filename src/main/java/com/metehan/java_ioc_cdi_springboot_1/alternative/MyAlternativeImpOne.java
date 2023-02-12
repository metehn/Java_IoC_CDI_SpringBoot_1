package com.metehan.java_ioc_cdi_springboot_1.alternative;

import jakarta.enterprise.context.Dependent;
import jakarta.enterprise.inject.Alternative;

@Alternative
@Dependent
public class MyAlternativeImpOne implements MyAlternativeSpec {


    @Override
    public String myOperation(String string) {
        return "MyOptionImpOne " + string;
    }
}

