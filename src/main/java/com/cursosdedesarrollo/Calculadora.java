package com.cursosdedesarrollo;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Calculadora {
    private Integer dato;

    Calculadora(){
        this.dato=2;
    }
    Calculadora(Integer i){
        this.dato = i;
    }
}
