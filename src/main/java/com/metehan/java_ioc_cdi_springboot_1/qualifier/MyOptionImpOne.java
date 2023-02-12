package com.metehan.java_ioc_cdi_springboot_1.qualifier;

import jakarta.enterprise.context.Dependent;

@Dependent
@MyOption(MyOptionType.ONE)
public class MyOptionImpOne implements MyOptionSpec{


    @Override
    public String myOperation(String string) {
        return "MyOptionImpOne " + string;
    }
}

