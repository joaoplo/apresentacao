package org.example;

public class CalculadoraDesconto {

    public double calcularDesconto(double preco, double percentualDesconto) {
        return preco - (preco * (percentualDesconto / 100));
    }
}
