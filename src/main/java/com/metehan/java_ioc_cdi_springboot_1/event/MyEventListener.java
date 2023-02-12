package com.metehan.java_ioc_cdi_springboot_1.event;


import jakarta.enterprise.context.Dependent;
import jakarta.enterprise.event.Observes;

@Dependent
public class MyEventListener {

    public void listen( @Observes MyEventData myEventData){

        System.out.println("Olay gerçekleşti " + myEventData.getMyField());
    }
    public void listen2( @Observes @MyEventQualifier(level =  2) MyEventData myEventData){

        System.out.println("2. level Olay gerçekleşti " + myEventData.getMyField());
    }
}
