package padroesestruturais.bridge.atividade1.servicos;

public class Venda implements IServico {
    @Override
    public String executar() {
        return "Venda feita com sucesso";
    }

    @Override
    public String cancelar() {
        return "Venda cancelada";
    }

    @Override
    public float percentualAcrescimo() {
        return 0.5f;
    }
}
