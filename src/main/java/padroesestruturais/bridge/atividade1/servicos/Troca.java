package padroesestruturais.bridge.atividade1.servicos;

public class Troca implements IServico {
    @Override
    public String executar() {
        return "Troca efetivada";
    }

    @Override
    public String cancelar() {
        return "Troca cancelada";
    }

    @Override
    public float percentualAcrescimo() {
        return 0.2f;
    }
}
