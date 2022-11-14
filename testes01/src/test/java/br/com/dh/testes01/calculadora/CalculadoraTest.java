package br.com.dh.testes01.calculadora;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculadoraTest {
    Calculadora calculadora = new Calculadora();

    // dado_que_quando_entao
    // metodos_testado_o que é esperado

    @Test
    @DisplayName("valida a soma")
    public void soma_returnDouble_whenValidInput (){
        // setup

        double n1 = 10;
        double n2 = 20;
        double expected = 30;

        // run
        double resp = calculadora.soma(n1, n2);

        // validate
        assertEquals(expected, resp);

    }

    @Test
    @DisplayName("validando a divisao")
    public void dividir_returnDouble_whenTwoPositiveNumbers(){

        //setup
        double n1 = 30;
        double n2 = 3;
        double expected = 10;

        //run
        double resp = calculadora.dividir(n1,n2);

        //validate

        assertEquals(expected, resp);
    }
    @Test
    @DisplayName("validando n2 zero")
    public void dividir_returnZero_whenDivisorEqualsZero(){

        //setup
        double n1 = 30;
        double n2 = 0;
        double expected = 0;

        //run
        double resp = calculadora.dividir(n1,n2);

        //validate

        assertEquals(expected, resp);
    }
}
