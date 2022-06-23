package com.MicroServiceDemo.MicroServiceDemo.Bean;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.ConstructorBinding;
import org.springframework.stereotype.Component;

@Component
@ConstructorBinding
@ConfigurationProperties("firstmicroservicedemo")
public class NameSender {
    private String firstname;
    private String lastname;
    private  String num1;
    private  String num2;
    private  int add;
    public NameSender() {

    }

//    public String getFirstname(){
//        return firstname;
//    }
//    public  void setFirstname(String firstname){
//        this.firstname = firstname;
//    }
//
//    public String getLastname(){
//        return lastname;
//    }
//    public void setLastname(String lastname){
//        this.lastname = lastname;
//    }

    public String getNum1() {
        return num1;
    }

    public void setNum1(String num1) {

        this.num1 = num1;
    }

    public String getNum2() {
        return num2;
    }

    public void setNum2(String num2) {

        this.num2 = num2;
    }

    public int getAdd() {
        return add;
    }

    public NameSender(String num1, String num2, int add) {
        //this.firstname = firstname;
       // this.lastname = lastname;
        this.num1 = num1;
        this.num2 = num2;
        this.add = Integer.parseInt(num1)+Integer.parseInt(num2);

    }




}
