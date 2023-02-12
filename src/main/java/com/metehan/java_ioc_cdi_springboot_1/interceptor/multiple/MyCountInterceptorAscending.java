package com.metehan.java_ioc_cdi_springboot_1.interceptor.multiple;


import jakarta.interceptor.AroundInvoke;
import jakarta.interceptor.Interceptor;
import jakarta.interceptor.InvocationContext;

@MyCountBinding(ascending = true)
@Interceptor
public class MyCountInterceptorAscending {

    private int count = 10;
    @AroundInvoke
    public Object myMethod(InvocationContext context) {


        System.out.println("||||||||||||||||||||||||||");
        System.out.println("Çağırılan Yöntem: " + context.getMethod().getName());

        Object result = null;
        try {
            count++;
            result = context.proceed();
            System.out.println("Dönen Sonuç: " + count);

        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        return result;
    }
}
