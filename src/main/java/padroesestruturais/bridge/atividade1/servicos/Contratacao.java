package padroesestruturais.bridge.atividade1.servicos;

public class Contratacao implements IServico {
    @Override
    public String executar() {
        return "Contratação efetivada";
    }

    @Override
    public String cancelar() {
        return "Contratação cancelada";
    }

    @Override
    public float percentualAcrescimo() {
        return 0.6f;
    }
}
