package padroesestruturais.bridge.atividade1.cargosparametros;

import padroesestruturais.bridge.atividade1.servicos.IServico;
import padroesestruturais.bridge.atividade1.servicos.ServicoFactory;

import java.util.HashMap;
import java.util.List;

public class Parametros {
    private static final Parametros instance = new Parametros();

    private final HashMap<String, List<IServico>> cargosServicos;


    private Parametros() {
        this.cargosServicos = new HashMap<>();
        this.cargosServicos.put("Recrutador", ServicoFactory.obterServicos(new String[]{"Contratacao", "Demissao"}));
        this.cargosServicos.put("Faxineira", ServicoFactory.obterServicos(new String[]{"Limpeza"}));
        this.cargosServicos.put("Tecnico", ServicoFactory.obterServicos(new String[]{"Reparo", "Venda"}));
        this.cargosServicos.put("Vendedor", ServicoFactory.obterServicos(new String[]{"Venda", "Troca"}));

    }

    public static Parametros getInstance() {
        return instance;
    }

    public List<IServico> getServicos(String cargo) {
        return cargosServicos.get(cargo);
    }

    public void setServico(String cargo, String servico) {
        cargosServicos.get(cargo).add(ServicoFactory.obterServico(servico));
    }

    public float getSalarioMinimo() {
        return 1100.0f;
    }

}
