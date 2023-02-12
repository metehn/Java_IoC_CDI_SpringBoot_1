package com.metehan.java_ioc_cdi_springboot_1.stereotype;

/*
@Named
@ApplicationScoped
@MyCountBinding(ascending = true)
@MyTraceBinding
*/
@MyStereoTypeAnnotation
public class MyStereotypeBean {



    public String getValue(){

        return "MyStereotypeBean " + hashCode();
    }

}
