package padroesestruturais.bridge.atividade1;

import org.junit.jupiter.api.Test;
import padroesestruturais.bridge.atividade1.cargos.Vendedor;

import static org.junit.jupiter.api.Assertions.assertEquals;

class VendedorTest {

    @Test
    public void deveRetornarVendaRealizada() {
        Vendedor vendedor = new Vendedor();
        assertEquals("Venda feita com sucesso", vendedor.RealizarVenda());
    }

    @Test
    public void deveRetornarSemVendaParaCancelar() {
        Vendedor vendedor = new Vendedor();
        assertEquals("Não há vendas para cancelar", vendedor.CancelarVenda());
    }

    @Test
    public void deveRetornarTrocaRealizada() {
        Vendedor vendedor = new Vendedor();
        assertEquals("Troca feita com sucesso", vendedor.RealizarTroca());
    }

    @Test
    public void deveRetornarSemTrocaParaCancelar() {
        Vendedor vendedor = new Vendedor();
        assertEquals("Não há trocas para cancelar", vendedor.CancelarTroca());
    }

    @Test
    public void deveRetornarSalarioBase() {
        Vendedor vendedor = new Vendedor();
        assertEquals(1100.0f, vendedor.calcularSalario());
    }

    @Test
    public void deveRetornarSalarioComAcrescimoDeVenda() {
        Vendedor vendedor = new Vendedor();
        vendedor.RealizarVenda();
        assertEquals(1650.0f, vendedor.calcularSalario());
    }

    @Test
    public void deveRetornarSalarioComAcrescimoDeTroca() {
        Vendedor vendedor = new Vendedor();
        vendedor.RealizarTroca();
        assertEquals(1320.0f, vendedor.calcularSalario());
    }

    @Test
    public void deveRetornarSalarioComAcrescimoDeVendaETroca() {
        Vendedor vendedor = new Vendedor();
        vendedor.RealizarVenda();
        vendedor.RealizarTroca();
        assertEquals(1870.0f, vendedor.calcularSalario());
    }

    @Test
    public void deveRetornarSalarioComAcrescimoDeTrocaEDescontoDeVenda() {
        Vendedor vendedor = new Vendedor();
        vendedor.RealizarVenda();
        vendedor.RealizarTroca();
        vendedor.CancelarVenda();
        assertEquals(1320.0f, vendedor.calcularSalario());
    }

    @Test
    public void deveRetornarSalarioComAcrescimoDeVendaEDescontoDeTroca() {
        Vendedor vendedor = new Vendedor();
        vendedor.RealizarVenda();
        vendedor.RealizarTroca();
        vendedor.CancelarTroca();
        assertEquals(1650.0f, vendedor.calcularSalario());
    }

    @Test
    public void deveRetornarSalarioComAcrescimoDeVendaEDescontoDeVenda() {
        Vendedor vendedor = new Vendedor();
        vendedor.RealizarVenda();
        vendedor.CancelarVenda();
        assertEquals(1100.0f, vendedor.calcularSalario());
    }

    @Test
    public void deveRetornarSalarioComAcrescimoDeTrocaEDescontoDeTroca() {
        Vendedor vendedor = new Vendedor();
        vendedor.RealizarTroca();
        vendedor.CancelarTroca();
        assertEquals(1100.0f, vendedor.calcularSalario());
    }

    @Test
    public void deveRetornarSalarioComDescontoDeVendaETroca() {
        Vendedor vendedor = new Vendedor();
        vendedor.RealizarVenda();
        vendedor.RealizarTroca();
        vendedor.CancelarVenda();
        vendedor.CancelarTroca();
        assertEquals(1100.0f, vendedor.calcularSalario());
    }
}
