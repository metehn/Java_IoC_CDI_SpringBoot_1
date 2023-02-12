package com.metehan.java_ioc_cdi_springboot_1.interceptor;


import jakarta.interceptor.InterceptorBinding;

import java.lang.annotation.Documented;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

@InterceptorBinding
@Inherited
@Retention(RUNTIME)
@Target({METHOD, FIELD, PARAMETER, TYPE})
@Documented
public @interface MyTraceBinding {
}
