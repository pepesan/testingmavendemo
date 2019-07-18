package com.cursosdedesarrollo;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.LinkedList;
import java.util.List;

import static org.mockito.Mockito.*;

public class TestListado {
    @Mock
    private LinkedList<String> listado;

    @Before
    public void initMocks() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testAnnotation() {
        listado.add("Uno");
        verify(listado).add("Uno");
        // Podemos mockear clases, no sólo interfacess
        LinkedList mockedList = mock(LinkedList.class);
        // Simulando llamadas (stubbing)
        when(mockedList.get(0)).thenReturn("first");
        // Devolve run valor fijo
        System.out.println(mockedList.get(0));
        // No sabe que devolver porque no se lo hemos dicho
        System.out.println(mockedList.get(999));
        verify(mockedList).get(0);
        // Probando los métodos mockeados
        mockedList.add("once");
        verify(mockedList, times(1)).add("once");
        mockedList.add("twice");
        mockedList.add("twice");
        verify(mockedList, atLeastOnce()).add("twice");
        // verificamos que no se ha llamado nunca
        verify(mockedList, never()).add("two");
    }
    @Test(expected = RuntimeException.class)
    public void testWithException(){
        LinkedList mockedList = mock(LinkedList.class);
        doThrow(new RuntimeException()).when(mockedList).clear();
        //following throws RuntimeException:
        mockedList.clear();
    }
    @Test
    public void testconEspia(){
        List<String> list = new LinkedList<>();
        List<String> spy = spy(list);
        //optionally, you can stub out some methods:
        when(spy.size()).thenReturn(100);
        //using the spy calls *real* methods
        spy.add("one");
        spy.add("two");
        //prints "one" - the first element of a list
        System.out.println(spy.get(0));
        //size() method was stubbed - 100 is printed
        System.out.println(spy.size());
    }
}