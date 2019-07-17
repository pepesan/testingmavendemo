package com.cursosdedesarrollo;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestMessageUtil {

    String message = "Hello World";
    MessageUtil messageUtil = new MessageUtil(message);

    @Test
    public void testPrintMessage() {
        assertEquals(message,messageUtil.printMessage());
    }
}
