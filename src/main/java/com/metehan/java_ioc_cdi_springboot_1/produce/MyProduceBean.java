package com.metehan.java_ioc_cdi_springboot_1.produce;

import jakarta.enterprise.context.RequestScoped;
import jakarta.enterprise.inject.Produces;
import jakarta.inject.Named;

import java.util.ArrayList;
import java.util.List;

@Named
@RequestScoped
public class MyProduceBean {

    @Produces
    public List<String> getMyList() {

        List<String> list = new ArrayList<>();
        list.add("1");
        list.add("2");
        list.add("3");

        return list;
    }
}
