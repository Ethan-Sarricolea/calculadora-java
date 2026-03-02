package com.s23017351;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class OperacionTest {

    @Test
    public void testSumar() {
        Operacion op = new Operacion();
        op.setNum1(5);
        op.setNum2(5);
        assertEquals(10, op.sumar(), "Suma 5 + 5 debe ser 10");
    }

    @Test
    public void testRestar() {
        Operacion op = new Operacion();
        op.setNum1(10);
        op.setNum2(5);
        assertEquals(5, op.restar(), "Resta 10 - 5 debe ser 5");
    }

    @Test
    public void testMultiplicar() {
        Operacion op = new Operacion();
        op.setNum1(5);
        op.setNum2(5);
        assertEquals(25, op.multiplicar(), "Multiplica 5 * 5 debe ser 25");
    }

    @Test
    public void testDividir() {
        Operacion op = new Operacion();
        op.setNum1(10);
        op.setNum2(2);
        assertEquals(5.0f, op.dividir(), "Divide 10 / 2 debe ser 5.0");
    }
}
