package padroesestruturais.bridge.atividade1.cargos;

public class Faxineira extends Cargo {

    private int FaxinasFeitas = 0;

    public Faxineira() {
        super("Faxineira");
    }

    public String Limpar() {
        this.FaxinasFeitas++;
        return this.servicosPrestados.get("Limpeza").executar();
    }

    public String CancelarFaxina() {
        this.FaxinasFeitas--;
        return this.servicosPrestados.get("Limpeza").cancelar();
    }

    public float calcularSalario() {
        return this.salarioBase * (1 + (this.FaxinasFeitas * this.servicosPrestados.get("Limpeza").percentualAcrescimo()));
    }
}
