package com.metehan.java_ioc_cdi_springboot_1.interceptor;

import jakarta.interceptor.AroundInvoke;
import jakarta.interceptor.Interceptor;
import jakarta.interceptor.InvocationContext;

@MyTraceBinding
@Interceptor
public class MyTraceInterceptor {

    /*
    Kullanılabilmesi için bean.xml'e bildirmek gerekiyor

    <interceptors>
        <class>com.metehan.java_ioc_cdi_springboot_1.interceptor.MyTraceInterceptor</class>
    </interceptors>

     */
    @AroundInvoke
    public Object myMethod(InvocationContext context) {
        System.out.println("||||||||||||||||||||||||||");
        System.out.println("Çağırılan Yöntem: " + context.getMethod().getName());

        Object result = null;
        try {

            result = context.proceed();
            System.out.println("Dönen Sonuç: " + result);

        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        return result;
    }
}
