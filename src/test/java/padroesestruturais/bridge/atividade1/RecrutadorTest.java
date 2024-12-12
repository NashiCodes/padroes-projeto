package padroesestruturais.bridge.atividade1;

import org.junit.jupiter.api.Test;
import padroesestruturais.bridge.atividade1.cargos.Recrutador;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RecrutadorTest {

    @Test
    public void deveRetornarContratacaoEfetivada() {
        Recrutador recrutador = new Recrutador();
        assertEquals("Contratação efetivada", recrutador.RealizarContratacao());
    }

    @Test
    public void deveRetornarSemContratacaoParaCancelar() {
        Recrutador recrutador = new Recrutador();
        assertEquals("Não há contratações para cancelar", recrutador.CancelarContratacao());
    }

    @Test
    public void deveRetornarDemissaoRealizada() {
        Recrutador recrutador = new Recrutador();
        assertEquals("Demissão efetivada", recrutador.RealizarDemissao());
    }

    @Test
    public void deveRetornarSemDemissaoParaCancelar() {
        Recrutador recrutador = new Recrutador();
        assertEquals("Não há demissões para cancelar", recrutador.CancelarDemissao());
    }

    @Test
    public void deveRetornarSalarioBase() {
        Recrutador recrutador = new Recrutador();
        assertEquals(1100.0f, recrutador.calcularSalario());
    }

    @Test
    public void deveRetornarSalarioComAcrescimoDeContratacao() {
        Recrutador recrutador = new Recrutador();
        recrutador.RealizarContratacao();
        assertEquals(1760.0f, recrutador.calcularSalario());
    }

    @Test
    public void deveRetornarSalarioComAcrescimoDeDemissao() {
        Recrutador recrutador = new Recrutador();
        recrutador.RealizarDemissao();
        assertEquals(1100.0f, recrutador.calcularSalario());
    }

    @Test
    public void deveRetornarSalarioComAcrescimoDeContratacaoEDemissao() {
        Recrutador recrutador = new Recrutador();
        recrutador.RealizarContratacao();
        recrutador.RealizarDemissao();
        assertEquals(1650.0f, recrutador.calcularSalario());
    }

}
