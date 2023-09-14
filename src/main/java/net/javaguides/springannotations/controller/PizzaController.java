package net.javaguides.springannotations.controller;

import net.javaguides.springannotations.service.VegPizza;
import org.springframework.stereotype.Component;

@Component
public class PizzaController {
    private VegPizza vegPizza;
    public PizzaController(VegPizza vegPizza){
        this.vegPizza=vegPizza;
    }
    public String getPizza(){

        return vegPizza.getPizza() ;

    }

}
