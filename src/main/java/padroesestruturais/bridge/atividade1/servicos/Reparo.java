package padroesestruturais.bridge.atividade1.servicos;

public class Reparo implements IServico {
    @Override
    public String executar() {
        return "Reparo Feito";
    }

    @Override
    public String cancelar() {
        return "Reparo Cancelado";
    }

    @Override
    public float percentualAcrescimo() {
        return 0;
    }
}
