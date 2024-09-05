import org.example.CalculadoraDesconto;
import org.example.ProcessadorPedido;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestProcessadorPedido {

    @Test
    public void testAplicarDesconto() {
        CalculadoraDesconto calculadoraDesconto = new CalculadoraDesconto();

        ProcessadorPedido processadorPedido = new ProcessadorPedido(calculadoraDesconto);

        double preco = 100.0;
        double percentualDesconto = 10.0;

        double precoEsperadoComDesconto = 90.0;

        double resultado = processadorPedido.aplicarDesconto(preco, percentualDesconto);

        assertEquals(precoEsperadoComDesconto, resultado, 0.01);
    }
}
