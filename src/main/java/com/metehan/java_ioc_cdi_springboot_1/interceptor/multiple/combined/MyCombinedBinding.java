package com.metehan.java_ioc_cdi_springboot_1.interceptor.multiple.combined;


import com.metehan.java_ioc_cdi_springboot_1.interceptor.MyTraceBinding;
import com.metehan.java_ioc_cdi_springboot_1.interceptor.multiple.MyCountBinding;
import jakarta.interceptor.InterceptorBinding;

import java.lang.annotation.Documented;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.RetentionPolicy.RUNTIME;


/*

@MyTraceBinding ve @MyCountBinding(ascending = true) bir etikette toplanmış hali.

@MyCombinedBinding(ascending = true) şeklinde kullanılabilir.

 */
@MyTraceBinding
@MyCountBinding(ascending = true)
@InterceptorBinding
@Inherited
@Retention(RUNTIME)
@Target({METHOD, FIELD, PARAMETER, TYPE})
@Documented
public @interface MyCombinedBinding {
    boolean ascending();
}
