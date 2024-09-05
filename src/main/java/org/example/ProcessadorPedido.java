package org.example;

public class ProcessadorPedido {

    private CalculadoraDesconto calculadoraDesconto;

    public ProcessadorPedido(CalculadoraDesconto calculadoraDesconto) {
        this.calculadoraDesconto = calculadoraDesconto;
    }

    public double aplicarDesconto(double preco, double percentualDesconto) {
        return calculadoraDesconto.calcularDesconto(preco, percentualDesconto);
    }
}
