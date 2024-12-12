package padroesestruturais.bridge.atividade1.cargos;

public class Tecnico extends Cargo {

    private int numReparos = 0;
    private int numVendas = 0;

    public Tecnico() {
        super("Técnico");
    }

    public String RealizarVenda() {
        this.numVendas++;
        return this.servicosPrestados.get("Venda").executar();
    }

    public String RealizarReparo() {
        this.numReparos++;
        return this.servicosPrestados.get("Reparo").executar();
    }

    public String CancelarVenda() {
        this.numVendas--;
        return this.servicosPrestados.get("Venda").cancelar();
    }

    public String CancelarReparo() {
        this.numReparos--;
        return this.servicosPrestados.get("Reparo").cancelar();
    }

    public float calcularSalario() {
        float comissaoVendas = this.numVendas * this.servicosPrestados.get("Venda").percentualAcrescimo();
        float comissaoReparos = this.numReparos * this.servicosPrestados.get("Reparo").percentualAcrescimo();
        return this.salarioBase * (1 + comissaoVendas + comissaoReparos);
    }
}
