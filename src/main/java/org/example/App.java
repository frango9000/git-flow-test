package org.example;

import org.example.Calculadora.Operacion;

/**
 * Hello world!
 */
public class App {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        Calculadora calculadora = new Calculadora(6, 3);
        int suma = calculadora.calcular(Operacion.SUMA);
        System.out.println("9: " + suma);
        int resta = calculadora.calcular(Operacion.RESTA);
        System.out.println("3: " + resta);
        int mult = calculadora.calcular(Operacion.MULTIPLICACION);
        System.out.println("18: " + mult);
        int div = calculadora.calcular(Operacion.DIVISION);
        System.out.println("2: " + div);
        int ele = calculadora.calcular(Operacion.ELEVAR);
        System.out.println("216: " + ele);

    }
}