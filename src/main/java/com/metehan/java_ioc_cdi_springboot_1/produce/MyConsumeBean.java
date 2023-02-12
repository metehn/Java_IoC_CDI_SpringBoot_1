package com.metehan.java_ioc_cdi_springboot_1.produce;

import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Inject;
import jakarta.inject.Named;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;


@Getter
@NoArgsConstructor

@Named
@RequestScoped
public class MyConsumeBean {

    @Inject
    private List<String> list;

    public List<String> getList(){

        return list;
    }
}
