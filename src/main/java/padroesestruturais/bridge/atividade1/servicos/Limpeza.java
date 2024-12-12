package padroesestruturais.bridge.atividade1.servicos;

public class Limpeza implements IServico {

    @Override
    public String executar() {
        return "Limpeza executada";
    }

    @Override
    public String cancelar() {
        return "Limpeza cancelada";
    }

    @Override
    public float percentualAcrescimo() {
        return 0.1f;
    }
}
