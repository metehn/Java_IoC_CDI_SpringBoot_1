package com.metehan.java_ioc_cdi_springboot_1.stereotype;

import jakarta.enterprise.inject.Model;

@Model
public class MyModelBean {

 public String getValue(){

     return "MyMoelBean " + hashCode();
 }
}
