package org.example;

public class Calculadora {

    private int num1 = 0;
    private int num2 = 0;

    public Calculadora() {
    }

    public Calculadora(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public int getNum1() {
        return num1;
    }

    public int getNum2() {
        return num2;
    }

    public int calcular(Operacion operacion) {
        int resultado = 0;
        switch (operacion) {
            case SUMA:
                resultado = suma();
                break;
            case RESTA:
                resultado = resta();
                break;
            case MULTIPLICACION:
                resultado = multiplicar();
                break;
            case DIVISION:
                resultado = dividir();
                break;
        }
        return resultado;
    }

    private int suma() {
        return num1 + num2;
    }

    private int resta() {
        return num1 - num2;
    }

    private int multiplicar() {
        return num1 * num2;
    }

    private int dividir() {
        return num1 / num2;
    }

    public enum Operacion {
        SUMA,
        RESTA,
        MULTIPLICACION,
        DIVISION
    }
}