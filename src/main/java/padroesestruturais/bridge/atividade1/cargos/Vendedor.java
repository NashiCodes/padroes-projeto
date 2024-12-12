package padroesestruturais.bridge.atividade1.cargos;

public class Vendedor extends Cargo {
    private int numeroVendas = 0;
    private int numeroTrocas = 0;

    public Vendedor() {
        super("Vendedor");
    }

    public String RealizarVenda() {
        this.numeroVendas++;
        return this.servicosPrestados.get("Venda").executar();
    }

    public String CancelarVenda() {
        this.numeroVendas--;
        return this.servicosPrestados.get("Venda").cancelar();
    }

    public String RealizarTroca() {
        this.numeroTrocas++;
        return this.servicosPrestados.get("Troca").executar();
    }

    public String CancelarTroca() {
        this.numeroTrocas--;
        return this.servicosPrestados.get("Troca").cancelar();
    }

    public float calcularSalario() {
        float comissaoVendas = this.numeroVendas * this.servicosPrestados.get("Venda").percentualAcrescimo();
        float comissaoTrocas = this.numeroTrocas * this.servicosPrestados.get("Troca").percentualAcrescimo();
        return this.salarioBase * (1 + comissaoVendas + comissaoTrocas);
    }
}
