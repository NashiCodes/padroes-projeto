package padroesestruturais.bridge.atividade1.servicos;

public class Demissao implements IServico {
    @Override
    public String executar() {
        return "Demissão efetivada";
    }

    @Override
    public String cancelar() {
        return "Demissão cancelada";
    }

    @Override
    public float percentualAcrescimo() {
        return 0;
    }
}
