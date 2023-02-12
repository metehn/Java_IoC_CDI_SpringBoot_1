package com.metehan.java_ioc_cdi_springboot_1.qualifier;


import jakarta.enterprise.context.Dependent;

@MyOption(MyOptionType.TWO)
@Dependent
public class MyOptionImpTwo implements MyOptionSpec{
    @Override
    public String myOperation(String string) {
        return "MyOptionImpTwo " + string;
    }
}
