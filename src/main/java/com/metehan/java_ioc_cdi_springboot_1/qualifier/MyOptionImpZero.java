package com.metehan.java_ioc_cdi_springboot_1.qualifier;

import jakarta.enterprise.context.Dependent;
import jakarta.enterprise.inject.Default;

@Dependent
@Default
public class MyOptionImpZero implements MyOptionSpec{


    @Override
    public String myOperation(String string) {
        return "MyOptionImpZero " + string;
    }
}

