package com.metehan.java_ioc_cdi_springboot_1.name;


import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Named;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Named
@RequestScoped
public class MyBeanOne {

    private String str = "MyBeanOne";


}
