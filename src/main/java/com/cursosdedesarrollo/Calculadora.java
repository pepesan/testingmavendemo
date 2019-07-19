package com.cursosdedesarrollo;

import lombok.Data;

@Data
public class Calculadora {
    private Integer dato;

    Calculadora(){
        this.dato=2;
    }
    Calculadora(Integer i){
        this.dato = i;
    }
}
