package com.metehan.java_ioc_cdi_springboot_1.interceptor.multiple.combined;

import com.metehan.java_ioc_cdi_springboot_1.interceptor.MyTraceBinding;
import com.metehan.java_ioc_cdi_springboot_1.interceptor.multiple.MyCountBinding;
import jakarta.enterprise.context.Dependent;

@MyTraceBinding
@MyCountBinding(ascending = true)
@Dependent
public class MyCombinedObject {

    public String myOperation(String str){

        return "MyCombinedObject Çıktı " + str;
    }
}
