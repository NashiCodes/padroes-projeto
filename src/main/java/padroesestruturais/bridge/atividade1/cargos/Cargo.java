package padroesestruturais.bridge.atividade1.cargos;

import padroesestruturais.bridge.atividade1.cargosparametros.Parametros;
import padroesestruturais.bridge.atividade1.servicos.IServico;

import java.util.HashMap;

public abstract class Cargo {
    protected HashMap<String, IServico> servicosPrestados;
    protected float salarioBase;

    public Cargo(String cargo) {
        this.servicosPrestados = new HashMap<>();
        var servicos = Parametros.getInstance().getServicos(cargo);
        for (var servico : servicos) {
            this.servicosPrestados.put(servico.getClass().getSimpleName(), servico);
        }

        this.salarioBase = Parametros.getInstance().getSalarioMinimo();
    }

    public float calcularSalario() {
        return this.salarioBase;
    }
}
