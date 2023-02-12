package com.metehan.java_ioc_cdi_springboot_1.stereotype;


import com.metehan.java_ioc_cdi_springboot_1.interceptor.MyTraceBinding;
import com.metehan.java_ioc_cdi_springboot_1.interceptor.multiple.MyCountBinding;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.inject.Stereotype;
import jakarta.inject.Named;

import java.lang.annotation.Documented;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Named
@ApplicationScoped
@MyCountBinding(ascending = true)
@MyTraceBinding
@Stereotype
@Inherited
@Retention(RUNTIME)
@Target({METHOD, FIELD, PARAMETER, TYPE})
@Documented
public @interface MyStereoTypeAnnotation {
}
