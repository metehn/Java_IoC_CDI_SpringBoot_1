package com.metehan.java_ioc_cdi_springboot_1.name;


import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Named;
import lombok.*;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Named(value = "beanTwo")
@RequestScoped
public class MyBeanTwo {
    private String str = "MyBeanTwo";
}
