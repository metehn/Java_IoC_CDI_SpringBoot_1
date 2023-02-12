package com.metehan.java_ioc_cdi_springboot_1.qualifier;


import jakarta.enterprise.context.Dependent;

@MyOption(MyOptionType.THREE)
@Dependent
public class MyOptionImpThree implements MyOptionSpec{
    @Override
    public String myOperation(String string) {
        return "MyOptionImpThree " + string;
    }
}
