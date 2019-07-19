package com.cursosdedesarrollo;

import org.junit.Test;

import static org.junit.Assert.*;

public class TestCalculadora {



    @Test
    public void testPrintMessage() {
       Calculadora c= new Calculadora();
       assertNotNull(c);
    }
    @Test
    public void testPropiedad(){
        Calculadora c = new Calculadora();
        assertEquals(new Integer(2),c.getDato());
    }

    @Test
    public void testContructorParams(){
        Integer i = 2;
        Calculadora c = new Calculadora(2);
        assertEquals(i,c.getDato());
    }
    @Test
    public void testContructorParamsWrongData(){
        Integer i = 2;
        Calculadora c = new Calculadora(2);
        assertNotEquals(new Integer(3),c.getDato());
    }
}
