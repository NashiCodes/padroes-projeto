package padroesestruturais.bridge.atividade1;

import org.junit.jupiter.api.Test;
import padroesestruturais.bridge.atividade1.cargos.Faxineira;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FaxineiraTest {

    @Test
    public void deveRetornarLimpezaExecutada() {
        Faxineira faxineira = new Faxineira();
        assertEquals("Limpeza executada", faxineira.Limpar());
    }

    @Test
    public void deveRetornarSemFaxinaParaCancelar() {
        Faxineira faxineira = new Faxineira();
        assertEquals("Não há faxinas para cancelar", faxineira.CancelarFaxina());
    }

    @Test
    public void deveRetornarLimpezaCancelada() {
        Faxineira faxineira = new Faxineira();
        faxineira.Limpar();
        assertEquals("Limpeza cancelada", faxineira.CancelarFaxina());
    }

    @Test
    public void deveRetornarSalarioBase() {
        Faxineira faxineira = new Faxineira();
        assertEquals(1100.0f, faxineira.calcularSalario());
    }

    @Test
    public void deveRetornarSalarioComAcrescimo() {
        Faxineira faxineira = new Faxineira();
        faxineira.Limpar();
        assertEquals(1210.0f, faxineira.calcularSalario());
    }

    @Test
    public void deveRetornarSalarioComAcrescimoEDesconto() {
        Faxineira faxineira = new Faxineira();
        faxineira.Limpar();
        faxineira.CancelarFaxina();
        assertEquals(1100.0f, faxineira.calcularSalario());
    }
}
