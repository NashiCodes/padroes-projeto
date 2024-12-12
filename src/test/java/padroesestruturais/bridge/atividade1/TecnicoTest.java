package padroesestruturais.bridge.atividade1;

import org.junit.jupiter.api.Test;
import padroesestruturais.bridge.atividade1.cargos.Tecnico;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TecnicoTest {

    @Test
    public void deveRetornarReparoExecutado() {
        Tecnico tecnico = new Tecnico();
        assertEquals("Reparo Feito", tecnico.RealizarReparo());
    }

    @Test
    public void deveRetornarSemReparoParaCancelar() {
        Tecnico tecnico = new Tecnico();
        assertEquals("Não há reparos para cancelar", tecnico.CancelarReparo());
    }

    @Test
    public void deveRetornarReparoCancelado() {
        Tecnico tecnico = new Tecnico();
        tecnico.RealizarReparo();
        assertEquals("Reparo Cancelado", tecnico.CancelarReparo());
    }

    @Test
    public void deveRetornarVendaRealizada() {
        Tecnico tecnico = new Tecnico();
        assertEquals("Venda Feita", tecnico.RealizarVenda());
    }

    @Test
    public void deveRetornarSemVendaParaCancelar() {
        Tecnico tecnico = new Tecnico();
        assertEquals("Não há vendas para cancelar", tecnico.CancelarVenda());
    }

    @Test
    public void deveRetornarVendaCancelada() {
        Tecnico tecnico = new Tecnico();
        tecnico.RealizarVenda();
        assertEquals("Venda Cancelada", tecnico.CancelarVenda());
    }

    @Test
    public void deveRetornarSalarioBase() {
        Tecnico tecnico = new Tecnico();
        assertEquals(1100.0f, tecnico.calcularSalario());
    }

    @Test
    public void deveRetornarSalarioAcrescidoDeVenda() {
        Tecnico tecnico = new Tecnico();
        tecnico.RealizarVenda();
        assertEquals(1320.0f, tecnico.calcularSalario());
    }

    @Test
    public void deveRetornarSalarioAcrescidoDeReparo() {
        Tecnico tecnico = new Tecnico();
        tecnico.RealizarReparo();
        assertEquals(1210.0f, tecnico.calcularSalario());
    }

    @Test
    public void deveRetornarSalarioAcrescidoDeVendaEReparo() {
        Tecnico tecnico = new Tecnico();
        tecnico.RealizarVenda();
        tecnico.RealizarReparo();
        assertEquals(1540.0f, tecnico.calcularSalario());
    }

    @Test
    public void deveRetornarSalarioAcrescidoDeReparoEDescontoDeVenda() {
        Tecnico tecnico = new Tecnico();
        tecnico.RealizarVenda();
        tecnico.RealizarReparo();
        tecnico.CancelarVenda();
        assertEquals(1210.0f, tecnico.calcularSalario());
    }

    @Test
    public void deveRetornarSalarioAcrescidoDeVendaEDescontoDeReparo() {
        Tecnico tecnico = new Tecnico();
        tecnico.RealizarVenda();
        tecnico.RealizarReparo();
        tecnico.CancelarReparo();
        assertEquals(1320.0f, tecnico.calcularSalario());
    }

    @Test
    public void deveRetornarSalarioDesconto() {
        Tecnico tecnico = new Tecnico();
        tecnico.RealizarVenda();
        tecnico.RealizarReparo();
        tecnico.CancelarVenda();
        tecnico.CancelarReparo();
        assertEquals(1100.0f, tecnico.calcularSalario());
    }
}
