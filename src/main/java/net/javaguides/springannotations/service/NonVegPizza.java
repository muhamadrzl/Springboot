package net.javaguides.springannotations.service;

import jdk.jfr.Percentage;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;


public class NonVegPizza implements Pizza {
    @Override
    public String getPizza(){
        return "NonVeg Pizza";
    }
}
