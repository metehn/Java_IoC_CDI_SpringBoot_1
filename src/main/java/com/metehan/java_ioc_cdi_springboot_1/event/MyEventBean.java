package com.metehan.java_ioc_cdi_springboot_1.event;

import jakarta.enterprise.context.RequestScoped;
import jakarta.enterprise.event.Event;
import jakarta.inject.Inject;
import jakarta.inject.Named;

@Named
@RequestScoped
public class MyEventBean {

    @Inject
    private Event<MyEventData> event;

    @Inject @MyEventQualifier(level = 2)
    private Event<MyEventData> event2;

    public void perform(){

        event.fire(new MyEventData("Genel OLay"));
    }

    public void perform2(){

        event2.fire(new MyEventData("Genel OLay 2"));
    }
}
