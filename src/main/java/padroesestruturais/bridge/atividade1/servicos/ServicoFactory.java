package padroesestruturais.bridge.atividade1.servicos;

import java.util.ArrayList;
import java.util.List;

public class ServicoFactory {

    public static IServico obterServico(String servico) {
        Class<?> classe;
        Object objeto;
        try {
            classe = Class.forName("padroesestruturais.bridge.atividade1.servicos." + servico);
            objeto = classe.getDeclaredConstructor().newInstance();
        } catch (Exception ex) {
            throw new IllegalArgumentException("Serviço " + servico + " inexistente");
        }
        if (!(objeto instanceof IServico)) {
            throw new IllegalArgumentException("Serviço " + servico + " inválido");
        }
        return (IServico) objeto;
    }

    public static List<IServico> obterServicos(String[] servicos) {
        List<IServico> servicosList = new ArrayList<>();
        for (String servico : servicos) {
            servicosList.add(obterServico(servico));
        }
        return servicosList;
    }
}
